// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: abstractResultMessage.proto

package io.seata.serializer.protobuf.generated;

public interface AbstractResultMessageProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.seata.protocol.protobuf.AbstractResultMessageProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.io.seata.protocol.protobuf.AbstractMessageProto AbstractMessage = 1;</code>
   */
  boolean hasAbstractMessage();
  /**
   * <code>.io.seata.protocol.protobuf.AbstractMessageProto AbstractMessage = 1;</code>
   */
  AbstractMessageProto getAbstractMessage();
  /**
   * <code>.io.seata.protocol.protobuf.AbstractMessageProto AbstractMessage = 1;</code>
   */
  AbstractMessageProtoOrBuilder getAbstractMessageOrBuilder();

  /**
   * <code>.io.seata.protocol.protobuf.ResultCodeProto resultCode = 2;</code>
   */
  int getResultCodeValue();
  /**
   * <code>.io.seata.protocol.protobuf.ResultCodeProto resultCode = 2;</code>
   */
  ResultCodeProto getResultCode();

  /**
   * <code>string msg = 3;</code>
   */
  String getMsg();
  /**
   * <code>string msg = 3;</code>
   */
  com.google.protobuf.ByteString
      getMsgBytes();
}
