// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: globalBeginResponse.proto

package io.seata.serializer.protobuf.generated;

public interface GlobalBeginResponseProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.seata.protocol.protobuf.GlobalBeginResponseProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.io.seata.protocol.protobuf.AbstractTransactionResponseProto abstractTransactionResponse = 1;</code>
   */
  boolean hasAbstractTransactionResponse();
  /**
   * <code>.io.seata.protocol.protobuf.AbstractTransactionResponseProto abstractTransactionResponse = 1;</code>
   */
  AbstractTransactionResponseProto getAbstractTransactionResponse();
  /**
   * <code>.io.seata.protocol.protobuf.AbstractTransactionResponseProto abstractTransactionResponse = 1;</code>
   */
  AbstractTransactionResponseProtoOrBuilder getAbstractTransactionResponseOrBuilder();

  /**
   * <code>string xid = 2;</code>
   */
  String getXid();
  /**
   * <code>string xid = 2;</code>
   */
  com.google.protobuf.ByteString
      getXidBytes();

  /**
   * <code>string extraData = 3;</code>
   */
  String getExtraData();
  /**
   * <code>string extraData = 3;</code>
   */
  com.google.protobuf.ByteString
      getExtraDataBytes();
}
