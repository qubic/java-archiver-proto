// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: archive.proto

package org.qubic.archiver.proto;

/**
 * Protobuf type {@code qubic.archiver.archive.pb.GetTickTransactionsResponse}
 */
public final class GetTickTransactionsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:qubic.archiver.archive.pb.GetTickTransactionsResponse)
    GetTickTransactionsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetTickTransactionsResponse.newBuilder() to construct.
  private GetTickTransactionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetTickTransactionsResponse() {
    transactions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetTickTransactionsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetTickTransactionsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              transactions_ = new java.util.ArrayList<org.qubic.archiver.proto.Transaction>();
              mutable_bitField0_ |= 0x00000001;
            }
            transactions_.add(
                input.readMessage(org.qubic.archiver.proto.Transaction.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        transactions_ = java.util.Collections.unmodifiableList(transactions_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.qubic.archiver.proto.QubicArchiverProtos.internal_static_qubic_archiver_archive_pb_GetTickTransactionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.qubic.archiver.proto.QubicArchiverProtos.internal_static_qubic_archiver_archive_pb_GetTickTransactionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.qubic.archiver.proto.GetTickTransactionsResponse.class, org.qubic.archiver.proto.GetTickTransactionsResponse.Builder.class);
  }

  public static final int TRANSACTIONS_FIELD_NUMBER = 1;
  private java.util.List<org.qubic.archiver.proto.Transaction> transactions_;
  /**
   * <code>repeated .qubic.archiver.archive.pb.Transaction transactions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.qubic.archiver.proto.Transaction> getTransactionsList() {
    return transactions_;
  }
  /**
   * <code>repeated .qubic.archiver.archive.pb.Transaction transactions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.qubic.archiver.proto.TransactionOrBuilder> 
      getTransactionsOrBuilderList() {
    return transactions_;
  }
  /**
   * <code>repeated .qubic.archiver.archive.pb.Transaction transactions = 1;</code>
   */
  @java.lang.Override
  public int getTransactionsCount() {
    return transactions_.size();
  }
  /**
   * <code>repeated .qubic.archiver.archive.pb.Transaction transactions = 1;</code>
   */
  @java.lang.Override
  public org.qubic.archiver.proto.Transaction getTransactions(int index) {
    return transactions_.get(index);
  }
  /**
   * <code>repeated .qubic.archiver.archive.pb.Transaction transactions = 1;</code>
   */
  @java.lang.Override
  public org.qubic.archiver.proto.TransactionOrBuilder getTransactionsOrBuilder(
      int index) {
    return transactions_.get(index);
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
    for (int i = 0; i < transactions_.size(); i++) {
      output.writeMessage(1, transactions_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < transactions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, transactions_.get(i));
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
    if (!(obj instanceof org.qubic.archiver.proto.GetTickTransactionsResponse)) {
      return super.equals(obj);
    }
    org.qubic.archiver.proto.GetTickTransactionsResponse other = (org.qubic.archiver.proto.GetTickTransactionsResponse) obj;

    if (!getTransactionsList()
        .equals(other.getTransactionsList())) return false;
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
    if (getTransactionsCount() > 0) {
      hash = (37 * hash) + TRANSACTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getTransactionsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.qubic.archiver.proto.GetTickTransactionsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.qubic.archiver.proto.GetTickTransactionsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.qubic.archiver.proto.GetTickTransactionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.qubic.archiver.proto.GetTickTransactionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.qubic.archiver.proto.GetTickTransactionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.qubic.archiver.proto.GetTickTransactionsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.qubic.archiver.proto.GetTickTransactionsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.qubic.archiver.proto.GetTickTransactionsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.qubic.archiver.proto.GetTickTransactionsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.qubic.archiver.proto.GetTickTransactionsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.qubic.archiver.proto.GetTickTransactionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.qubic.archiver.proto.GetTickTransactionsResponse parseFrom(
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
  public static Builder newBuilder(org.qubic.archiver.proto.GetTickTransactionsResponse prototype) {
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
   * Protobuf type {@code qubic.archiver.archive.pb.GetTickTransactionsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:qubic.archiver.archive.pb.GetTickTransactionsResponse)
      org.qubic.archiver.proto.GetTickTransactionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.qubic.archiver.proto.QubicArchiverProtos.internal_static_qubic_archiver_archive_pb_GetTickTransactionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.qubic.archiver.proto.QubicArchiverProtos.internal_static_qubic_archiver_archive_pb_GetTickTransactionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.qubic.archiver.proto.GetTickTransactionsResponse.class, org.qubic.archiver.proto.GetTickTransactionsResponse.Builder.class);
    }

    // Construct using org.qubic.archiver.proto.GetTickTransactionsResponse.newBuilder()
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
        getTransactionsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (transactionsBuilder_ == null) {
        transactions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        transactionsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.qubic.archiver.proto.QubicArchiverProtos.internal_static_qubic_archiver_archive_pb_GetTickTransactionsResponse_descriptor;
    }

    @java.lang.Override
    public org.qubic.archiver.proto.GetTickTransactionsResponse getDefaultInstanceForType() {
      return org.qubic.archiver.proto.GetTickTransactionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.qubic.archiver.proto.GetTickTransactionsResponse build() {
      org.qubic.archiver.proto.GetTickTransactionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.qubic.archiver.proto.GetTickTransactionsResponse buildPartial() {
      org.qubic.archiver.proto.GetTickTransactionsResponse result = new org.qubic.archiver.proto.GetTickTransactionsResponse(this);
      int from_bitField0_ = bitField0_;
      if (transactionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          transactions_ = java.util.Collections.unmodifiableList(transactions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.transactions_ = transactions_;
      } else {
        result.transactions_ = transactionsBuilder_.build();
      }
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
      if (other instanceof org.qubic.archiver.proto.GetTickTransactionsResponse) {
        return mergeFrom((org.qubic.archiver.proto.GetTickTransactionsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.qubic.archiver.proto.GetTickTransactionsResponse other) {
      if (other == org.qubic.archiver.proto.GetTickTransactionsResponse.getDefaultInstance()) return this;
      if (transactionsBuilder_ == null) {
        if (!other.transactions_.isEmpty()) {
          if (transactions_.isEmpty()) {
            transactions_ = other.transactions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTransactionsIsMutable();
            transactions_.addAll(other.transactions_);
          }
          onChanged();
        }
      } else {
        if (!other.transactions_.isEmpty()) {
          if (transactionsBuilder_.isEmpty()) {
            transactionsBuilder_.dispose();
            transactionsBuilder_ = null;
            transactions_ = other.transactions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            transactionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTransactionsFieldBuilder() : null;
          } else {
            transactionsBuilder_.addAllMessages(other.transactions_);
          }
        }
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
      org.qubic.archiver.proto.GetTickTransactionsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.qubic.archiver.proto.GetTickTransactionsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.qubic.archiver.proto.Transaction> transactions_ =
      java.util.Collections.emptyList();
    private void ensureTransactionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        transactions_ = new java.util.ArrayList<org.qubic.archiver.proto.Transaction>(transactions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.qubic.archiver.proto.Transaction, org.qubic.archiver.proto.Transaction.Builder, org.qubic.archiver.proto.TransactionOrBuilder> transactionsBuilder_;

    /**
     * <code>repeated .qubic.archiver.archive.pb.Transaction transactions = 1;</code>
     */
    public java.util.List<org.qubic.archiver.proto.Transaction> getTransactionsList() {
      if (transactionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(transactions_);
      } else {
        return transactionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .qubic.archiver.archive.pb.Transaction transactions = 1;</code>
     */
    public int getTransactionsCount() {
      if (transactionsBuilder_ == null) {
        return transactions_.size();
      } else {
        return transactionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .qubic.archiver.archive.pb.Transaction transactions = 1;</code>
     */
    public org.qubic.archiver.proto.Transaction getTransactions(int index) {
      if (transactionsBuilder_ == null) {
        return transactions_.get(index);
      } else {
        return transactionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .qubic.archiver.archive.pb.Transaction transactions = 1;</code>
     */
    public Builder setTransactions(
        int index, org.qubic.archiver.proto.Transaction value) {
      if (transactionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTransactionsIsMutable();
        transactions_.set(index, value);
        onChanged();
      } else {
        transactionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .qubic.archiver.archive.pb.Transaction transactions = 1;</code>
     */
    public Builder setTransactions(
        int index, org.qubic.archiver.proto.Transaction.Builder builderForValue) {
      if (transactionsBuilder_ == null) {
        ensureTransactionsIsMutable();
        transactions_.set(index, builderForValue.build());
        onChanged();
      } else {
        transactionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .qubic.archiver.archive.pb.Transaction transactions = 1;</code>
     */
    public Builder addTransactions(org.qubic.archiver.proto.Transaction value) {
      if (transactionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTransactionsIsMutable();
        transactions_.add(value);
        onChanged();
      } else {
        transactionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .qubic.archiver.archive.pb.Transaction transactions = 1;</code>
     */
    public Builder addTransactions(
        int index, org.qubic.archiver.proto.Transaction value) {
      if (transactionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTransactionsIsMutable();
        transactions_.add(index, value);
        onChanged();
      } else {
        transactionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .qubic.archiver.archive.pb.Transaction transactions = 1;</code>
     */
    public Builder addTransactions(
        org.qubic.archiver.proto.Transaction.Builder builderForValue) {
      if (transactionsBuilder_ == null) {
        ensureTransactionsIsMutable();
        transactions_.add(builderForValue.build());
        onChanged();
      } else {
        transactionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .qubic.archiver.archive.pb.Transaction transactions = 1;</code>
     */
    public Builder addTransactions(
        int index, org.qubic.archiver.proto.Transaction.Builder builderForValue) {
      if (transactionsBuilder_ == null) {
        ensureTransactionsIsMutable();
        transactions_.add(index, builderForValue.build());
        onChanged();
      } else {
        transactionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .qubic.archiver.archive.pb.Transaction transactions = 1;</code>
     */
    public Builder addAllTransactions(
        java.lang.Iterable<? extends org.qubic.archiver.proto.Transaction> values) {
      if (transactionsBuilder_ == null) {
        ensureTransactionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, transactions_);
        onChanged();
      } else {
        transactionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .qubic.archiver.archive.pb.Transaction transactions = 1;</code>
     */
    public Builder clearTransactions() {
      if (transactionsBuilder_ == null) {
        transactions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        transactionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .qubic.archiver.archive.pb.Transaction transactions = 1;</code>
     */
    public Builder removeTransactions(int index) {
      if (transactionsBuilder_ == null) {
        ensureTransactionsIsMutable();
        transactions_.remove(index);
        onChanged();
      } else {
        transactionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .qubic.archiver.archive.pb.Transaction transactions = 1;</code>
     */
    public org.qubic.archiver.proto.Transaction.Builder getTransactionsBuilder(
        int index) {
      return getTransactionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .qubic.archiver.archive.pb.Transaction transactions = 1;</code>
     */
    public org.qubic.archiver.proto.TransactionOrBuilder getTransactionsOrBuilder(
        int index) {
      if (transactionsBuilder_ == null) {
        return transactions_.get(index);  } else {
        return transactionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .qubic.archiver.archive.pb.Transaction transactions = 1;</code>
     */
    public java.util.List<? extends org.qubic.archiver.proto.TransactionOrBuilder> 
         getTransactionsOrBuilderList() {
      if (transactionsBuilder_ != null) {
        return transactionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(transactions_);
      }
    }
    /**
     * <code>repeated .qubic.archiver.archive.pb.Transaction transactions = 1;</code>
     */
    public org.qubic.archiver.proto.Transaction.Builder addTransactionsBuilder() {
      return getTransactionsFieldBuilder().addBuilder(
          org.qubic.archiver.proto.Transaction.getDefaultInstance());
    }
    /**
     * <code>repeated .qubic.archiver.archive.pb.Transaction transactions = 1;</code>
     */
    public org.qubic.archiver.proto.Transaction.Builder addTransactionsBuilder(
        int index) {
      return getTransactionsFieldBuilder().addBuilder(
          index, org.qubic.archiver.proto.Transaction.getDefaultInstance());
    }
    /**
     * <code>repeated .qubic.archiver.archive.pb.Transaction transactions = 1;</code>
     */
    public java.util.List<org.qubic.archiver.proto.Transaction.Builder> 
         getTransactionsBuilderList() {
      return getTransactionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.qubic.archiver.proto.Transaction, org.qubic.archiver.proto.Transaction.Builder, org.qubic.archiver.proto.TransactionOrBuilder> 
        getTransactionsFieldBuilder() {
      if (transactionsBuilder_ == null) {
        transactionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.qubic.archiver.proto.Transaction, org.qubic.archiver.proto.Transaction.Builder, org.qubic.archiver.proto.TransactionOrBuilder>(
                transactions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        transactions_ = null;
      }
      return transactionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:qubic.archiver.archive.pb.GetTickTransactionsResponse)
  }

  // @@protoc_insertion_point(class_scope:qubic.archiver.archive.pb.GetTickTransactionsResponse)
  private static final org.qubic.archiver.proto.GetTickTransactionsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.qubic.archiver.proto.GetTickTransactionsResponse();
  }

  public static org.qubic.archiver.proto.GetTickTransactionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetTickTransactionsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetTickTransactionsResponse>() {
    @java.lang.Override
    public GetTickTransactionsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetTickTransactionsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetTickTransactionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetTickTransactionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.qubic.archiver.proto.GetTickTransactionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

