// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: undoLogDeleteRequest.proto

package io.seata.serializer.protobuf.generated;

/**
 * <pre>
 * PublishRequest is a publish request.
 * </pre>
 *
 * Protobuf type {@code io.seata.protocol.protobuf.UndoLogDeleteRequestProto}
 */
public  final class UndoLogDeleteRequestProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.seata.protocol.protobuf.UndoLogDeleteRequestProto)
    UndoLogDeleteRequestProtoOrBuilder {
  // Use UndoLogDeleteRequestProto.newBuilder() to construct.
  private UndoLogDeleteRequestProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UndoLogDeleteRequestProto() {
    resourceId_ = "";
    saveDays_ = 0;
    branchType_ = 0;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UndoLogDeleteRequestProto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            AbstractTransactionRequestProto.Builder subBuilder = null;
            if (abstractTransactionRequest_ != null) {
              subBuilder = abstractTransactionRequest_.toBuilder();
            }
            abstractTransactionRequest_ = input.readMessage(AbstractTransactionRequestProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(abstractTransactionRequest_);
              abstractTransactionRequest_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            resourceId_ = s;
            break;
          }
          case 24: {

            saveDays_ = input.readInt32();
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            branchType_ = rawValue;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return UndoLogDeleteRequest.internal_static_io_seata_protocol_protobuf_UndoLogDeleteRequestProto_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return UndoLogDeleteRequest.internal_static_io_seata_protocol_protobuf_UndoLogDeleteRequestProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            UndoLogDeleteRequestProto.class, Builder.class);
  }

  public static final int ABSTRACTTRANSACTIONREQUEST_FIELD_NUMBER = 1;
  private AbstractTransactionRequestProto abstractTransactionRequest_;
  /**
   * <code>.io.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
   */
  public boolean hasAbstractTransactionRequest() {
    return abstractTransactionRequest_ != null;
  }
  /**
   * <code>.io.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
   */
  public AbstractTransactionRequestProto getAbstractTransactionRequest() {
    return abstractTransactionRequest_ == null ? AbstractTransactionRequestProto.getDefaultInstance() : abstractTransactionRequest_;
  }
  /**
   * <code>.io.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
   */
  public AbstractTransactionRequestProtoOrBuilder getAbstractTransactionRequestOrBuilder() {
    return getAbstractTransactionRequest();
  }

  public static final int RESOURCEID_FIELD_NUMBER = 2;
  private volatile Object resourceId_;
  /**
   * <pre>
   **
   * The Resource id.
   * </pre>
   *
   * <code>string resourceId = 2;</code>
   */
  public String getResourceId() {
    Object ref = resourceId_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      resourceId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   **
   * The Resource id.
   * </pre>
   *
   * <code>string resourceId = 2;</code>
   */
  public com.google.protobuf.ByteString
      getResourceIdBytes() {
    Object ref = resourceId_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      resourceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SAVEDAYS_FIELD_NUMBER = 3;
  private int saveDays_;
  /**
   * <pre>
   **
   * The SaveDays data.
   * </pre>
   *
   * <code>int32 saveDays = 3;</code>
   */
  public int getSaveDays() {
    return saveDays_;
  }

  public static final int BRANCHTYPE_FIELD_NUMBER = 4;
  private int branchType_;
  /**
   * <pre>
   **
   * The Branch type.
   * </pre>
   *
   * <code>.io.seata.protocol.protobuf.BranchTypeProto branchType = 4;</code>
   */
  public int getBranchTypeValue() {
    return branchType_;
  }
  /**
   * <pre>
   **
   * The Branch type.
   * </pre>
   *
   * <code>.io.seata.protocol.protobuf.BranchTypeProto branchType = 4;</code>
   */
  public BranchTypeProto getBranchType() {
    BranchTypeProto result = BranchTypeProto.valueOf(branchType_);
    return result == null ? BranchTypeProto.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (abstractTransactionRequest_ != null) {
      output.writeMessage(1, getAbstractTransactionRequest());
    }
    if (!getResourceIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, resourceId_);
    }
    if (saveDays_ != 0) {
      output.writeInt32(3, saveDays_);
    }
    if (branchType_ != BranchTypeProto.AT.getNumber()) {
      output.writeEnum(4, branchType_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (abstractTransactionRequest_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAbstractTransactionRequest());
    }
    if (!getResourceIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, resourceId_);
    }
    if (saveDays_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, saveDays_);
    }
    if (branchType_ != BranchTypeProto.AT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, branchType_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof UndoLogDeleteRequestProto)) {
      return super.equals(obj);
    }
    UndoLogDeleteRequestProto other = (UndoLogDeleteRequestProto) obj;

    boolean result = true;
    result = result && (hasAbstractTransactionRequest() == other.hasAbstractTransactionRequest());
    if (hasAbstractTransactionRequest()) {
      result = result && getAbstractTransactionRequest()
          .equals(other.getAbstractTransactionRequest());
    }
    result = result && getResourceId()
        .equals(other.getResourceId());
    result = result && (getSaveDays()
        == other.getSaveDays());
    result = result && branchType_ == other.branchType_;
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasAbstractTransactionRequest()) {
      hash = (37 * hash) + ABSTRACTTRANSACTIONREQUEST_FIELD_NUMBER;
      hash = (53 * hash) + getAbstractTransactionRequest().hashCode();
    }
    hash = (37 * hash) + RESOURCEID_FIELD_NUMBER;
    hash = (53 * hash) + getResourceId().hashCode();
    hash = (37 * hash) + SAVEDAYS_FIELD_NUMBER;
    hash = (53 * hash) + getSaveDays();
    hash = (37 * hash) + BRANCHTYPE_FIELD_NUMBER;
    hash = (53 * hash) + branchType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static UndoLogDeleteRequestProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UndoLogDeleteRequestProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UndoLogDeleteRequestProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UndoLogDeleteRequestProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UndoLogDeleteRequestProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UndoLogDeleteRequestProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UndoLogDeleteRequestProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static UndoLogDeleteRequestProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static UndoLogDeleteRequestProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static UndoLogDeleteRequestProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static UndoLogDeleteRequestProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static UndoLogDeleteRequestProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(UndoLogDeleteRequestProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * PublishRequest is a publish request.
   * </pre>
   *
   * Protobuf type {@code io.seata.protocol.protobuf.UndoLogDeleteRequestProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.seata.protocol.protobuf.UndoLogDeleteRequestProto)
      UndoLogDeleteRequestProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return UndoLogDeleteRequest.internal_static_io_seata_protocol_protobuf_UndoLogDeleteRequestProto_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return UndoLogDeleteRequest.internal_static_io_seata_protocol_protobuf_UndoLogDeleteRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              UndoLogDeleteRequestProto.class, Builder.class);
    }

    // Construct using io.seata.serializer.protobuf.generated.UndoLogDeleteRequestProto.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (abstractTransactionRequestBuilder_ == null) {
        abstractTransactionRequest_ = null;
      } else {
        abstractTransactionRequest_ = null;
        abstractTransactionRequestBuilder_ = null;
      }
      resourceId_ = "";

      saveDays_ = 0;

      branchType_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return UndoLogDeleteRequest.internal_static_io_seata_protocol_protobuf_UndoLogDeleteRequestProto_descriptor;
    }

    public UndoLogDeleteRequestProto getDefaultInstanceForType() {
      return UndoLogDeleteRequestProto.getDefaultInstance();
    }

    public UndoLogDeleteRequestProto build() {
      UndoLogDeleteRequestProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public UndoLogDeleteRequestProto buildPartial() {
      UndoLogDeleteRequestProto result = new UndoLogDeleteRequestProto(this);
      if (abstractTransactionRequestBuilder_ == null) {
        result.abstractTransactionRequest_ = abstractTransactionRequest_;
      } else {
        result.abstractTransactionRequest_ = abstractTransactionRequestBuilder_.build();
      }
      result.resourceId_ = resourceId_;
      result.saveDays_ = saveDays_;
      result.branchType_ = branchType_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof UndoLogDeleteRequestProto) {
        return mergeFrom((UndoLogDeleteRequestProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(UndoLogDeleteRequestProto other) {
      if (other == UndoLogDeleteRequestProto.getDefaultInstance()) return this;
      if (other.hasAbstractTransactionRequest()) {
        mergeAbstractTransactionRequest(other.getAbstractTransactionRequest());
      }
      if (!other.getResourceId().isEmpty()) {
        resourceId_ = other.resourceId_;
        onChanged();
      }
      if (other.getSaveDays() != 0) {
        setSaveDays(other.getSaveDays());
      }
      if (other.branchType_ != 0) {
        setBranchTypeValue(other.getBranchTypeValue());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      UndoLogDeleteRequestProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (UndoLogDeleteRequestProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private AbstractTransactionRequestProto abstractTransactionRequest_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        AbstractTransactionRequestProto, AbstractTransactionRequestProto.Builder, AbstractTransactionRequestProtoOrBuilder> abstractTransactionRequestBuilder_;
    /**
     * <code>.io.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
     */
    public boolean hasAbstractTransactionRequest() {
      return abstractTransactionRequestBuilder_ != null || abstractTransactionRequest_ != null;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
     */
    public AbstractTransactionRequestProto getAbstractTransactionRequest() {
      if (abstractTransactionRequestBuilder_ == null) {
        return abstractTransactionRequest_ == null ? AbstractTransactionRequestProto.getDefaultInstance() : abstractTransactionRequest_;
      } else {
        return abstractTransactionRequestBuilder_.getMessage();
      }
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
     */
    public Builder setAbstractTransactionRequest(AbstractTransactionRequestProto value) {
      if (abstractTransactionRequestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        abstractTransactionRequest_ = value;
        onChanged();
      } else {
        abstractTransactionRequestBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
     */
    public Builder setAbstractTransactionRequest(
        AbstractTransactionRequestProto.Builder builderForValue) {
      if (abstractTransactionRequestBuilder_ == null) {
        abstractTransactionRequest_ = builderForValue.build();
        onChanged();
      } else {
        abstractTransactionRequestBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
     */
    public Builder mergeAbstractTransactionRequest(AbstractTransactionRequestProto value) {
      if (abstractTransactionRequestBuilder_ == null) {
        if (abstractTransactionRequest_ != null) {
          abstractTransactionRequest_ =
            AbstractTransactionRequestProto.newBuilder(abstractTransactionRequest_).mergeFrom(value).buildPartial();
        } else {
          abstractTransactionRequest_ = value;
        }
        onChanged();
      } else {
        abstractTransactionRequestBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
     */
    public Builder clearAbstractTransactionRequest() {
      if (abstractTransactionRequestBuilder_ == null) {
        abstractTransactionRequest_ = null;
        onChanged();
      } else {
        abstractTransactionRequest_ = null;
        abstractTransactionRequestBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
     */
    public AbstractTransactionRequestProto.Builder getAbstractTransactionRequestBuilder() {
      
      onChanged();
      return getAbstractTransactionRequestFieldBuilder().getBuilder();
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
     */
    public AbstractTransactionRequestProtoOrBuilder getAbstractTransactionRequestOrBuilder() {
      if (abstractTransactionRequestBuilder_ != null) {
        return abstractTransactionRequestBuilder_.getMessageOrBuilder();
      } else {
        return abstractTransactionRequest_ == null ?
            AbstractTransactionRequestProto.getDefaultInstance() : abstractTransactionRequest_;
      }
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        AbstractTransactionRequestProto, AbstractTransactionRequestProto.Builder, AbstractTransactionRequestProtoOrBuilder>
        getAbstractTransactionRequestFieldBuilder() {
      if (abstractTransactionRequestBuilder_ == null) {
        abstractTransactionRequestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            AbstractTransactionRequestProto, AbstractTransactionRequestProto.Builder, AbstractTransactionRequestProtoOrBuilder>(
                getAbstractTransactionRequest(),
                getParentForChildren(),
                isClean());
        abstractTransactionRequest_ = null;
      }
      return abstractTransactionRequestBuilder_;
    }

    private Object resourceId_ = "";
    /**
     * <pre>
     **
     * The Resource id.
     * </pre>
     *
     * <code>string resourceId = 2;</code>
     */
    public String getResourceId() {
      Object ref = resourceId_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        resourceId_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     **
     * The Resource id.
     * </pre>
     *
     * <code>string resourceId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getResourceIdBytes() {
      Object ref = resourceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        resourceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     **
     * The Resource id.
     * </pre>
     *
     * <code>string resourceId = 2;</code>
     */
    public Builder setResourceId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     **
     * The Resource id.
     * </pre>
     *
     * <code>string resourceId = 2;</code>
     */
    public Builder clearResourceId() {
      
      resourceId_ = getDefaultInstance().getResourceId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     **
     * The Resource id.
     * </pre>
     *
     * <code>string resourceId = 2;</code>
     */
    public Builder setResourceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceId_ = value;
      onChanged();
      return this;
    }

    private int saveDays_ ;
    /**
     * <pre>
     **
     * The SaveDays data.
     * </pre>
     *
     * <code>int32 saveDays = 3;</code>
     */
    public int getSaveDays() {
      return saveDays_;
    }
    /**
     * <pre>
     **
     * The SaveDays data.
     * </pre>
     *
     * <code>int32 saveDays = 3;</code>
     */
    public Builder setSaveDays(int value) {
      
      saveDays_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     **
     * The SaveDays data.
     * </pre>
     *
     * <code>int32 saveDays = 3;</code>
     */
    public Builder clearSaveDays() {
      
      saveDays_ = 0;
      onChanged();
      return this;
    }

    private int branchType_ = 0;
    /**
     * <pre>
     **
     * The Branch type.
     * </pre>
     *
     * <code>.io.seata.protocol.protobuf.BranchTypeProto branchType = 4;</code>
     */
    public int getBranchTypeValue() {
      return branchType_;
    }
    /**
     * <pre>
     **
     * The Branch type.
     * </pre>
     *
     * <code>.io.seata.protocol.protobuf.BranchTypeProto branchType = 4;</code>
     */
    public Builder setBranchTypeValue(int value) {
      branchType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     **
     * The Branch type.
     * </pre>
     *
     * <code>.io.seata.protocol.protobuf.BranchTypeProto branchType = 4;</code>
     */
    public BranchTypeProto getBranchType() {
      BranchTypeProto result = BranchTypeProto.valueOf(branchType_);
      return result == null ? BranchTypeProto.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     **
     * The Branch type.
     * </pre>
     *
     * <code>.io.seata.protocol.protobuf.BranchTypeProto branchType = 4;</code>
     */
    public Builder setBranchType(BranchTypeProto value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      branchType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     **
     * The Branch type.
     * </pre>
     *
     * <code>.io.seata.protocol.protobuf.BranchTypeProto branchType = 4;</code>
     */
    public Builder clearBranchType() {
      
      branchType_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:io.seata.protocol.protobuf.UndoLogDeleteRequestProto)
  }

  // @@protoc_insertion_point(class_scope:io.seata.protocol.protobuf.UndoLogDeleteRequestProto)
  private static final UndoLogDeleteRequestProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new UndoLogDeleteRequestProto();
  }

  public static UndoLogDeleteRequestProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UndoLogDeleteRequestProto>
      PARSER = new com.google.protobuf.AbstractParser<UndoLogDeleteRequestProto>() {
    public UndoLogDeleteRequestProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new UndoLogDeleteRequestProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UndoLogDeleteRequestProto> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<UndoLogDeleteRequestProto> getParserForType() {
    return PARSER;
  }

  public UndoLogDeleteRequestProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

