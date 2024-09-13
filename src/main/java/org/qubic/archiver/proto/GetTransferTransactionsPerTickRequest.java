// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: archive.proto

package org.qubic.archiver.proto;

/**
 * Protobuf type {@code qubic.archiver.archive.pb.GetTransferTransactionsPerTickRequest}
 */
public final class GetTransferTransactionsPerTickRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:qubic.archiver.archive.pb.GetTransferTransactionsPerTickRequest)
    GetTransferTransactionsPerTickRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetTransferTransactionsPerTickRequest.newBuilder() to construct.
  private GetTransferTransactionsPerTickRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetTransferTransactionsPerTickRequest() {
    identity_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetTransferTransactionsPerTickRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetTransferTransactionsPerTickRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
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
            java.lang.String s = input.readStringRequireUtf8();

            identity_ = s;
            break;
          }
          case 16: {

            startTick_ = input.readUInt32();
            break;
          }
          case 24: {

            endTick_ = input.readUInt32();
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
    return org.qubic.archiver.proto.QubicArchiverProtos.internal_static_qubic_archiver_archive_pb_GetTransferTransactionsPerTickRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.qubic.archiver.proto.QubicArchiverProtos.internal_static_qubic_archiver_archive_pb_GetTransferTransactionsPerTickRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest.class, org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest.Builder.class);
  }

  public static final int IDENTITY_FIELD_NUMBER = 1;
  private volatile java.lang.Object identity_;
  /**
   * <code>string identity = 1;</code>
   * @return The identity.
   */
  @java.lang.Override
  public java.lang.String getIdentity() {
    java.lang.Object ref = identity_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      identity_ = s;
      return s;
    }
  }
  /**
   * <code>string identity = 1;</code>
   * @return The bytes for identity.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdentityBytes() {
    java.lang.Object ref = identity_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      identity_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int START_TICK_FIELD_NUMBER = 2;
  private int startTick_;
  /**
   * <code>uint32 start_tick = 2;</code>
   * @return The startTick.
   */
  @java.lang.Override
  public int getStartTick() {
    return startTick_;
  }

  public static final int END_TICK_FIELD_NUMBER = 3;
  private int endTick_;
  /**
   * <code>uint32 end_tick = 3;</code>
   * @return The endTick.
   */
  @java.lang.Override
  public int getEndTick() {
    return endTick_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getIdentityBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, identity_);
    }
    if (startTick_ != 0) {
      output.writeUInt32(2, startTick_);
    }
    if (endTick_ != 0) {
      output.writeUInt32(3, endTick_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdentityBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, identity_);
    }
    if (startTick_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, startTick_);
    }
    if (endTick_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, endTick_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest)) {
      return super.equals(obj);
    }
    org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest other = (org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest) obj;

    if (!getIdentity()
        .equals(other.getIdentity())) return false;
    if (getStartTick()
        != other.getStartTick()) return false;
    if (getEndTick()
        != other.getEndTick()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + IDENTITY_FIELD_NUMBER;
    hash = (53 * hash) + getIdentity().hashCode();
    hash = (37 * hash) + START_TICK_FIELD_NUMBER;
    hash = (53 * hash) + getStartTick();
    hash = (37 * hash) + END_TICK_FIELD_NUMBER;
    hash = (53 * hash) + getEndTick();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code qubic.archiver.archive.pb.GetTransferTransactionsPerTickRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:qubic.archiver.archive.pb.GetTransferTransactionsPerTickRequest)
      org.qubic.archiver.proto.GetTransferTransactionsPerTickRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.qubic.archiver.proto.QubicArchiverProtos.internal_static_qubic_archiver_archive_pb_GetTransferTransactionsPerTickRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.qubic.archiver.proto.QubicArchiverProtos.internal_static_qubic_archiver_archive_pb_GetTransferTransactionsPerTickRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest.class, org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest.Builder.class);
    }

    // Construct using org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      identity_ = "";

      startTick_ = 0;

      endTick_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.qubic.archiver.proto.QubicArchiverProtos.internal_static_qubic_archiver_archive_pb_GetTransferTransactionsPerTickRequest_descriptor;
    }

    @java.lang.Override
    public org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest getDefaultInstanceForType() {
      return org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest build() {
      org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest buildPartial() {
      org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest result = new org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest(this);
      result.identity_ = identity_;
      result.startTick_ = startTick_;
      result.endTick_ = endTick_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest) {
        return mergeFrom((org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest other) {
      if (other == org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest.getDefaultInstance()) return this;
      if (!other.getIdentity().isEmpty()) {
        identity_ = other.identity_;
        onChanged();
      }
      if (other.getStartTick() != 0) {
        setStartTick(other.getStartTick());
      }
      if (other.getEndTick() != 0) {
        setEndTick(other.getEndTick());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object identity_ = "";
    /**
     * <code>string identity = 1;</code>
     * @return The identity.
     */
    public java.lang.String getIdentity() {
      java.lang.Object ref = identity_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        identity_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string identity = 1;</code>
     * @return The bytes for identity.
     */
    public com.google.protobuf.ByteString
        getIdentityBytes() {
      java.lang.Object ref = identity_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        identity_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string identity = 1;</code>
     * @param value The identity to set.
     * @return This builder for chaining.
     */
    public Builder setIdentity(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      identity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string identity = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIdentity() {
      
      identity_ = getDefaultInstance().getIdentity();
      onChanged();
      return this;
    }
    /**
     * <code>string identity = 1;</code>
     * @param value The bytes for identity to set.
     * @return This builder for chaining.
     */
    public Builder setIdentityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      identity_ = value;
      onChanged();
      return this;
    }

    private int startTick_ ;
    /**
     * <code>uint32 start_tick = 2;</code>
     * @return The startTick.
     */
    @java.lang.Override
    public int getStartTick() {
      return startTick_;
    }
    /**
     * <code>uint32 start_tick = 2;</code>
     * @param value The startTick to set.
     * @return This builder for chaining.
     */
    public Builder setStartTick(int value) {
      
      startTick_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 start_tick = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartTick() {
      
      startTick_ = 0;
      onChanged();
      return this;
    }

    private int endTick_ ;
    /**
     * <code>uint32 end_tick = 3;</code>
     * @return The endTick.
     */
    @java.lang.Override
    public int getEndTick() {
      return endTick_;
    }
    /**
     * <code>uint32 end_tick = 3;</code>
     * @param value The endTick to set.
     * @return This builder for chaining.
     */
    public Builder setEndTick(int value) {
      
      endTick_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 end_tick = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndTick() {
      
      endTick_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:qubic.archiver.archive.pb.GetTransferTransactionsPerTickRequest)
  }

  // @@protoc_insertion_point(class_scope:qubic.archiver.archive.pb.GetTransferTransactionsPerTickRequest)
  private static final org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest();
  }

  public static org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetTransferTransactionsPerTickRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetTransferTransactionsPerTickRequest>() {
    @java.lang.Override
    public GetTransferTransactionsPerTickRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetTransferTransactionsPerTickRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetTransferTransactionsPerTickRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetTransferTransactionsPerTickRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.qubic.archiver.proto.GetTransferTransactionsPerTickRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

