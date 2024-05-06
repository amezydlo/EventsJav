/*
 * Copyright 2015, Google Inc. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 *    * Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above
 * copyright notice, this list of conditions and the following disclaimer
 * in the documentation and/or other materials provided with the
 * distribution.
 *
 *    * Neither the name of Google Inc. nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package sr.grpc.client;

import events.grpc.gen.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;


public class grpcClient {
    private static final Logger logger = Logger.getLogger(grpcClient.class.getName());

    private final ManagedChannel channel;


    private final EventServiceGrpc.EventServiceBlockingStub eventServiceBlockingStub;


    /**
     * Construct client connecting to HelloWorld server at {@code host:port}.
     */
    public grpcClient(String remoteHost, int remotePort) {
        channel = ManagedChannelBuilder.forAddress(remoteHost, remotePort)
                .usePlaintext() // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid needing certificates.
                .build();


        eventServiceBlockingStub = EventServiceGrpc.newBlockingStub(channel);

    }


    public static void main(String[] args) throws Exception {
        grpcClient client = new grpcClient("127.0.0.5", 50051);
        client.test();
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }


    public void test() throws InterruptedException {
        String line = null;
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));


        int id = 0;
        String nick = "Ala";

        do {
            try {
                System.out.print("==> ");
                System.out.flush();
                line = in.readLine();
                switch (line) {
                    case "connect": {
                        Client request = Client.newBuilder().setNick(nick).build();
                        Client response = eventServiceBlockingStub.connectClient(request);

                        id = response.getId();
                        break;
                    }

                    case "subscribe":
                        NotificationRequest request = NotificationRequest
                                .newBuilder()
                                .setClient(Client
                                        .newBuilder()
                                        .setId(id)
                                        .setNick(nick)
                                        .build()
                                )
                                .addAllEvents(List.of(EventType.House, EventType.HeavyMetal))
                                .build();

                        new ResponseHandler(eventServiceBlockingStub, request).start();
                        break;
                    default:
                        System.out.println("???");
                        break;
                }
            } catch (java.io.IOException ex) {
                System.err.println(ex);
            }
        }
        while (!Objects.equals(line, "x"));

        shutdown();
    }
}


class ResponseHandler extends Thread {
    EventServiceGrpc.EventServiceBlockingStub eventServiceBlockingStub;
    NotificationRequest request;

    ResponseHandler(EventServiceGrpc.EventServiceBlockingStub eventServiceBlockingStub, NotificationRequest request) {
        this.eventServiceBlockingStub = eventServiceBlockingStub;
        this.request = request;
    }

    public void run() {


        Iterator<Notification> notifications;
        try {
            System.out.println("Client" + request.getClient() + " subscribes to events" + request.getEventsList());
            notifications = eventServiceBlockingStub.subscribe(request);
            while (notifications.hasNext()) {
                Notification notification = notifications.next();
                System.out.println("Current events: " + notification.getEventsList());
            }
            System.out.println("Events subscription ended");
        } catch (StatusRuntimeException ex) {
            System.err.println("RPC failed: " + ex.getStatus());
        }
    }
}

