// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: archive.proto

package org.qubic.archiver.proto;

public interface TransactionDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:qubic.archiver.archive.pb.TransactionData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.qubic.archiver.archive.pb.Transaction transaction = 1;</code>
   * @return Whether the transaction field is set.
   */
  boolean hasTransaction();
  /**
   * <code>.qubic.archiver.archive.pb.Transaction transaction = 1;</code>
   * @return The transaction.
   */
  org.qubic.archiver.proto.Transaction getTransaction();
  /**
   * <code>.qubic.archiver.archive.pb.Transaction transaction = 1;</code>
   */
  org.qubic.archiver.proto.TransactionOrBuilder getTransactionOrBuilder();

  /**
   * <code>uint64 timestamp = 2;</code>
   * @return The timestamp.
   */
  long getTimestamp();

  /**
   * <code>bool money_flew = 3;</code>
   * @return The moneyFlew.
   */
  boolean getMoneyFlew();
}
