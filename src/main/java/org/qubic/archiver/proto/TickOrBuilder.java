// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: archive.proto

package org.qubic.archiver.proto;

public interface TickOrBuilder extends
    // @@protoc_insertion_point(interface_extends:qubic.archiver.archive.pb.Tick)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 computor_index = 1;</code>
   * @return The computorIndex.
   */
  int getComputorIndex();

  /**
   * <code>uint32 epoch = 2;</code>
   * @return The epoch.
   */
  int getEpoch();

  /**
   * <code>uint32 tick_number = 3;</code>
   * @return The tickNumber.
   */
  int getTickNumber();

  /**
   * <code>uint64 timestamp = 4;</code>
   * @return The timestamp.
   */
  long getTimestamp();

  /**
   * <pre>
   *Will change to return with unmarshalled info
   * </pre>
   *
   * <code>bytes var_struct = 5;</code>
   * @return The varStruct.
   */
  com.google.protobuf.ByteString getVarStruct();

  /**
   * <code>bytes time_lock = 6;</code>
   * @return The timeLock.
   */
  com.google.protobuf.ByteString getTimeLock();

  /**
   * <code>repeated string transaction_ids = 7;</code>
   * @return A list containing the transactionIds.
   */
  java.util.List<String>
      getTransactionIdsList();
  /**
   * <code>repeated string transaction_ids = 7;</code>
   * @return The count of transactionIds.
   */
  int getTransactionIdsCount();
  /**
   * <code>repeated string transaction_ids = 7;</code>
   * @param index The index of the element to return.
   * @return The transactionIds at the given index.
   */
  String getTransactionIds(int index);
  /**
   * <code>repeated string transaction_ids = 7;</code>
   * @param index The index of the value to return.
   * @return The bytes of the transactionIds at the given index.
   */
  com.google.protobuf.ByteString
      getTransactionIdsBytes(int index);

  /**
   * <code>repeated int64 contract_fees = 8;</code>
   * @return A list containing the contractFees.
   */
  java.util.List<Long> getContractFeesList();
  /**
   * <code>repeated int64 contract_fees = 8;</code>
   * @return The count of contractFees.
   */
  int getContractFeesCount();
  /**
   * <code>repeated int64 contract_fees = 8;</code>
   * @param index The index of the element to return.
   * @return The contractFees at the given index.
   */
  long getContractFees(int index);

  /**
   * <code>string signature_hex = 9;</code>
   * @return The signatureHex.
   */
  String getSignatureHex();
  /**
   * <code>string signature_hex = 9;</code>
   * @return The bytes for signatureHex.
   */
  com.google.protobuf.ByteString
      getSignatureHexBytes();
}
