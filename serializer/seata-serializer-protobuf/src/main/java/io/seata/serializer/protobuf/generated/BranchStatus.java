// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: branchStatus.proto

package io.seata.serializer.protobuf.generated;

public final class BranchStatus {
  private BranchStatus() {}
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
      "\n\022branchStatus.proto\022\032io.seata.protocol." +
      "protobuf*\274\002\n\021BranchStatusProto\022\014\n\010BUnkno" +
      "wn\020\000\022\016\n\nRegistered\020\001\022\021\n\rPhaseOne_Done\020\002\022" +
      "\023\n\017PhaseOne_Failed\020\003\022\024\n\020PhaseOne_Timeout" +
      "\020\004\022\026\n\022PhaseTwo_Committed\020\005\022#\n\037PhaseTwo_C" +
      "ommitFailed_Retryable\020\006\022%\n!PhaseTwo_Comm" +
      "itFailed_Unretryable\020\007\022\027\n\023PhaseTwo_Rollb" +
      "acked\020\010\022%\n!PhaseTwo_RollbackFailed_Retry" +
      "able\020\t\022\'\n#PhaseTwo_RollbackFailed_Unretr" +
      "yable\020\nB8\n&io.seata.serializer.protobuf.",
      "generatedB\014BranchStatusP\001b\006proto3"
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
