// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: abstractGlobalEndResponse.proto

package io.seata.serializer.protobuf.generated;

public interface AbstractGlobalEndResponseProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.seata.protocol.protobuf.AbstractGlobalEndResponseProto)
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
   * <code>.io.seata.protocol.protobuf.GlobalStatusProto globalStatus = 2;</code>
   */
  int getGlobalStatusValue();
  /**
   * <code>.io.seata.protocol.protobuf.GlobalStatusProto globalStatus = 2;</code>
   */
  GlobalStatusProto getGlobalStatus();
}
