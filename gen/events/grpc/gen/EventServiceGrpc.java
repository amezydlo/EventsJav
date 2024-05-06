package events.grpc.gen;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: events.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EventServiceGrpc {

  private EventServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "events.EventService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<events.grpc.gen.NotificationRequest,
      events.grpc.gen.Notification> getSubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "subscribe",
      requestType = events.grpc.gen.NotificationRequest.class,
      responseType = events.grpc.gen.Notification.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<events.grpc.gen.NotificationRequest,
      events.grpc.gen.Notification> getSubscribeMethod() {
    io.grpc.MethodDescriptor<events.grpc.gen.NotificationRequest, events.grpc.gen.Notification> getSubscribeMethod;
    if ((getSubscribeMethod = EventServiceGrpc.getSubscribeMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getSubscribeMethod = EventServiceGrpc.getSubscribeMethod) == null) {
          EventServiceGrpc.getSubscribeMethod = getSubscribeMethod =
              io.grpc.MethodDescriptor.<events.grpc.gen.NotificationRequest, events.grpc.gen.Notification>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "subscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  events.grpc.gen.NotificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  events.grpc.gen.Notification.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("subscribe"))
              .build();
        }
      }
    }
    return getSubscribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<events.grpc.gen.NotificationRequest,
      events.grpc.gen.NotificationResponse> getUnsubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "unsubscribe",
      requestType = events.grpc.gen.NotificationRequest.class,
      responseType = events.grpc.gen.NotificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<events.grpc.gen.NotificationRequest,
      events.grpc.gen.NotificationResponse> getUnsubscribeMethod() {
    io.grpc.MethodDescriptor<events.grpc.gen.NotificationRequest, events.grpc.gen.NotificationResponse> getUnsubscribeMethod;
    if ((getUnsubscribeMethod = EventServiceGrpc.getUnsubscribeMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getUnsubscribeMethod = EventServiceGrpc.getUnsubscribeMethod) == null) {
          EventServiceGrpc.getUnsubscribeMethod = getUnsubscribeMethod =
              io.grpc.MethodDescriptor.<events.grpc.gen.NotificationRequest, events.grpc.gen.NotificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "unsubscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  events.grpc.gen.NotificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  events.grpc.gen.NotificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("unsubscribe"))
              .build();
        }
      }
    }
    return getUnsubscribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<events.grpc.gen.Client,
      events.grpc.gen.Client> getConnectClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "connectClient",
      requestType = events.grpc.gen.Client.class,
      responseType = events.grpc.gen.Client.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<events.grpc.gen.Client,
      events.grpc.gen.Client> getConnectClientMethod() {
    io.grpc.MethodDescriptor<events.grpc.gen.Client, events.grpc.gen.Client> getConnectClientMethod;
    if ((getConnectClientMethod = EventServiceGrpc.getConnectClientMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getConnectClientMethod = EventServiceGrpc.getConnectClientMethod) == null) {
          EventServiceGrpc.getConnectClientMethod = getConnectClientMethod =
              io.grpc.MethodDescriptor.<events.grpc.gen.Client, events.grpc.gen.Client>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "connectClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  events.grpc.gen.Client.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  events.grpc.gen.Client.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("connectClient"))
              .build();
        }
      }
    }
    return getConnectClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<events.grpc.gen.Client,
      events.grpc.gen.NotificationResponse> getDisconnectClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "disconnectClient",
      requestType = events.grpc.gen.Client.class,
      responseType = events.grpc.gen.NotificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<events.grpc.gen.Client,
      events.grpc.gen.NotificationResponse> getDisconnectClientMethod() {
    io.grpc.MethodDescriptor<events.grpc.gen.Client, events.grpc.gen.NotificationResponse> getDisconnectClientMethod;
    if ((getDisconnectClientMethod = EventServiceGrpc.getDisconnectClientMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getDisconnectClientMethod = EventServiceGrpc.getDisconnectClientMethod) == null) {
          EventServiceGrpc.getDisconnectClientMethod = getDisconnectClientMethod =
              io.grpc.MethodDescriptor.<events.grpc.gen.Client, events.grpc.gen.NotificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "disconnectClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  events.grpc.gen.Client.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  events.grpc.gen.NotificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("disconnectClient"))
              .build();
        }
      }
    }
    return getDisconnectClientMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceStub>() {
        @java.lang.Override
        public EventServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceStub(channel, callOptions);
        }
      };
    return EventServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceBlockingStub>() {
        @java.lang.Override
        public EventServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceBlockingStub(channel, callOptions);
        }
      };
    return EventServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceFutureStub>() {
        @java.lang.Override
        public EventServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceFutureStub(channel, callOptions);
        }
      };
    return EventServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void subscribe(events.grpc.gen.NotificationRequest request,
        io.grpc.stub.StreamObserver<events.grpc.gen.Notification> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeMethod(), responseObserver);
    }

    /**
     */
    default void unsubscribe(events.grpc.gen.NotificationRequest request,
        io.grpc.stub.StreamObserver<events.grpc.gen.NotificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnsubscribeMethod(), responseObserver);
    }

    /**
     */
    default void connectClient(events.grpc.gen.Client request,
        io.grpc.stub.StreamObserver<events.grpc.gen.Client> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConnectClientMethod(), responseObserver);
    }

    /**
     */
    default void disconnectClient(events.grpc.gen.Client request,
        io.grpc.stub.StreamObserver<events.grpc.gen.NotificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisconnectClientMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EventService.
   */
  public static abstract class EventServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EventServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EventService.
   */
  public static final class EventServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EventServiceStub> {
    private EventServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceStub(channel, callOptions);
    }

    /**
     */
    public void subscribe(events.grpc.gen.NotificationRequest request,
        io.grpc.stub.StreamObserver<events.grpc.gen.Notification> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unsubscribe(events.grpc.gen.NotificationRequest request,
        io.grpc.stub.StreamObserver<events.grpc.gen.NotificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnsubscribeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void connectClient(events.grpc.gen.Client request,
        io.grpc.stub.StreamObserver<events.grpc.gen.Client> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConnectClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disconnectClient(events.grpc.gen.Client request,
        io.grpc.stub.StreamObserver<events.grpc.gen.NotificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisconnectClientMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EventService.
   */
  public static final class EventServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EventServiceBlockingStub> {
    private EventServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<events.grpc.gen.Notification> subscribe(
        events.grpc.gen.NotificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeMethod(), getCallOptions(), request);
    }

    /**
     */
    public events.grpc.gen.NotificationResponse unsubscribe(events.grpc.gen.NotificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnsubscribeMethod(), getCallOptions(), request);
    }

    /**
     */
    public events.grpc.gen.Client connectClient(events.grpc.gen.Client request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConnectClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public events.grpc.gen.NotificationResponse disconnectClient(events.grpc.gen.Client request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisconnectClientMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EventService.
   */
  public static final class EventServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EventServiceFutureStub> {
    private EventServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<events.grpc.gen.NotificationResponse> unsubscribe(
        events.grpc.gen.NotificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnsubscribeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<events.grpc.gen.Client> connectClient(
        events.grpc.gen.Client request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConnectClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<events.grpc.gen.NotificationResponse> disconnectClient(
        events.grpc.gen.Client request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisconnectClientMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBSCRIBE = 0;
  private static final int METHODID_UNSUBSCRIBE = 1;
  private static final int METHODID_CONNECT_CLIENT = 2;
  private static final int METHODID_DISCONNECT_CLIENT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBSCRIBE:
          serviceImpl.subscribe((events.grpc.gen.NotificationRequest) request,
              (io.grpc.stub.StreamObserver<events.grpc.gen.Notification>) responseObserver);
          break;
        case METHODID_UNSUBSCRIBE:
          serviceImpl.unsubscribe((events.grpc.gen.NotificationRequest) request,
              (io.grpc.stub.StreamObserver<events.grpc.gen.NotificationResponse>) responseObserver);
          break;
        case METHODID_CONNECT_CLIENT:
          serviceImpl.connectClient((events.grpc.gen.Client) request,
              (io.grpc.stub.StreamObserver<events.grpc.gen.Client>) responseObserver);
          break;
        case METHODID_DISCONNECT_CLIENT:
          serviceImpl.disconnectClient((events.grpc.gen.Client) request,
              (io.grpc.stub.StreamObserver<events.grpc.gen.NotificationResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSubscribeMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              events.grpc.gen.NotificationRequest,
              events.grpc.gen.Notification>(
                service, METHODID_SUBSCRIBE)))
        .addMethod(
          getUnsubscribeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              events.grpc.gen.NotificationRequest,
              events.grpc.gen.NotificationResponse>(
                service, METHODID_UNSUBSCRIBE)))
        .addMethod(
          getConnectClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              events.grpc.gen.Client,
              events.grpc.gen.Client>(
                service, METHODID_CONNECT_CLIENT)))
        .addMethod(
          getDisconnectClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              events.grpc.gen.Client,
              events.grpc.gen.NotificationResponse>(
                service, METHODID_DISCONNECT_CLIENT)))
        .build();
  }

  private static abstract class EventServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return events.grpc.gen.EventsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EventService");
    }
  }

  private static final class EventServiceFileDescriptorSupplier
      extends EventServiceBaseDescriptorSupplier {
    EventServiceFileDescriptorSupplier() {}
  }

  private static final class EventServiceMethodDescriptorSupplier
      extends EventServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EventServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EventServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventServiceFileDescriptorSupplier())
              .addMethod(getSubscribeMethod())
              .addMethod(getUnsubscribeMethod())
              .addMethod(getConnectClientMethod())
              .addMethod(getDisconnectClientMethod())
              .build();
        }
      }
    }
    return result;
  }
}
