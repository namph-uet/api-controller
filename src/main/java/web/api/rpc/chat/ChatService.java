// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package web.api.rpc.chat;

/**
 * Protobuf service {@code ChatService}
 */
public  abstract class ChatService
    implements com.google.protobuf.Service {
  protected ChatService() {}

  public interface Interface {
    /**
     * <code>rpc getChannel(.GetChannelRequest) returns (.GetChannelResponse);</code>
     */
    public abstract void getChannel(
        com.google.protobuf.RpcController controller,
        web.api.rpc.chat.GetChannelRequest request,
        com.google.protobuf.RpcCallback<web.api.rpc.chat.GetChannelResponse> done);

    /**
     * <code>rpc submit(.ChatMessage) returns (.SubmitResponse);</code>
     */
    public abstract void submit(
        com.google.protobuf.RpcController controller,
        web.api.rpc.chat.ChatMessage request,
        com.google.protobuf.RpcCallback<web.api.rpc.chat.SubmitResponse> done);

  }

  public static com.google.protobuf.Service newReflectiveService(
      final Interface impl) {
    return new ChatService() {
      @java.lang.Override
      public  void getChannel(
          com.google.protobuf.RpcController controller,
          web.api.rpc.chat.GetChannelRequest request,
          com.google.protobuf.RpcCallback<web.api.rpc.chat.GetChannelResponse> done) {
        impl.getChannel(controller, request, done);
      }

      @java.lang.Override
      public  void submit(
          com.google.protobuf.RpcController controller,
          web.api.rpc.chat.ChatMessage request,
          com.google.protobuf.RpcCallback<web.api.rpc.chat.SubmitResponse> done) {
        impl.submit(controller, request, done);
      }

    };
  }

  public static com.google.protobuf.BlockingService
      newReflectiveBlockingService(final BlockingInterface impl) {
    return new com.google.protobuf.BlockingService() {
      public final com.google.protobuf.Descriptors.ServiceDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }

      public final com.google.protobuf.Message callBlockingMethod(
          com.google.protobuf.Descriptors.MethodDescriptor method,
          com.google.protobuf.RpcController controller,
          com.google.protobuf.Message request)
          throws com.google.protobuf.ServiceException {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.callBlockingMethod() given method descriptor for " +
            "wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return impl.getChannel(controller, (web.api.rpc.chat.GetChannelRequest)request);
          case 1:
            return impl.submit(controller, (web.api.rpc.chat.ChatMessage)request);
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getRequestPrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getRequestPrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return web.api.rpc.chat.GetChannelRequest.getDefaultInstance();
          case 1:
            return web.api.rpc.chat.ChatMessage.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getResponsePrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getResponsePrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return web.api.rpc.chat.GetChannelResponse.getDefaultInstance();
          case 1:
            return web.api.rpc.chat.SubmitResponse.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

    };
  }

  /**
   * <code>rpc getChannel(.GetChannelRequest) returns (.GetChannelResponse);</code>
   */
  public abstract void getChannel(
      com.google.protobuf.RpcController controller,
      web.api.rpc.chat.GetChannelRequest request,
      com.google.protobuf.RpcCallback<web.api.rpc.chat.GetChannelResponse> done);

  /**
   * <code>rpc submit(.ChatMessage) returns (.SubmitResponse);</code>
   */
  public abstract void submit(
      com.google.protobuf.RpcController controller,
      web.api.rpc.chat.ChatMessage request,
      com.google.protobuf.RpcCallback<web.api.rpc.chat.SubmitResponse> done);

  public static final
      com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptor() {
    return web.api.rpc.chat.Chat.getDescriptor().getServices().get(0);
  }
  public final com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }

  public final void callMethod(
      com.google.protobuf.Descriptors.MethodDescriptor method,
      com.google.protobuf.RpcController controller,
      com.google.protobuf.Message request,
      com.google.protobuf.RpcCallback<
        com.google.protobuf.Message> done) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.callMethod() given method descriptor for wrong " +
        "service type.");
    }
    switch(method.getIndex()) {
      case 0:
        this.getChannel(controller, (web.api.rpc.chat.GetChannelRequest)request,
          com.google.protobuf.RpcUtil.<web.api.rpc.chat.GetChannelResponse>specializeCallback(
            done));
        return;
      case 1:
        this.submit(controller, (web.api.rpc.chat.ChatMessage)request,
          com.google.protobuf.RpcUtil.<web.api.rpc.chat.SubmitResponse>specializeCallback(
            done));
        return;
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getRequestPrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getRequestPrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return web.api.rpc.chat.GetChannelRequest.getDefaultInstance();
      case 1:
        return web.api.rpc.chat.ChatMessage.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getResponsePrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getResponsePrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return web.api.rpc.chat.GetChannelResponse.getDefaultInstance();
      case 1:
        return web.api.rpc.chat.SubmitResponse.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public static Stub newStub(
      com.google.protobuf.RpcChannel channel) {
    return new Stub(channel);
  }

  public static final class Stub extends web.api.rpc.chat.ChatService implements Interface {
    private Stub(com.google.protobuf.RpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.RpcChannel channel;

    public com.google.protobuf.RpcChannel getChannel() {
      return channel;
    }

    public  void getChannel(
        com.google.protobuf.RpcController controller,
        web.api.rpc.chat.GetChannelRequest request,
        com.google.protobuf.RpcCallback<web.api.rpc.chat.GetChannelResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        web.api.rpc.chat.GetChannelResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          web.api.rpc.chat.GetChannelResponse.class,
          web.api.rpc.chat.GetChannelResponse.getDefaultInstance()));
    }

    public  void submit(
        com.google.protobuf.RpcController controller,
        web.api.rpc.chat.ChatMessage request,
        com.google.protobuf.RpcCallback<web.api.rpc.chat.SubmitResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(1),
        controller,
        request,
        web.api.rpc.chat.SubmitResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          web.api.rpc.chat.SubmitResponse.class,
          web.api.rpc.chat.SubmitResponse.getDefaultInstance()));
    }
  }

  public static BlockingInterface newBlockingStub(
      com.google.protobuf.BlockingRpcChannel channel) {
    return new BlockingStub(channel);
  }

  public interface BlockingInterface {
    public web.api.rpc.chat.GetChannelResponse getChannel(
        com.google.protobuf.RpcController controller,
        web.api.rpc.chat.GetChannelRequest request)
        throws com.google.protobuf.ServiceException;

    public web.api.rpc.chat.SubmitResponse submit(
        com.google.protobuf.RpcController controller,
        web.api.rpc.chat.ChatMessage request)
        throws com.google.protobuf.ServiceException;
  }

  private static final class BlockingStub implements BlockingInterface {
    private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.BlockingRpcChannel channel;

    public web.api.rpc.chat.GetChannelResponse getChannel(
        com.google.protobuf.RpcController controller,
        web.api.rpc.chat.GetChannelRequest request)
        throws com.google.protobuf.ServiceException {
      return (web.api.rpc.chat.GetChannelResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        web.api.rpc.chat.GetChannelResponse.getDefaultInstance());
    }


    public web.api.rpc.chat.SubmitResponse submit(
        com.google.protobuf.RpcController controller,
        web.api.rpc.chat.ChatMessage request)
        throws com.google.protobuf.ServiceException {
      return (web.api.rpc.chat.SubmitResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(1),
        controller,
        request,
        web.api.rpc.chat.SubmitResponse.getDefaultInstance());
    }

  }

  // @@protoc_insertion_point(class_scope:ChatService)
}

