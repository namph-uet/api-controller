// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: newsfeed.proto

package web.api.rpc.newsfeed;

public interface PostOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Post)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string userId = 2;</code>
   */
  java.lang.String getUserId();
  /**
   * <code>string userId = 2;</code>
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>string content = 3;</code>
   */
  java.lang.String getContent();
  /**
   * <code>string content = 3;</code>
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <code>repeated .Comment comments = 4;</code>
   */
  java.util.List<web.api.rpc.newsfeed.Comment> 
      getCommentsList();
  /**
   * <code>repeated .Comment comments = 4;</code>
   */
  web.api.rpc.newsfeed.Comment getComments(int index);
  /**
   * <code>repeated .Comment comments = 4;</code>
   */
  int getCommentsCount();
  /**
   * <code>repeated .Comment comments = 4;</code>
   */
  java.util.List<? extends web.api.rpc.newsfeed.CommentOrBuilder> 
      getCommentsOrBuilderList();
  /**
   * <code>repeated .Comment comments = 4;</code>
   */
  web.api.rpc.newsfeed.CommentOrBuilder getCommentsOrBuilder(
      int index);

  /**
   * <code>repeated string likes = 5;</code>
   */
  java.util.List<java.lang.String>
      getLikesList();
  /**
   * <code>repeated string likes = 5;</code>
   */
  int getLikesCount();
  /**
   * <code>repeated string likes = 5;</code>
   */
  java.lang.String getLikes(int index);
  /**
   * <code>repeated string likes = 5;</code>
   */
  com.google.protobuf.ByteString
      getLikesBytes(int index);

  /**
   * <code>repeated .Share shares = 6;</code>
   */
  java.util.List<web.api.rpc.newsfeed.Share> 
      getSharesList();
  /**
   * <code>repeated .Share shares = 6;</code>
   */
  web.api.rpc.newsfeed.Share getShares(int index);
  /**
   * <code>repeated .Share shares = 6;</code>
   */
  int getSharesCount();
  /**
   * <code>repeated .Share shares = 6;</code>
   */
  java.util.List<? extends web.api.rpc.newsfeed.ShareOrBuilder> 
      getSharesOrBuilderList();
  /**
   * <code>repeated .Share shares = 6;</code>
   */
  web.api.rpc.newsfeed.ShareOrBuilder getSharesOrBuilder(
      int index);

  /**
   * <code>string images = 7;</code>
   */
  java.lang.String getImages();
  /**
   * <code>string images = 7;</code>
   */
  com.google.protobuf.ByteString
      getImagesBytes();

  /**
   * <code>string postTime = 8;</code>
   */
  java.lang.String getPostTime();
  /**
   * <code>string postTime = 8;</code>
   */
  com.google.protobuf.ByteString
      getPostTimeBytes();

  /**
   * <code>string userAvatar = 9;</code>
   */
  java.lang.String getUserAvatar();
  /**
   * <code>string userAvatar = 9;</code>
   */
  com.google.protobuf.ByteString
      getUserAvatarBytes();
}
