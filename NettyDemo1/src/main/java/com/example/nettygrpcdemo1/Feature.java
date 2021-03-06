// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/route_guide.proto

package com.example.nettygrpcdemo1;

/**
 * Protobuf type {@code routeguide.Feature}
 */
public  final class Feature extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:routeguide.Feature)
    FeatureOrBuilder {
  // Use Feature.newBuilder() to construct.
  private Feature(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Feature() {
    name_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Feature(
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
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            com.example.nettygrpcdemo1.Point.Builder subBuilder = null;
            if (location_ != null) {
              subBuilder = location_.toBuilder();
            }
            location_ = input.readMessage(com.example.nettygrpcdemo1.Point.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(location_);
              location_ = subBuilder.buildPartial();
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
    return com.example.nettygrpcdemo1.RouteGuideProto.internal_static_routeguide_Feature_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.nettygrpcdemo1.RouteGuideProto.internal_static_routeguide_Feature_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.nettygrpcdemo1.Feature.class, com.example.nettygrpcdemo1.Feature.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOCATION_FIELD_NUMBER = 2;
  private com.example.nettygrpcdemo1.Point location_;
  /**
   * <code>.routeguide.Point location = 2;</code>
   */
  public boolean hasLocation() {
    return location_ != null;
  }
  /**
   * <code>.routeguide.Point location = 2;</code>
   */
  public com.example.nettygrpcdemo1.Point getLocation() {
    return location_ == null ? com.example.nettygrpcdemo1.Point.getDefaultInstance() : location_;
  }
  /**
   * <code>.routeguide.Point location = 2;</code>
   */
  public com.example.nettygrpcdemo1.PointOrBuilder getLocationOrBuilder() {
    return getLocation();
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (location_ != null) {
      output.writeMessage(2, getLocation());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (location_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLocation());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.nettygrpcdemo1.Feature)) {
      return super.equals(obj);
    }
    com.example.nettygrpcdemo1.Feature other = (com.example.nettygrpcdemo1.Feature) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && (hasLocation() == other.hasLocation());
    if (hasLocation()) {
      result = result && getLocation()
          .equals(other.getLocation());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasLocation()) {
      hash = (37 * hash) + LOCATION_FIELD_NUMBER;
      hash = (53 * hash) + getLocation().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.nettygrpcdemo1.Feature parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.nettygrpcdemo1.Feature parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.nettygrpcdemo1.Feature parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.nettygrpcdemo1.Feature parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.nettygrpcdemo1.Feature parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.nettygrpcdemo1.Feature parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.nettygrpcdemo1.Feature parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.nettygrpcdemo1.Feature parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.nettygrpcdemo1.Feature parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.nettygrpcdemo1.Feature parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.nettygrpcdemo1.Feature parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.nettygrpcdemo1.Feature parseFrom(
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
  public static Builder newBuilder(com.example.nettygrpcdemo1.Feature prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code routeguide.Feature}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:routeguide.Feature)
      com.example.nettygrpcdemo1.FeatureOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.nettygrpcdemo1.RouteGuideProto.internal_static_routeguide_Feature_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.nettygrpcdemo1.RouteGuideProto.internal_static_routeguide_Feature_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.nettygrpcdemo1.Feature.class, com.example.nettygrpcdemo1.Feature.Builder.class);
    }

    // Construct using com.example.nettygrpcdemo1.Feature.newBuilder()
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
    public Builder clear() {
      super.clear();
      name_ = "";

      if (locationBuilder_ == null) {
        location_ = null;
      } else {
        location_ = null;
        locationBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.nettygrpcdemo1.RouteGuideProto.internal_static_routeguide_Feature_descriptor;
    }

    public com.example.nettygrpcdemo1.Feature getDefaultInstanceForType() {
      return com.example.nettygrpcdemo1.Feature.getDefaultInstance();
    }

    public com.example.nettygrpcdemo1.Feature build() {
      com.example.nettygrpcdemo1.Feature result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.example.nettygrpcdemo1.Feature buildPartial() {
      com.example.nettygrpcdemo1.Feature result = new com.example.nettygrpcdemo1.Feature(this);
      result.name_ = name_;
      if (locationBuilder_ == null) {
        result.location_ = location_;
      } else {
        result.location_ = locationBuilder_.build();
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
      if (other instanceof com.example.nettygrpcdemo1.Feature) {
        return mergeFrom((com.example.nettygrpcdemo1.Feature)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.nettygrpcdemo1.Feature other) {
      if (other == com.example.nettygrpcdemo1.Feature.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasLocation()) {
        mergeLocation(other.getLocation());
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
      com.example.nettygrpcdemo1.Feature parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.nettygrpcdemo1.Feature) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private com.example.nettygrpcdemo1.Point location_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.nettygrpcdemo1.Point, com.example.nettygrpcdemo1.Point.Builder, com.example.nettygrpcdemo1.PointOrBuilder> locationBuilder_;
    /**
     * <code>.routeguide.Point location = 2;</code>
     */
    public boolean hasLocation() {
      return locationBuilder_ != null || location_ != null;
    }
    /**
     * <code>.routeguide.Point location = 2;</code>
     */
    public com.example.nettygrpcdemo1.Point getLocation() {
      if (locationBuilder_ == null) {
        return location_ == null ? com.example.nettygrpcdemo1.Point.getDefaultInstance() : location_;
      } else {
        return locationBuilder_.getMessage();
      }
    }
    /**
     * <code>.routeguide.Point location = 2;</code>
     */
    public Builder setLocation(com.example.nettygrpcdemo1.Point value) {
      if (locationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        location_ = value;
        onChanged();
      } else {
        locationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.routeguide.Point location = 2;</code>
     */
    public Builder setLocation(
        com.example.nettygrpcdemo1.Point.Builder builderForValue) {
      if (locationBuilder_ == null) {
        location_ = builderForValue.build();
        onChanged();
      } else {
        locationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.routeguide.Point location = 2;</code>
     */
    public Builder mergeLocation(com.example.nettygrpcdemo1.Point value) {
      if (locationBuilder_ == null) {
        if (location_ != null) {
          location_ =
            com.example.nettygrpcdemo1.Point.newBuilder(location_).mergeFrom(value).buildPartial();
        } else {
          location_ = value;
        }
        onChanged();
      } else {
        locationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.routeguide.Point location = 2;</code>
     */
    public Builder clearLocation() {
      if (locationBuilder_ == null) {
        location_ = null;
        onChanged();
      } else {
        location_ = null;
        locationBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.routeguide.Point location = 2;</code>
     */
    public com.example.nettygrpcdemo1.Point.Builder getLocationBuilder() {
      
      onChanged();
      return getLocationFieldBuilder().getBuilder();
    }
    /**
     * <code>.routeguide.Point location = 2;</code>
     */
    public com.example.nettygrpcdemo1.PointOrBuilder getLocationOrBuilder() {
      if (locationBuilder_ != null) {
        return locationBuilder_.getMessageOrBuilder();
      } else {
        return location_ == null ?
            com.example.nettygrpcdemo1.Point.getDefaultInstance() : location_;
      }
    }
    /**
     * <code>.routeguide.Point location = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.nettygrpcdemo1.Point, com.example.nettygrpcdemo1.Point.Builder, com.example.nettygrpcdemo1.PointOrBuilder> 
        getLocationFieldBuilder() {
      if (locationBuilder_ == null) {
        locationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.example.nettygrpcdemo1.Point, com.example.nettygrpcdemo1.Point.Builder, com.example.nettygrpcdemo1.PointOrBuilder>(
                getLocation(),
                getParentForChildren(),
                isClean());
        location_ = null;
      }
      return locationBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:routeguide.Feature)
  }

  // @@protoc_insertion_point(class_scope:routeguide.Feature)
  private static final com.example.nettygrpcdemo1.Feature DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.nettygrpcdemo1.Feature();
  }

  public static com.example.nettygrpcdemo1.Feature getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Feature>
      PARSER = new com.google.protobuf.AbstractParser<Feature>() {
    public Feature parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Feature(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Feature> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Feature> getParserForType() {
    return PARSER;
  }

  public com.example.nettygrpcdemo1.Feature getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

