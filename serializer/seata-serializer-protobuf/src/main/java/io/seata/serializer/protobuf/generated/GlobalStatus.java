// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: globalStatus.proto

package io.seata.serializer.protobuf.generated;

public final class GlobalStatus {
  private GlobalStatus() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\022globalStatus.proto\022\032io.seata.protocol." +
      "protobuf*\305\002\n\021GlobalStatusProto\022\013\n\007UnKnow" +
      "n\020\000\022\t\n\005Begin\020\001\022\016\n\nCommitting\020\002\022\022\n\016Commit" +
      "Retrying\020\003\022\017\n\013Rollbacking\020\004\022\024\n\020RollbackR" +
      "etrying\020\005\022\026\n\022TimeoutRollbacking\020\006\022\033\n\027Tim" +
      "eoutRollbackRetrying\020\007\022\023\n\017AsyncCommittin" +
      "g\020\010\022\r\n\tCommitted\020\t\022\020\n\014CommitFailed\020\n\022\016\n\n" +
      "Rollbacked\020\013\022\022\n\016RollbackFailed\020\014\022\025\n\021Time" +
      "outRollbacked\020\r\022\031\n\025TimeoutRollbackFailed" +
      "\020\016\022\014\n\010Finished\020\017B8\n&io.seata.serializer.",
      "protobuf.generatedB\014GlobalStatusP\001b\006prot" +
      "o3"
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
  }

  // @@protoc_insertion_point(outer_class_scope)
}
