// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: archive.proto

package org.qubic.archiver.proto;

/**
 * Protobuf type {@code qubic.archiver.archive.pb.Transaction}
 */
public final class Transaction extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:qubic.archiver.archive.pb.Transaction)
    TransactionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Transaction.newBuilder() to construct.
  private Transaction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Transaction() {
    sourceId_ = "";
    destId_ = "";
    inputHex_ = "";
    signatureHex_ = "";
    txId_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new Transaction();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Transaction(
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
            String s = input.readStringRequireUtf8();

            sourceId_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            destId_ = s;
            break;
          }
          case 24: {

            amount_ = input.readInt64();
            break;
          }
          case 32: {

            tickNumber_ = input.readUInt32();
            break;
          }
          case 40: {

            inputType_ = input.readUInt32();
            break;
          }
          case 48: {

            inputSize_ = input.readUInt32();
            break;
          }
          case 58: {
            String s = input.readStringRequireUtf8();

            inputHex_ = s;
            break;
          }
          case 66: {
            String s = input.readStringRequireUtf8();

            signatureHex_ = s;
            break;
          }
          case 74: {
            String s = input.readStringRequireUtf8();

            txId_ = s;
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
    return QubicArchiverProtos.internal_static_qubic_archiver_archive_pb_Transaction_descriptor;
  }

  @Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return QubicArchiverProtos.internal_static_qubic_archiver_archive_pb_Transaction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Transaction.class, Builder.class);
  }

  public static final int SOURCE_ID_FIELD_NUMBER = 1;
  private volatile Object sourceId_;
  /**
   * <code>string source_id = 1;</code>
   * @return The sourceId.
   */
  @Override
  public String getSourceId() {
    Object ref = sourceId_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      sourceId_ = s;
      return s;
    }
  }
  /**
   * <code>string source_id = 1;</code>
   * @return The bytes for sourceId.
   */
  @Override
  public com.google.protobuf.ByteString
      getSourceIdBytes() {
    Object ref = sourceId_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      sourceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEST_ID_FIELD_NUMBER = 2;
  private volatile Object destId_;
  /**
   * <code>string dest_id = 2;</code>
   * @return The destId.
   */
  @Override
  public String getDestId() {
    Object ref = destId_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      destId_ = s;
      return s;
    }
  }
  /**
   * <code>string dest_id = 2;</code>
   * @return The bytes for destId.
   */
  @Override
  public com.google.protobuf.ByteString
      getDestIdBytes() {
    Object ref = destId_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      destId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AMOUNT_FIELD_NUMBER = 3;
  private long amount_;
  /**
   * <code>int64 amount = 3;</code>
   * @return The amount.
   */
  @Override
  public long getAmount() {
    return amount_;
  }

  public static final int TICK_NUMBER_FIELD_NUMBER = 4;
  private int tickNumber_;
  /**
   * <code>uint32 tick_number = 4;</code>
   * @return The tickNumber.
   */
  @Override
  public int getTickNumber() {
    return tickNumber_;
  }

  public static final int INPUT_TYPE_FIELD_NUMBER = 5;
  private int inputType_;
  /**
   * <code>uint32 input_type = 5;</code>
   * @return The inputType.
   */
  @Override
  public int getInputType() {
    return inputType_;
  }

  public static final int INPUT_SIZE_FIELD_NUMBER = 6;
  private int inputSize_;
  /**
   * <code>uint32 input_size = 6;</code>
   * @return The inputSize.
   */
  @Override
  public int getInputSize() {
    return inputSize_;
  }

  public static final int INPUT_HEX_FIELD_NUMBER = 7;
  private volatile Object inputHex_;
  /**
   * <code>string input_hex = 7;</code>
   * @return The inputHex.
   */
  @Override
  public String getInputHex() {
    Object ref = inputHex_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      inputHex_ = s;
      return s;
    }
  }
  /**
   * <code>string input_hex = 7;</code>
   * @return The bytes for inputHex.
   */
  @Override
  public com.google.protobuf.ByteString
      getInputHexBytes() {
    Object ref = inputHex_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      inputHex_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SIGNATURE_HEX_FIELD_NUMBER = 8;
  private volatile Object signatureHex_;
  /**
   * <code>string signature_hex = 8;</code>
   * @return The signatureHex.
   */
  @Override
  public String getSignatureHex() {
    Object ref = signatureHex_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      signatureHex_ = s;
      return s;
    }
  }
  /**
   * <code>string signature_hex = 8;</code>
   * @return The bytes for signatureHex.
   */
  @Override
  public com.google.protobuf.ByteString
      getSignatureHexBytes() {
    Object ref = signatureHex_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      signatureHex_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TX_ID_FIELD_NUMBER = 9;
  private volatile Object txId_;
  /**
   * <code>string tx_id = 9;</code>
   * @return The txId.
   */
  @Override
  public String getTxId() {
    Object ref = txId_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      txId_ = s;
      return s;
    }
  }
  /**
   * <code>string tx_id = 9;</code>
   * @return The bytes for txId.
   */
  @Override
  public com.google.protobuf.ByteString
      getTxIdBytes() {
    Object ref = txId_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      txId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getSourceIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sourceId_);
    }
    if (!getDestIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, destId_);
    }
    if (amount_ != 0L) {
      output.writeInt64(3, amount_);
    }
    if (tickNumber_ != 0) {
      output.writeUInt32(4, tickNumber_);
    }
    if (inputType_ != 0) {
      output.writeUInt32(5, inputType_);
    }
    if (inputSize_ != 0) {
      output.writeUInt32(6, inputSize_);
    }
    if (!getInputHexBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, inputHex_);
    }
    if (!getSignatureHexBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, signatureHex_);
    }
    if (!getTxIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 9, txId_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSourceIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sourceId_);
    }
    if (!getDestIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, destId_);
    }
    if (amount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, amount_);
    }
    if (tickNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, tickNumber_);
    }
    if (inputType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, inputType_);
    }
    if (inputSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, inputSize_);
    }
    if (!getInputHexBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, inputHex_);
    }
    if (!getSignatureHexBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, signatureHex_);
    }
    if (!getTxIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, txId_);
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
    if (!(obj instanceof Transaction)) {
      return super.equals(obj);
    }
    Transaction other = (Transaction) obj;

    if (!getSourceId()
        .equals(other.getSourceId())) return false;
    if (!getDestId()
        .equals(other.getDestId())) return false;
    if (getAmount()
        != other.getAmount()) return false;
    if (getTickNumber()
        != other.getTickNumber()) return false;
    if (getInputType()
        != other.getInputType()) return false;
    if (getInputSize()
        != other.getInputSize()) return false;
    if (!getInputHex()
        .equals(other.getInputHex())) return false;
    if (!getSignatureHex()
        .equals(other.getSignatureHex())) return false;
    if (!getTxId()
        .equals(other.getTxId())) return false;
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
    hash = (37 * hash) + SOURCE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSourceId().hashCode();
    hash = (37 * hash) + DEST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDestId().hashCode();
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAmount());
    hash = (37 * hash) + TICK_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getTickNumber();
    hash = (37 * hash) + INPUT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getInputType();
    hash = (37 * hash) + INPUT_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getInputSize();
    hash = (37 * hash) + INPUT_HEX_FIELD_NUMBER;
    hash = (53 * hash) + getInputHex().hashCode();
    hash = (37 * hash) + SIGNATURE_HEX_FIELD_NUMBER;
    hash = (53 * hash) + getSignatureHex().hashCode();
    hash = (37 * hash) + TX_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTxId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Transaction parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Transaction parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Transaction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Transaction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Transaction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Transaction parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Transaction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Transaction parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Transaction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Transaction parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Transaction parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Transaction parseFrom(
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
  public static Builder newBuilder(Transaction prototype) {
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
   * Protobuf type {@code qubic.archiver.archive.pb.Transaction}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:qubic.archiver.archive.pb.Transaction)
      TransactionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return QubicArchiverProtos.internal_static_qubic_archiver_archive_pb_Transaction_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return QubicArchiverProtos.internal_static_qubic_archiver_archive_pb_Transaction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Transaction.class, Builder.class);
    }

    // Construct using org.qubic.archiver.proto.Transaction.newBuilder()
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
      sourceId_ = "";

      destId_ = "";

      amount_ = 0L;

      tickNumber_ = 0;

      inputType_ = 0;

      inputSize_ = 0;

      inputHex_ = "";

      signatureHex_ = "";

      txId_ = "";

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return QubicArchiverProtos.internal_static_qubic_archiver_archive_pb_Transaction_descriptor;
    }

    @Override
    public Transaction getDefaultInstanceForType() {
      return Transaction.getDefaultInstance();
    }

    @Override
    public Transaction build() {
      Transaction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Transaction buildPartial() {
      Transaction result = new Transaction(this);
      result.sourceId_ = sourceId_;
      result.destId_ = destId_;
      result.amount_ = amount_;
      result.tickNumber_ = tickNumber_;
      result.inputType_ = inputType_;
      result.inputSize_ = inputSize_;
      result.inputHex_ = inputHex_;
      result.signatureHex_ = signatureHex_;
      result.txId_ = txId_;
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
      if (other instanceof Transaction) {
        return mergeFrom((Transaction)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Transaction other) {
      if (other == Transaction.getDefaultInstance()) return this;
      if (!other.getSourceId().isEmpty()) {
        sourceId_ = other.sourceId_;
        onChanged();
      }
      if (!other.getDestId().isEmpty()) {
        destId_ = other.destId_;
        onChanged();
      }
      if (other.getAmount() != 0L) {
        setAmount(other.getAmount());
      }
      if (other.getTickNumber() != 0) {
        setTickNumber(other.getTickNumber());
      }
      if (other.getInputType() != 0) {
        setInputType(other.getInputType());
      }
      if (other.getInputSize() != 0) {
        setInputSize(other.getInputSize());
      }
      if (!other.getInputHex().isEmpty()) {
        inputHex_ = other.inputHex_;
        onChanged();
      }
      if (!other.getSignatureHex().isEmpty()) {
        signatureHex_ = other.signatureHex_;
        onChanged();
      }
      if (!other.getTxId().isEmpty()) {
        txId_ = other.txId_;
        onChanged();
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
      Transaction parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Transaction) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object sourceId_ = "";
    /**
     * <code>string source_id = 1;</code>
     * @return The sourceId.
     */
    public String getSourceId() {
      Object ref = sourceId_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        sourceId_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string source_id = 1;</code>
     * @return The bytes for sourceId.
     */
    public com.google.protobuf.ByteString
        getSourceIdBytes() {
      Object ref = sourceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        sourceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string source_id = 1;</code>
     * @param value The sourceId to set.
     * @return This builder for chaining.
     */
    public Builder setSourceId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sourceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string source_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSourceId() {
      
      sourceId_ = getDefaultInstance().getSourceId();
      onChanged();
      return this;
    }
    /**
     * <code>string source_id = 1;</code>
     * @param value The bytes for sourceId to set.
     * @return This builder for chaining.
     */
    public Builder setSourceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sourceId_ = value;
      onChanged();
      return this;
    }

    private Object destId_ = "";
    /**
     * <code>string dest_id = 2;</code>
     * @return The destId.
     */
    public String getDestId() {
      Object ref = destId_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        destId_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string dest_id = 2;</code>
     * @return The bytes for destId.
     */
    public com.google.protobuf.ByteString
        getDestIdBytes() {
      Object ref = destId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        destId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dest_id = 2;</code>
     * @param value The destId to set.
     * @return This builder for chaining.
     */
    public Builder setDestId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      destId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dest_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDestId() {
      
      destId_ = getDefaultInstance().getDestId();
      onChanged();
      return this;
    }
    /**
     * <code>string dest_id = 2;</code>
     * @param value The bytes for destId to set.
     * @return This builder for chaining.
     */
    public Builder setDestIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      destId_ = value;
      onChanged();
      return this;
    }

    private long amount_ ;
    /**
     * <code>int64 amount = 3;</code>
     * @return The amount.
     */
    @Override
    public long getAmount() {
      return amount_;
    }
    /**
     * <code>int64 amount = 3;</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(long value) {
      
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 amount = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      
      amount_ = 0L;
      onChanged();
      return this;
    }

    private int tickNumber_ ;
    /**
     * <code>uint32 tick_number = 4;</code>
     * @return The tickNumber.
     */
    @Override
    public int getTickNumber() {
      return tickNumber_;
    }
    /**
     * <code>uint32 tick_number = 4;</code>
     * @param value The tickNumber to set.
     * @return This builder for chaining.
     */
    public Builder setTickNumber(int value) {
      
      tickNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 tick_number = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTickNumber() {
      
      tickNumber_ = 0;
      onChanged();
      return this;
    }

    private int inputType_ ;
    /**
     * <code>uint32 input_type = 5;</code>
     * @return The inputType.
     */
    @Override
    public int getInputType() {
      return inputType_;
    }
    /**
     * <code>uint32 input_type = 5;</code>
     * @param value The inputType to set.
     * @return This builder for chaining.
     */
    public Builder setInputType(int value) {
      
      inputType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 input_type = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearInputType() {
      
      inputType_ = 0;
      onChanged();
      return this;
    }

    private int inputSize_ ;
    /**
     * <code>uint32 input_size = 6;</code>
     * @return The inputSize.
     */
    @Override
    public int getInputSize() {
      return inputSize_;
    }
    /**
     * <code>uint32 input_size = 6;</code>
     * @param value The inputSize to set.
     * @return This builder for chaining.
     */
    public Builder setInputSize(int value) {
      
      inputSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 input_size = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearInputSize() {
      
      inputSize_ = 0;
      onChanged();
      return this;
    }

    private Object inputHex_ = "";
    /**
     * <code>string input_hex = 7;</code>
     * @return The inputHex.
     */
    public String getInputHex() {
      Object ref = inputHex_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        inputHex_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string input_hex = 7;</code>
     * @return The bytes for inputHex.
     */
    public com.google.protobuf.ByteString
        getInputHexBytes() {
      Object ref = inputHex_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        inputHex_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string input_hex = 7;</code>
     * @param value The inputHex to set.
     * @return This builder for chaining.
     */
    public Builder setInputHex(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      inputHex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string input_hex = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearInputHex() {
      
      inputHex_ = getDefaultInstance().getInputHex();
      onChanged();
      return this;
    }
    /**
     * <code>string input_hex = 7;</code>
     * @param value The bytes for inputHex to set.
     * @return This builder for chaining.
     */
    public Builder setInputHexBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      inputHex_ = value;
      onChanged();
      return this;
    }

    private Object signatureHex_ = "";
    /**
     * <code>string signature_hex = 8;</code>
     * @return The signatureHex.
     */
    public String getSignatureHex() {
      Object ref = signatureHex_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        signatureHex_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string signature_hex = 8;</code>
     * @return The bytes for signatureHex.
     */
    public com.google.protobuf.ByteString
        getSignatureHexBytes() {
      Object ref = signatureHex_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        signatureHex_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string signature_hex = 8;</code>
     * @param value The signatureHex to set.
     * @return This builder for chaining.
     */
    public Builder setSignatureHex(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      signatureHex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string signature_hex = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearSignatureHex() {
      
      signatureHex_ = getDefaultInstance().getSignatureHex();
      onChanged();
      return this;
    }
    /**
     * <code>string signature_hex = 8;</code>
     * @param value The bytes for signatureHex to set.
     * @return This builder for chaining.
     */
    public Builder setSignatureHexBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      signatureHex_ = value;
      onChanged();
      return this;
    }

    private Object txId_ = "";
    /**
     * <code>string tx_id = 9;</code>
     * @return The txId.
     */
    public String getTxId() {
      Object ref = txId_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        txId_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string tx_id = 9;</code>
     * @return The bytes for txId.
     */
    public com.google.protobuf.ByteString
        getTxIdBytes() {
      Object ref = txId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        txId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string tx_id = 9;</code>
     * @param value The txId to set.
     * @return This builder for chaining.
     */
    public Builder setTxId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      txId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string tx_id = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearTxId() {
      
      txId_ = getDefaultInstance().getTxId();
      onChanged();
      return this;
    }
    /**
     * <code>string tx_id = 9;</code>
     * @param value The bytes for txId to set.
     * @return This builder for chaining.
     */
    public Builder setTxIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      txId_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:qubic.archiver.archive.pb.Transaction)
  }

  // @@protoc_insertion_point(class_scope:qubic.archiver.archive.pb.Transaction)
  private static final Transaction DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Transaction();
  }

  public static Transaction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Transaction>
      PARSER = new com.google.protobuf.AbstractParser<Transaction>() {
    @Override
    public Transaction parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Transaction(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Transaction> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Transaction> getParserForType() {
    return PARSER;
  }

  @Override
  public Transaction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

