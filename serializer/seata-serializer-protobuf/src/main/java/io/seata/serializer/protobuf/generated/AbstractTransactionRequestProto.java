// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: abstractTransactionRequest.proto

package io.seata.serializer.protobuf.generated;

/**
 * <pre>
 * PublishRequest is a publish request.
 * </pre>
 *
 * Protobuf type {@code io.seata.protocol.protobuf.AbstractTransactionRequestProto}
 */
public  final class AbstractTransactionRequestProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.seata.protocol.protobuf.AbstractTransactionRequestProto)
    AbstractTransactionRequestProtoOrBuilder {
  // Use AbstractTransactionRequestProto.newBuilder() to construct.
  private AbstractTransactionRequestProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AbstractTransactionRequestProto() {
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AbstractTransactionRequestProto(
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
            AbstractMessageProto.Builder subBuilder = null;
            if (abstractMessage_ != null) {
              subBuilder = abstractMessage_.toBuilder();
            }
            abstractMessage_ = input.readMessage(AbstractMessageProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(abstractMessage_);
              abstractMessage_ = subBuilder.buildPartial();
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
    return AbstractTransactionRequest.internal_static_io_seata_protocol_protobuf_AbstractTransactionRequestProto_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return AbstractTransactionRequest.internal_static_io_seata_protocol_protobuf_AbstractTransactionRequestProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            AbstractTransactionRequestProto.class, Builder.class);
  }

  public static final int ABSTRACTMESSAGE_FIELD_NUMBER = 1;
  private AbstractMessageProto abstractMessage_;
  /**
   * <code>.io.seata.protocol.protobuf.AbstractMessageProto abstractMessage = 1;</code>
   */
  public boolean hasAbstractMessage() {
    return abstractMessage_ != null;
  }
  /**
   * <code>.io.seata.protocol.protobuf.AbstractMessageProto abstractMessage = 1;</code>
   */
  public AbstractMessageProto getAbstractMessage() {
    return abstractMessage_ == null ? AbstractMessageProto.getDefaultInstance() : abstractMessage_;
  }
  /**
   * <code>.io.seata.protocol.protobuf.AbstractMessageProto abstractMessage = 1;</code>
   */
  public AbstractMessageProtoOrBuilder getAbstractMessageOrBuilder() {
    return getAbstractMessage();
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
    if (abstractMessage_ != null) {
      output.writeMessage(1, getAbstractMessage());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (abstractMessage_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAbstractMessage());
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
    if (!(obj instanceof AbstractTransactionRequestProto)) {
      return super.equals(obj);
    }
    AbstractTransactionRequestProto other = (AbstractTransactionRequestProto) obj;

    boolean result = true;
    result = result && (hasAbstractMessage() == other.hasAbstractMessage());
    if (hasAbstractMessage()) {
      result = result && getAbstractMessage()
          .equals(other.getAbstractMessage());
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
    if (hasAbstractMessage()) {
      hash = (37 * hash) + ABSTRACTMESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getAbstractMessage().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static AbstractTransactionRequestProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AbstractTransactionRequestProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AbstractTransactionRequestProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AbstractTransactionRequestProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AbstractTransactionRequestProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AbstractTransactionRequestProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AbstractTransactionRequestProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AbstractTransactionRequestProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static AbstractTransactionRequestProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static AbstractTransactionRequestProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static AbstractTransactionRequestProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AbstractTransactionRequestProto parseFrom(
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
  public static Builder newBuilder(AbstractTransactionRequestProto prototype) {
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
   * Protobuf type {@code io.seata.protocol.protobuf.AbstractTransactionRequestProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.seata.protocol.protobuf.AbstractTransactionRequestProto)
      AbstractTransactionRequestProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return AbstractTransactionRequest.internal_static_io_seata_protocol_protobuf_AbstractTransactionRequestProto_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return AbstractTransactionRequest.internal_static_io_seata_protocol_protobuf_AbstractTransactionRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AbstractTransactionRequestProto.class, Builder.class);
    }

    // Construct using io.seata.serializer.protobuf.generated.AbstractTransactionRequestProto.newBuilder()
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
      if (abstractMessageBuilder_ == null) {
        abstractMessage_ = null;
      } else {
        abstractMessage_ = null;
        abstractMessageBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return AbstractTransactionRequest.internal_static_io_seata_protocol_protobuf_AbstractTransactionRequestProto_descriptor;
    }

    public AbstractTransactionRequestProto getDefaultInstanceForType() {
      return AbstractTransactionRequestProto.getDefaultInstance();
    }

    public AbstractTransactionRequestProto build() {
      AbstractTransactionRequestProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public AbstractTransactionRequestProto buildPartial() {
      AbstractTransactionRequestProto result = new AbstractTransactionRequestProto(this);
      if (abstractMessageBuilder_ == null) {
        result.abstractMessage_ = abstractMessage_;
      } else {
        result.abstractMessage_ = abstractMessageBuilder_.build();
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
      if (other instanceof AbstractTransactionRequestProto) {
        return mergeFrom((AbstractTransactionRequestProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(AbstractTransactionRequestProto other) {
      if (other == AbstractTransactionRequestProto.getDefaultInstance()) return this;
      if (other.hasAbstractMessage()) {
        mergeAbstractMessage(other.getAbstractMessage());
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
      AbstractTransactionRequestProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (AbstractTransactionRequestProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private AbstractMessageProto abstractMessage_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        AbstractMessageProto, AbstractMessageProto.Builder, AbstractMessageProtoOrBuilder> abstractMessageBuilder_;
    /**
     * <code>.io.seata.protocol.protobuf.AbstractMessageProto abstractMessage = 1;</code>
     */
    public boolean hasAbstractMessage() {
      return abstractMessageBuilder_ != null || abstractMessage_ != null;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractMessageProto abstractMessage = 1;</code>
     */
    public AbstractMessageProto getAbstractMessage() {
      if (abstractMessageBuilder_ == null) {
        return abstractMessage_ == null ? AbstractMessageProto.getDefaultInstance() : abstractMessage_;
      } else {
        return abstractMessageBuilder_.getMessage();
      }
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractMessageProto abstractMessage = 1;</code>
     */
    public Builder setAbstractMessage(AbstractMessageProto value) {
      if (abstractMessageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        abstractMessage_ = value;
        onChanged();
      } else {
        abstractMessageBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractMessageProto abstractMessage = 1;</code>
     */
    public Builder setAbstractMessage(
        AbstractMessageProto.Builder builderForValue) {
      if (abstractMessageBuilder_ == null) {
        abstractMessage_ = builderForValue.build();
        onChanged();
      } else {
        abstractMessageBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractMessageProto abstractMessage = 1;</code>
     */
    public Builder mergeAbstractMessage(AbstractMessageProto value) {
      if (abstractMessageBuilder_ == null) {
        if (abstractMessage_ != null) {
          abstractMessage_ =
            AbstractMessageProto.newBuilder(abstractMessage_).mergeFrom(value).buildPartial();
        } else {
          abstractMessage_ = value;
        }
        onChanged();
      } else {
        abstractMessageBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractMessageProto abstractMessage = 1;</code>
     */
    public Builder clearAbstractMessage() {
      if (abstractMessageBuilder_ == null) {
        abstractMessage_ = null;
        onChanged();
      } else {
        abstractMessage_ = null;
        abstractMessageBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractMessageProto abstractMessage = 1;</code>
     */
    public AbstractMessageProto.Builder getAbstractMessageBuilder() {
      
      onChanged();
      return getAbstractMessageFieldBuilder().getBuilder();
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractMessageProto abstractMessage = 1;</code>
     */
    public AbstractMessageProtoOrBuilder getAbstractMessageOrBuilder() {
      if (abstractMessageBuilder_ != null) {
        return abstractMessageBuilder_.getMessageOrBuilder();
      } else {
        return abstractMessage_ == null ?
            AbstractMessageProto.getDefaultInstance() : abstractMessage_;
      }
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractMessageProto abstractMessage = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        AbstractMessageProto, AbstractMessageProto.Builder, AbstractMessageProtoOrBuilder>
        getAbstractMessageFieldBuilder() {
      if (abstractMessageBuilder_ == null) {
        abstractMessageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            AbstractMessageProto, AbstractMessageProto.Builder, AbstractMessageProtoOrBuilder>(
                getAbstractMessage(),
                getParentForChildren(),
                isClean());
        abstractMessage_ = null;
      }
      return abstractMessageBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:io.seata.protocol.protobuf.AbstractTransactionRequestProto)
  }

  // @@protoc_insertion_point(class_scope:io.seata.protocol.protobuf.AbstractTransactionRequestProto)
  private static final AbstractTransactionRequestProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AbstractTransactionRequestProto();
  }

  public static AbstractTransactionRequestProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AbstractTransactionRequestProto>
      PARSER = new com.google.protobuf.AbstractParser<AbstractTransactionRequestProto>() {
    public AbstractTransactionRequestProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AbstractTransactionRequestProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AbstractTransactionRequestProto> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<AbstractTransactionRequestProto> getParserForType() {
    return PARSER;
  }

  public AbstractTransactionRequestProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

