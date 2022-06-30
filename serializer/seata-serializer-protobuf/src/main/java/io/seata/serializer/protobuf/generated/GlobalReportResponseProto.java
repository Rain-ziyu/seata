// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: globalReportResponse.proto

package io.seata.serializer.protobuf.generated;

/**
 * Protobuf type {@code io.seata.protocol.protobuf.GlobalReportResponseProto}
 */
public  final class GlobalReportResponseProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.seata.protocol.protobuf.GlobalReportResponseProto)
    GlobalReportResponseProtoOrBuilder {
  // Use GlobalReportResponseProto.newBuilder() to construct.
  private GlobalReportResponseProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GlobalReportResponseProto() {
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GlobalReportResponseProto(
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
            AbstractGlobalEndResponseProto.Builder subBuilder = null;
            if (abstractGlobalEndResponse_ != null) {
              subBuilder = abstractGlobalEndResponse_.toBuilder();
            }
            abstractGlobalEndResponse_ = input.readMessage(AbstractGlobalEndResponseProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(abstractGlobalEndResponse_);
              abstractGlobalEndResponse_ = subBuilder.buildPartial();
            }

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
    return GlobalReportResponse.internal_static_io_seata_protocol_protobuf_GlobalReportResponseProto_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GlobalReportResponse.internal_static_io_seata_protocol_protobuf_GlobalReportResponseProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            GlobalReportResponseProto.class, Builder.class);
  }

  public static final int ABSTRACTGLOBALENDRESPONSE_FIELD_NUMBER = 1;
  private AbstractGlobalEndResponseProto abstractGlobalEndResponse_;
  /**
   * <code>.io.seata.protocol.protobuf.AbstractGlobalEndResponseProto abstractGlobalEndResponse = 1;</code>
   */
  public boolean hasAbstractGlobalEndResponse() {
    return abstractGlobalEndResponse_ != null;
  }
  /**
   * <code>.io.seata.protocol.protobuf.AbstractGlobalEndResponseProto abstractGlobalEndResponse = 1;</code>
   */
  public AbstractGlobalEndResponseProto getAbstractGlobalEndResponse() {
    return abstractGlobalEndResponse_ == null ? AbstractGlobalEndResponseProto.getDefaultInstance() : abstractGlobalEndResponse_;
  }
  /**
   * <code>.io.seata.protocol.protobuf.AbstractGlobalEndResponseProto abstractGlobalEndResponse = 1;</code>
   */
  public AbstractGlobalEndResponseProtoOrBuilder getAbstractGlobalEndResponseOrBuilder() {
    return getAbstractGlobalEndResponse();
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
    if (abstractGlobalEndResponse_ != null) {
      output.writeMessage(1, getAbstractGlobalEndResponse());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (abstractGlobalEndResponse_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAbstractGlobalEndResponse());
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
    if (!(obj instanceof GlobalReportResponseProto)) {
      return super.equals(obj);
    }
    GlobalReportResponseProto other = (GlobalReportResponseProto) obj;

    boolean result = true;
    result = result && (hasAbstractGlobalEndResponse() == other.hasAbstractGlobalEndResponse());
    if (hasAbstractGlobalEndResponse()) {
      result = result && getAbstractGlobalEndResponse()
          .equals(other.getAbstractGlobalEndResponse());
    }
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasAbstractGlobalEndResponse()) {
      hash = (37 * hash) + ABSTRACTGLOBALENDRESPONSE_FIELD_NUMBER;
      hash = (53 * hash) + getAbstractGlobalEndResponse().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static GlobalReportResponseProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GlobalReportResponseProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GlobalReportResponseProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GlobalReportResponseProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GlobalReportResponseProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GlobalReportResponseProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GlobalReportResponseProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GlobalReportResponseProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static GlobalReportResponseProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static GlobalReportResponseProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static GlobalReportResponseProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GlobalReportResponseProto parseFrom(
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
  public static Builder newBuilder(GlobalReportResponseProto prototype) {
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
   * Protobuf type {@code io.seata.protocol.protobuf.GlobalReportResponseProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.seata.protocol.protobuf.GlobalReportResponseProto)
      GlobalReportResponseProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GlobalReportResponse.internal_static_io_seata_protocol_protobuf_GlobalReportResponseProto_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GlobalReportResponse.internal_static_io_seata_protocol_protobuf_GlobalReportResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GlobalReportResponseProto.class, Builder.class);
    }

    // Construct using io.seata.serializer.protobuf.generated.GlobalReportResponseProto.newBuilder()
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
      if (abstractGlobalEndResponseBuilder_ == null) {
        abstractGlobalEndResponse_ = null;
      } else {
        abstractGlobalEndResponse_ = null;
        abstractGlobalEndResponseBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GlobalReportResponse.internal_static_io_seata_protocol_protobuf_GlobalReportResponseProto_descriptor;
    }

    public GlobalReportResponseProto getDefaultInstanceForType() {
      return GlobalReportResponseProto.getDefaultInstance();
    }

    public GlobalReportResponseProto build() {
      GlobalReportResponseProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public GlobalReportResponseProto buildPartial() {
      GlobalReportResponseProto result = new GlobalReportResponseProto(this);
      if (abstractGlobalEndResponseBuilder_ == null) {
        result.abstractGlobalEndResponse_ = abstractGlobalEndResponse_;
      } else {
        result.abstractGlobalEndResponse_ = abstractGlobalEndResponseBuilder_.build();
      }
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
      if (other instanceof GlobalReportResponseProto) {
        return mergeFrom((GlobalReportResponseProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(GlobalReportResponseProto other) {
      if (other == GlobalReportResponseProto.getDefaultInstance()) return this;
      if (other.hasAbstractGlobalEndResponse()) {
        mergeAbstractGlobalEndResponse(other.getAbstractGlobalEndResponse());
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
      GlobalReportResponseProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (GlobalReportResponseProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private AbstractGlobalEndResponseProto abstractGlobalEndResponse_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        AbstractGlobalEndResponseProto, AbstractGlobalEndResponseProto.Builder, AbstractGlobalEndResponseProtoOrBuilder> abstractGlobalEndResponseBuilder_;
    /**
     * <code>.io.seata.protocol.protobuf.AbstractGlobalEndResponseProto abstractGlobalEndResponse = 1;</code>
     */
    public boolean hasAbstractGlobalEndResponse() {
      return abstractGlobalEndResponseBuilder_ != null || abstractGlobalEndResponse_ != null;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractGlobalEndResponseProto abstractGlobalEndResponse = 1;</code>
     */
    public AbstractGlobalEndResponseProto getAbstractGlobalEndResponse() {
      if (abstractGlobalEndResponseBuilder_ == null) {
        return abstractGlobalEndResponse_ == null ? AbstractGlobalEndResponseProto.getDefaultInstance() : abstractGlobalEndResponse_;
      } else {
        return abstractGlobalEndResponseBuilder_.getMessage();
      }
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractGlobalEndResponseProto abstractGlobalEndResponse = 1;</code>
     */
    public Builder setAbstractGlobalEndResponse(AbstractGlobalEndResponseProto value) {
      if (abstractGlobalEndResponseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        abstractGlobalEndResponse_ = value;
        onChanged();
      } else {
        abstractGlobalEndResponseBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractGlobalEndResponseProto abstractGlobalEndResponse = 1;</code>
     */
    public Builder setAbstractGlobalEndResponse(
        AbstractGlobalEndResponseProto.Builder builderForValue) {
      if (abstractGlobalEndResponseBuilder_ == null) {
        abstractGlobalEndResponse_ = builderForValue.build();
        onChanged();
      } else {
        abstractGlobalEndResponseBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractGlobalEndResponseProto abstractGlobalEndResponse = 1;</code>
     */
    public Builder mergeAbstractGlobalEndResponse(AbstractGlobalEndResponseProto value) {
      if (abstractGlobalEndResponseBuilder_ == null) {
        if (abstractGlobalEndResponse_ != null) {
          abstractGlobalEndResponse_ =
            AbstractGlobalEndResponseProto.newBuilder(abstractGlobalEndResponse_).mergeFrom(value).buildPartial();
        } else {
          abstractGlobalEndResponse_ = value;
        }
        onChanged();
      } else {
        abstractGlobalEndResponseBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractGlobalEndResponseProto abstractGlobalEndResponse = 1;</code>
     */
    public Builder clearAbstractGlobalEndResponse() {
      if (abstractGlobalEndResponseBuilder_ == null) {
        abstractGlobalEndResponse_ = null;
        onChanged();
      } else {
        abstractGlobalEndResponse_ = null;
        abstractGlobalEndResponseBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractGlobalEndResponseProto abstractGlobalEndResponse = 1;</code>
     */
    public AbstractGlobalEndResponseProto.Builder getAbstractGlobalEndResponseBuilder() {
      
      onChanged();
      return getAbstractGlobalEndResponseFieldBuilder().getBuilder();
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractGlobalEndResponseProto abstractGlobalEndResponse = 1;</code>
     */
    public AbstractGlobalEndResponseProtoOrBuilder getAbstractGlobalEndResponseOrBuilder() {
      if (abstractGlobalEndResponseBuilder_ != null) {
        return abstractGlobalEndResponseBuilder_.getMessageOrBuilder();
      } else {
        return abstractGlobalEndResponse_ == null ?
            AbstractGlobalEndResponseProto.getDefaultInstance() : abstractGlobalEndResponse_;
      }
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractGlobalEndResponseProto abstractGlobalEndResponse = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        AbstractGlobalEndResponseProto, AbstractGlobalEndResponseProto.Builder, AbstractGlobalEndResponseProtoOrBuilder>
        getAbstractGlobalEndResponseFieldBuilder() {
      if (abstractGlobalEndResponseBuilder_ == null) {
        abstractGlobalEndResponseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            AbstractGlobalEndResponseProto, AbstractGlobalEndResponseProto.Builder, AbstractGlobalEndResponseProtoOrBuilder>(
                getAbstractGlobalEndResponse(),
                getParentForChildren(),
                isClean());
        abstractGlobalEndResponse_ = null;
      }
      return abstractGlobalEndResponseBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:io.seata.protocol.protobuf.GlobalReportResponseProto)
  }

  // @@protoc_insertion_point(class_scope:io.seata.protocol.protobuf.GlobalReportResponseProto)
  private static final GlobalReportResponseProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new GlobalReportResponseProto();
  }

  public static GlobalReportResponseProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GlobalReportResponseProto>
      PARSER = new com.google.protobuf.AbstractParser<GlobalReportResponseProto>() {
    public GlobalReportResponseProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GlobalReportResponseProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GlobalReportResponseProto> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<GlobalReportResponseProto> getParserForType() {
    return PARSER;
  }

  public GlobalReportResponseProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

