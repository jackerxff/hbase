// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Master.proto

package org.apache.hadoop.hbase.protobuf.generated;

public final class MasterProtos {
  private MasterProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface IsMasterRunningRequestOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  public static final class IsMasterRunningRequest extends
      com.google.protobuf.GeneratedMessage
      implements IsMasterRunningRequestOrBuilder {
    // Use IsMasterRunningRequest.newBuilder() to construct.
    private IsMasterRunningRequest(Builder builder) {
      super(builder);
    }
    private IsMasterRunningRequest(boolean noInit) {}
    
    private static final IsMasterRunningRequest defaultInstance;
    public static IsMasterRunningRequest getDefaultInstance() {
      return defaultInstance;
    }
    
    public IsMasterRunningRequest getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hbase.protobuf.generated.MasterProtos.internal_static_IsMasterRunningRequest_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hbase.protobuf.generated.MasterProtos.internal_static_IsMasterRunningRequest_fieldAccessorTable;
    }
    
    private void initFields() {
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest other = (org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest) obj;
      
      boolean result = true;
      result = result &&
          getUnknownFields().equals(other.getUnknownFields());
      return result;
    }
    
    @java.lang.Override
    public int hashCode() {
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      return hash;
    }
    
    public static org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hbase.protobuf.generated.MasterProtos.internal_static_IsMasterRunningRequest_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hbase.protobuf.generated.MasterProtos.internal_static_IsMasterRunningRequest_fieldAccessorTable;
      }
      
      // Construct using org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest.getDescriptor();
      }
      
      public org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest getDefaultInstanceForType() {
        return org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest.getDefaultInstance();
      }
      
      public org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest build() {
        org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest buildPartial() {
        org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest result = new org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest(this);
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest) {
          return mergeFrom((org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest other) {
        if (other == org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
          }
        }
      }
      
      
      // @@protoc_insertion_point(builder_scope:IsMasterRunningRequest)
    }
    
    static {
      defaultInstance = new IsMasterRunningRequest(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:IsMasterRunningRequest)
  }
  
  public interface IsMasterRunningResponseOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required bool isMasterRunning = 1;
    boolean hasIsMasterRunning();
    boolean getIsMasterRunning();
  }
  public static final class IsMasterRunningResponse extends
      com.google.protobuf.GeneratedMessage
      implements IsMasterRunningResponseOrBuilder {
    // Use IsMasterRunningResponse.newBuilder() to construct.
    private IsMasterRunningResponse(Builder builder) {
      super(builder);
    }
    private IsMasterRunningResponse(boolean noInit) {}
    
    private static final IsMasterRunningResponse defaultInstance;
    public static IsMasterRunningResponse getDefaultInstance() {
      return defaultInstance;
    }
    
    public IsMasterRunningResponse getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hbase.protobuf.generated.MasterProtos.internal_static_IsMasterRunningResponse_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hbase.protobuf.generated.MasterProtos.internal_static_IsMasterRunningResponse_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required bool isMasterRunning = 1;
    public static final int ISMASTERRUNNING_FIELD_NUMBER = 1;
    private boolean isMasterRunning_;
    public boolean hasIsMasterRunning() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public boolean getIsMasterRunning() {
      return isMasterRunning_;
    }
    
    private void initFields() {
      isMasterRunning_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasIsMasterRunning()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(1, isMasterRunning_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isMasterRunning_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse other = (org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse) obj;
      
      boolean result = true;
      result = result && (hasIsMasterRunning() == other.hasIsMasterRunning());
      if (hasIsMasterRunning()) {
        result = result && (getIsMasterRunning()
            == other.getIsMasterRunning());
      }
      result = result &&
          getUnknownFields().equals(other.getUnknownFields());
      return result;
    }
    
    @java.lang.Override
    public int hashCode() {
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasIsMasterRunning()) {
        hash = (37 * hash) + ISMASTERRUNNING_FIELD_NUMBER;
        hash = (53 * hash) + hashBoolean(getIsMasterRunning());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      return hash;
    }
    
    public static org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hbase.protobuf.generated.MasterProtos.internal_static_IsMasterRunningResponse_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hbase.protobuf.generated.MasterProtos.internal_static_IsMasterRunningResponse_fieldAccessorTable;
      }
      
      // Construct using org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        isMasterRunning_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse.getDescriptor();
      }
      
      public org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse getDefaultInstanceForType() {
        return org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse.getDefaultInstance();
      }
      
      public org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse build() {
        org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse buildPartial() {
        org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse result = new org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.isMasterRunning_ = isMasterRunning_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse) {
          return mergeFrom((org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse other) {
        if (other == org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse.getDefaultInstance()) return this;
        if (other.hasIsMasterRunning()) {
          setIsMasterRunning(other.getIsMasterRunning());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasIsMasterRunning()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              isMasterRunning_ = input.readBool();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required bool isMasterRunning = 1;
      private boolean isMasterRunning_ ;
      public boolean hasIsMasterRunning() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public boolean getIsMasterRunning() {
        return isMasterRunning_;
      }
      public Builder setIsMasterRunning(boolean value) {
        bitField0_ |= 0x00000001;
        isMasterRunning_ = value;
        onChanged();
        return this;
      }
      public Builder clearIsMasterRunning() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isMasterRunning_ = false;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:IsMasterRunningResponse)
    }
    
    static {
      defaultInstance = new IsMasterRunningResponse(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:IsMasterRunningResponse)
  }
  
  public static abstract class MasterService
      implements com.google.protobuf.Service {
    protected MasterService() {}
    
    public interface Interface {
      public abstract void isMasterRunning(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse> done);
      
    }
    
    public static com.google.protobuf.Service newReflectiveService(
        final Interface impl) {
      return new MasterService() {
        @java.lang.Override
        public  void isMasterRunning(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse> done) {
          impl.isMasterRunning(controller, request, done);
        }
        
      };
    }
    
    public static com.google.protobuf.BlockingService
        newReflectiveBlockingService(final BlockingInterface impl) {
      return new com.google.protobuf.BlockingService() {
        public final com.google.protobuf.Descriptors.ServiceDescriptor
            getDescriptorForType() {
          return getDescriptor();
        }
        
        public final com.google.protobuf.Message callBlockingMethod(
            com.google.protobuf.Descriptors.MethodDescriptor method,
            com.google.protobuf.RpcController controller,
            com.google.protobuf.Message request)
            throws com.google.protobuf.ServiceException {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.callBlockingMethod() given method descriptor for " +
              "wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return impl.isMasterRunning(controller, (org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest)request);
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }
        
        public final com.google.protobuf.Message
            getRequestPrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getRequestPrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }
        
        public final com.google.protobuf.Message
            getResponsePrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getResponsePrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }
        
      };
    }
    
    public abstract void isMasterRunning(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse> done);
    
    public static final
        com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptor() {
      return org.apache.hadoop.hbase.protobuf.generated.MasterProtos.getDescriptor().getServices().get(0);
    }
    public final com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    
    public final void callMethod(
        com.google.protobuf.Descriptors.MethodDescriptor method,
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Message request,
        com.google.protobuf.RpcCallback<
          com.google.protobuf.Message> done) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.callMethod() given method descriptor for wrong " +
          "service type.");
      }
      switch(method.getIndex()) {
        case 0:
          this.isMasterRunning(controller, (org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse>specializeCallback(
              done));
          return;
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }
    
    public final com.google.protobuf.Message
        getRequestPrototype(
        com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getRequestPrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }
    
    public final com.google.protobuf.Message
        getResponsePrototype(
        com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getResponsePrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }
    
    public static Stub newStub(
        com.google.protobuf.RpcChannel channel) {
      return new Stub(channel);
    }
    
    public static final class Stub extends org.apache.hadoop.hbase.protobuf.generated.MasterProtos.MasterService implements Interface {
      private Stub(com.google.protobuf.RpcChannel channel) {
        this.channel = channel;
      }
      
      private final com.google.protobuf.RpcChannel channel;
      
      public com.google.protobuf.RpcChannel getChannel() {
        return channel;
      }
      
      public  void isMasterRunning(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse.class,
            org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse.getDefaultInstance()));
      }
    }
    
    public static BlockingInterface newBlockingStub(
        com.google.protobuf.BlockingRpcChannel channel) {
      return new BlockingStub(channel);
    }
    
    public interface BlockingInterface {
      public org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse isMasterRunning(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest request)
          throws com.google.protobuf.ServiceException;
    }
    
    private static final class BlockingStub implements BlockingInterface {
      private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
        this.channel = channel;
      }
      
      private final com.google.protobuf.BlockingRpcChannel channel;
      
      public org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse isMasterRunning(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse) channel.callBlockingMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse.getDefaultInstance());
      }
      
    }
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_IsMasterRunningRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_IsMasterRunningRequest_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_IsMasterRunningResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_IsMasterRunningResponse_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014Master.proto\"\030\n\026IsMasterRunningRequest" +
      "\"2\n\027IsMasterRunningResponse\022\027\n\017isMasterR" +
      "unning\030\001 \002(\0102U\n\rMasterService\022D\n\017isMaste" +
      "rRunning\022\027.IsMasterRunningRequest\032\030.IsMa" +
      "sterRunningResponseBB\n*org.apache.hadoop" +
      ".hbase.protobuf.generatedB\014MasterProtosH" +
      "\001\210\001\001\240\001\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_IsMasterRunningRequest_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_IsMasterRunningRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_IsMasterRunningRequest_descriptor,
              new java.lang.String[] { },
              org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest.class,
              org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningRequest.Builder.class);
          internal_static_IsMasterRunningResponse_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_IsMasterRunningResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_IsMasterRunningResponse_descriptor,
              new java.lang.String[] { "IsMasterRunning", },
              org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse.class,
              org.apache.hadoop.hbase.protobuf.generated.MasterProtos.IsMasterRunningResponse.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
