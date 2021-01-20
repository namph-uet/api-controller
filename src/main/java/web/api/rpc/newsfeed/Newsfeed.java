// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: newsfeed.proto

package web.api.rpc.newsfeed;

public final class Newsfeed {
  private Newsfeed() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetNewsFeedRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetNewsFeedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChildComment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChildComment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Comment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Comment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Share_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Share_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Post_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Post_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetNewsFeedResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetNewsFeedResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SaveNewPostResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SaveNewPostResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LikeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LikeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LikeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LikeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ShareRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ShareRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ShareResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ShareResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CommentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CommentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CommentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CommentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TagRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TagRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TagResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TagResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetNewsGroupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetNewsGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetNewsGroupResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetNewsGroupResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016newsfeed.proto\"$\n\022GetNewsFeedRequest\022\016" +
      "\n\006userId\030\001 \001(\t\"T\n\014ChildComment\022\016\n\006userId" +
      "\030\001 \001(\t\022\017\n\007content\030\002 \001(\t\022\016\n\006avatar\030\003 \001(\t\022" +
      "\023\n\013timeComment\030\004 \001(\t\"y\n\007Comment\022\016\n\006userI" +
      "d\030\001 \001(\t\022\017\n\007content\030\002 \001(\t\022\022\n\nuserAvatar\030\003" +
      " \001(\t\022\023\n\013timeComment\030\004 \001(\t\022$\n\rchildCommen" +
      "ts\030\005 \003(\0132\r.ChildComment\"G\n\005Share\022\n\n\002id\030\001" +
      " \001(\t\022\016\n\006userId\030\002 \001(\t\022\017\n\007content\030\003 \001(\t\022\021\n" +
      "\ttimeShare\030\004 \001(\t\"\254\001\n\004Post\022\n\n\002id\030\001 \001(\t\022\016\n" +
      "\006userId\030\002 \001(\t\022\017\n\007content\030\003 \001(\t\022\032\n\010commen" +
      "ts\030\004 \003(\0132\010.Comment\022\r\n\005likes\030\005 \003(\t\022\026\n\006sha" +
      "res\030\006 \003(\0132\006.Share\022\016\n\006images\030\007 \001(\t\022\020\n\010pos" +
      "tTime\030\010 \001(\t\022\022\n\nuserAvatar\030\t \001(\t\"+\n\023GetNe" +
      "wsFeedResponse\022\024\n\005posts\030\001 \003(\0132\005.Post\"%\n\023" +
      "SaveNewPostResponse\022\016\n\006status\030\001 \001(\t\"-\n\013L" +
      "ikeRequest\022\016\n\006userId\030\001 \001(\t\022\016\n\006postId\030\002 \001" +
      "(\t\"\036\n\014LikeResponse\022\016\n\006status\030\001 \001(\t\"?\n\014Sh" +
      "areRequest\022\016\n\006userId\030\001 \001(\t\022\016\n\006postId\030\002 \001" +
      "(\t\022\017\n\007content\030\003 \001(\t\"\037\n\rShareResponse\022\016\n\006" +
      "status\030\001 \001(\t\"A\n\016CommentRequest\022\016\n\006userId" +
      "\030\001 \001(\t\022\016\n\006postId\030\002 \001(\t\022\017\n\007content\030\003 \001(\t\"" +
      "!\n\017CommentResponse\022\016\n\006status\030\001 \001(\t\",\n\nTa" +
      "gRequest\022\016\n\006userId\030\001 \001(\t\022\016\n\006postId\030\002 \001(\t" +
      "\"\035\n\013TagResponse\022\016\n\006status\030\001 \001(\t\"%\n\023GetNe" +
      "wsGroupRequest\022\016\n\006userId\030\001 \001(\t\")\n\024GetNew" +
      "sGroupResponse\022\021\n\tnewsgroup\030\001 \001(\t2\321\002\n\017Ne" +
      "wsFeedService\0228\n\013getNewsFeed\022\023.GetNewsFe" +
      "edRequest\032\024.GetNewsFeedResponse\022*\n\013saveN" +
      "ewPost\022\005.Post\032\024.SaveNewPostResponse\022#\n\004l" +
      "ike\022\014.LikeRequest\032\r.LikeResponse\022&\n\005shar" +
      "e\022\r.ShareRequest\032\016.ShareResponse\022,\n\007comm" +
      "ent\022\017.CommentRequest\032\020.CommentResponse\022 " +
      "\n\003tag\022\013.TagRequest\032\014.TagResponse\022;\n\014getN" +
      "ewsGroup\022\024.GetNewsGroupRequest\032\025.GetNews" +
      "GroupResponseB\033\n\024web.api.rpc.newsfeedP\001\210" +
      "\001\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_GetNewsFeedRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetNewsFeedRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetNewsFeedRequest_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_ChildComment_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ChildComment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChildComment_descriptor,
        new java.lang.String[] { "UserId", "Content", "Avatar", "TimeComment", });
    internal_static_Comment_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Comment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Comment_descriptor,
        new java.lang.String[] { "UserId", "Content", "UserAvatar", "TimeComment", "ChildComments", });
    internal_static_Share_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Share_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Share_descriptor,
        new java.lang.String[] { "Id", "UserId", "Content", "TimeShare", });
    internal_static_Post_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Post_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Post_descriptor,
        new java.lang.String[] { "Id", "UserId", "Content", "Comments", "Likes", "Shares", "Images", "PostTime", "UserAvatar", });
    internal_static_GetNewsFeedResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_GetNewsFeedResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetNewsFeedResponse_descriptor,
        new java.lang.String[] { "Posts", });
    internal_static_SaveNewPostResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_SaveNewPostResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SaveNewPostResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_LikeRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_LikeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LikeRequest_descriptor,
        new java.lang.String[] { "UserId", "PostId", });
    internal_static_LikeResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_LikeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LikeResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_ShareRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_ShareRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ShareRequest_descriptor,
        new java.lang.String[] { "UserId", "PostId", "Content", });
    internal_static_ShareResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_ShareResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ShareResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_CommentRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_CommentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CommentRequest_descriptor,
        new java.lang.String[] { "UserId", "PostId", "Content", });
    internal_static_CommentResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_CommentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CommentResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_TagRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_TagRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TagRequest_descriptor,
        new java.lang.String[] { "UserId", "PostId", });
    internal_static_TagResponse_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_TagResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TagResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_GetNewsGroupRequest_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_GetNewsGroupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetNewsGroupRequest_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_GetNewsGroupResponse_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_GetNewsGroupResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetNewsGroupResponse_descriptor,
        new java.lang.String[] { "Newsgroup", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
