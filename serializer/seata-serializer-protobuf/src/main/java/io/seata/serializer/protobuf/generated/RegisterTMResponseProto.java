// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: registerTMResponse.proto

package io.seata.serializer.protobuf.generated;

/**
 * <pre>
 * PublishRequest is a publish request.
 * </pre>
 *
 * Protobuf type {@code io.seata.protocol.protobuf.RegisterTMResponseProto}
 */
public  final class RegisterTMResponseProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.seata.protocol.protobuf.RegisterTMResponseProto)
    RegisterTMResponseProtoOrBuilder {
  // Use RegisterTMResponseProto.newBuilder() to construct.
  private RegisterTMResponseProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegisterTMResponseProto() {
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private RegisterTMResponseProto(
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
            AbstractIdentifyResponseProto.Builder subBuilder = null;
            if (abstractIdentifyResponse_ != null) {
              subBuilder = abstractIdentifyResponse_.toBuilder();
            }
            abstractIdentifyResponse_ = input.readMessage(AbstractIdentifyResponseProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(abstractIdentifyResponse_);
              abstractIdentifyResponse_ = subBuilder.buildPartial();
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
    return RegisterTMResponse.internal_static_io_seata_protocol_protobuf_RegisterTMResponseProto_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return RegisterTMResponse.internal_static_io_seata_protocol_protobuf_RegisterTMResponseProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            RegisterTMResponseProto.class, Builder.class);
  }

  public static final int ABSTRACTIDENTIFYRESPONSE_FIELD_NUMBER = 1;
  private AbstractIdentifyResponseProto abstractIdentifyResponse_;
  /**
   * <code>.io.seata.protocol.protobuf.AbstractIdentifyResponseProto abstractIdentifyResponse = 1;</code>
   */
  public boolean hasAbstractIdentifyResponse() {
    return abstractIdentifyResponse_ != null;
  }
  /**
   * <code>.io.seata.protocol.protobuf.AbstractIdentifyResponseProto abstractIdentifyResponse = 1;</code>
   */
  public AbstractIdentifyResponseProto getAbstractIdentifyResponse() {
    return abstractIdentifyResponse_ == null ? AbstractIdentifyResponseProto.getDefaultInstance() : abstractIdentifyResponse_;
  }
  /**
   * <code>.io.seata.protocol.protobuf.AbstractIdentifyResponseProto abstractIdentifyResponse = 1;</code>
   */
  public AbstractIdentifyResponseProtoOrBuilder getAbstractIdentifyResponseOrBuilder() {
    return getAbstractIdentifyResponse();
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
    if (abstractIdentifyResponse_ != null) {
      output.writeMessage(1, getAbstractIdentifyResponse());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (abstractIdentifyResponse_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAbstractIdentifyResponse());
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
    if (!(obj instanceof RegisterTMResponseProto)) {
      return super.equals(obj);
    }
    RegisterTMResponseProto other = (RegisterTMResponseProto) obj;

    boolean result = true;
    result = result && (hasAbstractIdentifyResponse() == other.hasAbstractIdentifyResponse());
    if (hasAbstractIdentifyResponse()) {
      result = result && getAbstractIdentifyResponse()
          .equals(other.getAbstractIdentifyResponse());
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
    if (hasAbstractIdentifyResponse()) {
      hash = (37 * hash) + ABSTRACTIDENTIFYRESPONSE_FIELD_NUMBER;
      hash = (53 * hash) + getAbstractIdentifyResponse().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static RegisterTMResponseProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RegisterTMResponseProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RegisterTMResponseProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RegisterTMResponseProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RegisterTMResponseProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RegisterTMResponseProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RegisterTMResponseProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static RegisterTMResponseProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static RegisterTMResponseProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static RegisterTMResponseProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static RegisterTMResponseProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static RegisterTMResponseProto parseFrom(
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
  public static Builder newBuilder(RegisterTMResponseProto prototype) {
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
   * Protobuf type {@code io.seata.protocol.protobuf.RegisterTMResponseProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.seata.protocol.protobuf.RegisterTMResponseProto)
      RegisterTMResponseProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return RegisterTMResponse.internal_static_io_seata_protocol_protobuf_RegisterTMResponseProto_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RegisterTMResponse.internal_static_io_seata_protocol_protobuf_RegisterTMResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RegisterTMResponseProto.class, Builder.class);
    }

    // Construct using io.seata.serializer.protobuf.generated.RegisterTMResponseProto.newBuilder()
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
      if (abstractIdentifyResponseBuilder_ == null) {
        abstractIdentifyResponse_ = null;
      } else {
        abstractIdentifyResponse_ = null;
        abstractIdentifyResponseBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return RegisterTMResponse.internal_static_io_seata_protocol_protobuf_RegisterTMResponseProto_descriptor;
    }

    public RegisterTMResponseProto getDefaultInstanceForType() {
      return RegisterTMResponseProto.getDefaultInstance();
    }

    public RegisterTMResponseProto build() {
      RegisterTMResponseProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public RegisterTMResponseProto buildPartial() {
      RegisterTMResponseProto result = new RegisterTMResponseProto(this);
      if (abstractIdentifyResponseBuilder_ == null) {
        result.abstractIdentifyResponse_ = abstractIdentifyResponse_;
      } else {
        result.abstractIdentifyResponse_ = abstractIdentifyResponseBuilder_.build();
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
      if (other instanceof RegisterTMResponseProto) {
        return mergeFrom((RegisterTMResponseProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(RegisterTMResponseProto other) {
      if (other == RegisterTMResponseProto.getDefaultInstance()) return this;
      if (other.hasAbstractIdentifyResponse()) {
        mergeAbstractIdentifyResponse(other.getAbstractIdentifyResponse());
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
      RegisterTMResponseProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (RegisterTMResponseProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private AbstractIdentifyResponseProto abstractIdentifyResponse_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        AbstractIdentifyResponseProto, AbstractIdentifyResponseProto.Builder, AbstractIdentifyResponseProtoOrBuilder> abstractIdentifyResponseBuilder_;
    /**
     * <code>.io.seata.protocol.protobuf.AbstractIdentifyResponseProto abstractIdentifyResponse = 1;</code>
     */
    public boolean hasAbstractIdentifyResponse() {
      return abstractIdentifyResponseBuilder_ != null || abstractIdentifyResponse_ != null;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractIdentifyResponseProto abstractIdentifyResponse = 1;</code>
     */
    public AbstractIdentifyResponseProto getAbstractIdentifyResponse() {
      if (abstractIdentifyResponseBuilder_ == null) {
        return abstractIdentifyResponse_ == null ? AbstractIdentifyResponseProto.getDefaultInstance() : abstractIdentifyResponse_;
      } else {
        return abstractIdentifyResponseBuilder_.getMessage();
      }
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractIdentifyResponseProto abstractIdentifyResponse = 1;</code>
     */
    public Builder setAbstractIdentifyResponse(AbstractIdentifyResponseProto value) {
      if (abstractIdentifyResponseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        abstractIdentifyResponse_ = value;
        onChanged();
      } else {
        abstractIdentifyResponseBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractIdentifyResponseProto abstractIdentifyResponse = 1;</code>
     */
    public Builder setAbstractIdentifyResponse(
        AbstractIdentifyResponseProto.Builder builderForValue) {
      if (abstractIdentifyResponseBuilder_ == null) {
        abstractIdentifyResponse_ = builderForValue.build();
        onChanged();
      } else {
        abstractIdentifyResponseBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractIdentifyResponseProto abstractIdentifyResponse = 1;</code>
     */
    public Builder mergeAbstractIdentifyResponse(AbstractIdentifyResponseProto value) {
      if (abstractIdentifyResponseBuilder_ == null) {
        if (abstractIdentifyResponse_ != null) {
          abstractIdentifyResponse_ =
            AbstractIdentifyResponseProto.newBuilder(abstractIdentifyResponse_).mergeFrom(value).buildPartial();
        } else {
          abstractIdentifyResponse_ = value;
        }
        onChanged();
      } else {
        abstractIdentifyResponseBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractIdentifyResponseProto abstractIdentifyResponse = 1;</code>
     */
    public Builder clearAbstractIdentifyResponse() {
      if (abstractIdentifyResponseBuilder_ == null) {
        abstractIdentifyResponse_ = null;
        onChanged();
      } else {
        abstractIdentifyResponse_ = null;
        abstractIdentifyResponseBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractIdentifyResponseProto abstractIdentifyResponse = 1;</code>
     */
    public AbstractIdentifyResponseProto.Builder getAbstractIdentifyResponseBuilder() {
      
      onChanged();
      return getAbstractIdentifyResponseFieldBuilder().getBuilder();
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractIdentifyResponseProto abstractIdentifyResponse = 1;</code>
     */
    public AbstractIdentifyResponseProtoOrBuilder getAbstractIdentifyResponseOrBuilder() {
      if (abstractIdentifyResponseBuilder_ != null) {
        return abstractIdentifyResponseBuilder_.getMessageOrBuilder();
      } else {
        return abstractIdentifyResponse_ == null ?
            AbstractIdentifyResponseProto.getDefaultInstance() : abstractIdentifyResponse_;
      }
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractIdentifyResponseProto abstractIdentifyResponse = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        AbstractIdentifyResponseProto, AbstractIdentifyResponseProto.Builder, AbstractIdentifyResponseProtoOrBuilder>
        getAbstractIdentifyResponseFieldBuilder() {
      if (abstractIdentifyResponseBuilder_ == null) {
        abstractIdentifyResponseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            AbstractIdentifyResponseProto, AbstractIdentifyResponseProto.Builder, AbstractIdentifyResponseProtoOrBuilder>(
                getAbstractIdentifyResponse(),
                getParentForChildren(),
                isClean());
        abstractIdentifyResponse_ = null;
      }
      return abstractIdentifyResponseBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:io.seata.protocol.protobuf.RegisterTMResponseProto)
  }

  // @@protoc_insertion_point(class_scope:io.seata.protocol.protobuf.RegisterTMResponseProto)
  private static final RegisterTMResponseProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new RegisterTMResponseProto();
  }

  public static RegisterTMResponseProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegisterTMResponseProto>
      PARSER = new com.google.protobuf.AbstractParser<RegisterTMResponseProto>() {
    public RegisterTMResponseProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new RegisterTMResponseProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RegisterTMResponseProto> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<RegisterTMResponseProto> getParserForType() {
    return PARSER;
  }

  public RegisterTMResponseProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

