// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mergedWarpMessage.proto

package io.seata.serializer.protobuf.generated;

public interface MergedWarpMessageProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.seata.protocol.protobuf.MergedWarpMessageProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.io.seata.protocol.protobuf.AbstractMessageProto abstractMessage = 1;</code>
   */
  boolean hasAbstractMessage();
  /**
   * <code>.io.seata.protocol.protobuf.AbstractMessageProto abstractMessage = 1;</code>
   */
  AbstractMessageProto getAbstractMessage();
  /**
   * <code>.io.seata.protocol.protobuf.AbstractMessageProto abstractMessage = 1;</code>
   */
  AbstractMessageProtoOrBuilder getAbstractMessageOrBuilder();

  /**
   * <code>repeated .google.protobuf.Any msgs = 2;</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getMsgsList();
  /**
   * <code>repeated .google.protobuf.Any msgs = 2;</code>
   */
  com.google.protobuf.Any getMsgs(int index);
  /**
   * <code>repeated .google.protobuf.Any msgs = 2;</code>
   */
  int getMsgsCount();
  /**
   * <code>repeated .google.protobuf.Any msgs = 2;</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getMsgsOrBuilderList();
  /**
   * <code>repeated .google.protobuf.Any msgs = 2;</code>
   */
  com.google.protobuf.AnyOrBuilder getMsgsOrBuilder(
      int index);

  /**
   * <code>repeated int32 msgIds = 3;</code>
   */
  java.util.List<Integer> getMsgIdsList();
  /**
   * <code>repeated int32 msgIds = 3;</code>
   */
  int getMsgIdsCount();
  /**
   * <code>repeated int32 msgIds = 3;</code>
   */
  int getMsgIds(int index);
}