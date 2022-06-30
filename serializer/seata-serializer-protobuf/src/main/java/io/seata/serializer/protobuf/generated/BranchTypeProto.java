// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: branchType.proto

package io.seata.serializer.protobuf.generated;

/**
 * <pre>
 * PublishRequest is a publish request.
 * </pre>
 *
 * Protobuf enum {@code io.seata.protocol.protobuf.BranchTypeProto}
 */
public enum BranchTypeProto
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>AT = 0;</code>
   */
  AT(0),
  /**
   * <code>TCC = 1;</code>
   */
  TCC(1),
  /**
   * <code>SAGA = 2;</code>
   */
  SAGA(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>AT = 0;</code>
   */
  public static final int AT_VALUE = 0;
  /**
   * <code>TCC = 1;</code>
   */
  public static final int TCC_VALUE = 1;
  /**
   * <code>SAGA = 2;</code>
   */
  public static final int SAGA_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @Deprecated
  public static BranchTypeProto valueOf(int value) {
    return forNumber(value);
  }

  public static BranchTypeProto forNumber(int value) {
    switch (value) {
      case 0: return AT;
      case 1: return TCC;
      case 2: return SAGA;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BranchTypeProto>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BranchTypeProto> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BranchTypeProto>() {
          public BranchTypeProto findValueByNumber(int number) {
            return BranchTypeProto.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return BranchType.getDescriptor().getEnumTypes().get(0);
  }

  private static final BranchTypeProto[] VALUES = values();

  public static BranchTypeProto valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private BranchTypeProto(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:io.seata.protocol.protobuf.BranchTypeProto)
}

