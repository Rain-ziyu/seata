// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: globalBeginRequest.proto

package io.seata.serializer.protobuf.generated;

public interface GlobalBeginRequestProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.seata.protocol.protobuf.GlobalBeginRequestProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.io.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
   */
  boolean hasAbstractTransactionRequest();
  /**
   * <code>.io.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
   */
  AbstractTransactionRequestProto getAbstractTransactionRequest();
  /**
   * <code>.io.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
   */
  AbstractTransactionRequestProtoOrBuilder getAbstractTransactionRequestOrBuilder();

  /**
   * <code>int32 timeout = 2;</code>
   */
  int getTimeout();

  /**
   * <code>string transactionName = 3;</code>
   */
  String getTransactionName();
  /**
   * <code>string transactionName = 3;</code>
   */
  com.google.protobuf.ByteString
      getTransactionNameBytes();
}
