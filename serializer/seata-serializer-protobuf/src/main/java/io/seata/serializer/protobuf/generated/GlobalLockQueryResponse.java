// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: globalLockQueryResponse.proto

package io.seata.serializer.protobuf.generated;

public final class GlobalLockQueryResponse {
  private GlobalLockQueryResponse() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_seata_protocol_protobuf_GlobalLockQueryResponseProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_seata_protocol_protobuf_GlobalLockQueryResponseProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\035globalLockQueryResponse.proto\022\032io.seat" +
      "a.protocol.protobuf\032!abstractTransaction" +
      "Response.proto\"\223\001\n\034GlobalLockQueryRespon" +
      "seProto\022a\n\033abstractTransactionResponse\030\001" +
      " \001(\0132<.io.seata.protocol.protobuf.Abstra" +
      "ctTransactionResponseProto\022\020\n\010lockable\030\002" +
      " \001(\010BC\n&io.seata.serializer.protobuf.gen" +
      "eratedB\027GlobalLockQueryResponseP\001b\006proto" +
      "3"
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
          AbstractTransactionResponse.getDescriptor(),
        }, assigner);
    internal_static_io_seata_protocol_protobuf_GlobalLockQueryResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_seata_protocol_protobuf_GlobalLockQueryResponseProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_seata_protocol_protobuf_GlobalLockQueryResponseProto_descriptor,
        new String[] { "AbstractTransactionResponse", "Lockable", });
    AbstractTransactionResponse.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
