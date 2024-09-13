// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: archive.proto

package org.qubic.archiver.proto;

/**
 * Protobuf type {@code qubic.archiver.archive.pb.GetTickDataResponse}
 */
public final class GetTickDataResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:qubic.archiver.archive.pb.GetTickDataResponse)
    GetTickDataResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetTickDataResponse.newBuilder() to construct.
  private GetTickDataResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetTickDataResponse() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetTickDataResponse();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetTickDataResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            TickData.Builder subBuilder = null;
            if (tickData_ != null) {
              subBuilder = tickData_.toBuilder();
            }
            tickData_ = input.readMessage(TickData.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(tickData_);
              tickData_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return QubicArchiverProtos.internal_static_qubic_archiver_archive_pb_GetTickDataResponse_descriptor;
  }

  @Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return QubicArchiverProtos.internal_static_qubic_archiver_archive_pb_GetTickDataResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            GetTickDataResponse.class, Builder.class);
  }

  public static final int TICK_DATA_FIELD_NUMBER = 1;
  private TickData tickData_;
  /**
   * <code>.qubic.archiver.archive.pb.TickData tick_data = 1;</code>
   * @return Whether the tickData field is set.
   */
  @Override
  public boolean hasTickData() {
    return tickData_ != null;
  }
  /**
   * <code>.qubic.archiver.archive.pb.TickData tick_data = 1;</code>
   * @return The tickData.
   */
  @Override
  public TickData getTickData() {
    return tickData_ == null ? TickData.getDefaultInstance() : tickData_;
  }
  /**
   * <code>.qubic.archiver.archive.pb.TickData tick_data = 1;</code>
   */
  @Override
  public TickDataOrBuilder getTickDataOrBuilder() {
    return getTickData();
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (tickData_ != null) {
      output.writeMessage(1, getTickData());
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tickData_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTickData());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof GetTickDataResponse)) {
      return super.equals(obj);
    }
    GetTickDataResponse other = (GetTickDataResponse) obj;

    if (hasTickData() != other.hasTickData()) return false;
    if (hasTickData()) {
      if (!getTickData()
          .equals(other.getTickData())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasTickData()) {
      hash = (37 * hash) + TICK_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getTickData().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static GetTickDataResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetTickDataResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetTickDataResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetTickDataResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetTickDataResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetTickDataResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetTickDataResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GetTickDataResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static GetTickDataResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static GetTickDataResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static GetTickDataResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GetTickDataResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(GetTickDataResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code qubic.archiver.archive.pb.GetTickDataResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:qubic.archiver.archive.pb.GetTickDataResponse)
      GetTickDataResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return QubicArchiverProtos.internal_static_qubic_archiver_archive_pb_GetTickDataResponse_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return QubicArchiverProtos.internal_static_qubic_archiver_archive_pb_GetTickDataResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GetTickDataResponse.class, Builder.class);
    }

    // Construct using org.qubic.archiver.proto.GetTickDataResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      if (tickDataBuilder_ == null) {
        tickData_ = null;
      } else {
        tickData_ = null;
        tickDataBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return QubicArchiverProtos.internal_static_qubic_archiver_archive_pb_GetTickDataResponse_descriptor;
    }

    @Override
    public GetTickDataResponse getDefaultInstanceForType() {
      return GetTickDataResponse.getDefaultInstance();
    }

    @Override
    public GetTickDataResponse build() {
      GetTickDataResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public GetTickDataResponse buildPartial() {
      GetTickDataResponse result = new GetTickDataResponse(this);
      if (tickDataBuilder_ == null) {
        result.tickData_ = tickData_;
      } else {
        result.tickData_ = tickDataBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof GetTickDataResponse) {
        return mergeFrom((GetTickDataResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(GetTickDataResponse other) {
      if (other == GetTickDataResponse.getDefaultInstance()) return this;
      if (other.hasTickData()) {
        mergeTickData(other.getTickData());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      GetTickDataResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (GetTickDataResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private TickData tickData_;
    private com.google.protobuf.SingleFieldBuilderV3<
        TickData, TickData.Builder, TickDataOrBuilder> tickDataBuilder_;
    /**
     * <code>.qubic.archiver.archive.pb.TickData tick_data = 1;</code>
     * @return Whether the tickData field is set.
     */
    public boolean hasTickData() {
      return tickDataBuilder_ != null || tickData_ != null;
    }
    /**
     * <code>.qubic.archiver.archive.pb.TickData tick_data = 1;</code>
     * @return The tickData.
     */
    public TickData getTickData() {
      if (tickDataBuilder_ == null) {
        return tickData_ == null ? TickData.getDefaultInstance() : tickData_;
      } else {
        return tickDataBuilder_.getMessage();
      }
    }
    /**
     * <code>.qubic.archiver.archive.pb.TickData tick_data = 1;</code>
     */
    public Builder setTickData(TickData value) {
      if (tickDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tickData_ = value;
        onChanged();
      } else {
        tickDataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.qubic.archiver.archive.pb.TickData tick_data = 1;</code>
     */
    public Builder setTickData(
        TickData.Builder builderForValue) {
      if (tickDataBuilder_ == null) {
        tickData_ = builderForValue.build();
        onChanged();
      } else {
        tickDataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.qubic.archiver.archive.pb.TickData tick_data = 1;</code>
     */
    public Builder mergeTickData(TickData value) {
      if (tickDataBuilder_ == null) {
        if (tickData_ != null) {
          tickData_ =
            TickData.newBuilder(tickData_).mergeFrom(value).buildPartial();
        } else {
          tickData_ = value;
        }
        onChanged();
      } else {
        tickDataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.qubic.archiver.archive.pb.TickData tick_data = 1;</code>
     */
    public Builder clearTickData() {
      if (tickDataBuilder_ == null) {
        tickData_ = null;
        onChanged();
      } else {
        tickData_ = null;
        tickDataBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.qubic.archiver.archive.pb.TickData tick_data = 1;</code>
     */
    public TickData.Builder getTickDataBuilder() {
      
      onChanged();
      return getTickDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.qubic.archiver.archive.pb.TickData tick_data = 1;</code>
     */
    public TickDataOrBuilder getTickDataOrBuilder() {
      if (tickDataBuilder_ != null) {
        return tickDataBuilder_.getMessageOrBuilder();
      } else {
        return tickData_ == null ?
            TickData.getDefaultInstance() : tickData_;
      }
    }
    /**
     * <code>.qubic.archiver.archive.pb.TickData tick_data = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        TickData, TickData.Builder, TickDataOrBuilder>
        getTickDataFieldBuilder() {
      if (tickDataBuilder_ == null) {
        tickDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            TickData, TickData.Builder, TickDataOrBuilder>(
                getTickData(),
                getParentForChildren(),
                isClean());
        tickData_ = null;
      }
      return tickDataBuilder_;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:qubic.archiver.archive.pb.GetTickDataResponse)
  }

  // @@protoc_insertion_point(class_scope:qubic.archiver.archive.pb.GetTickDataResponse)
  private static final GetTickDataResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new GetTickDataResponse();
  }

  public static GetTickDataResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetTickDataResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetTickDataResponse>() {
    @Override
    public GetTickDataResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetTickDataResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetTickDataResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<GetTickDataResponse> getParserForType() {
    return PARSER;
  }

  @Override
  public GetTickDataResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

