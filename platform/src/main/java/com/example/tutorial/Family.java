// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sample.proto

package com.example.tutorial;

/**
 * Protobuf type {@code Family}
 */
public  final class Family extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Family)
    FamilyOrBuilder {
  // Use Family.newBuilder() to construct.
  private Family(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Family() {
    person_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Family(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              person_ = new java.util.ArrayList<com.example.tutorial.Person>();
              mutable_bitField0_ |= 0x00000001;
            }
            person_.add(
                input.readMessage(com.example.tutorial.Person.parser(), extensionRegistry));
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              key2P_ = com.google.protobuf.MapField.newMapField(
                  Key2PDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000002;
            }
            com.google.protobuf.MapEntry<java.lang.String, com.example.tutorial.Person>
            key2P = input.readMessage(
                Key2PDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            key2P_.getMutableMap().put(key2P.getKey(), key2P.getValue());
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        person_ = java.util.Collections.unmodifiableList(person_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.tutorial.OuterSample.internal_static_Family_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetKey2P();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.tutorial.OuterSample.internal_static_Family_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.tutorial.Family.class, com.example.tutorial.Family.Builder.class);
  }

  public static final int PERSON_FIELD_NUMBER = 1;
  private java.util.List<com.example.tutorial.Person> person_;
  /**
   * <code>repeated .Person person = 1;</code>
   */
  public java.util.List<com.example.tutorial.Person> getPersonList() {
    return person_;
  }
  /**
   * <code>repeated .Person person = 1;</code>
   */
  public java.util.List<? extends com.example.tutorial.PersonOrBuilder> 
      getPersonOrBuilderList() {
    return person_;
  }
  /**
   * <code>repeated .Person person = 1;</code>
   */
  public int getPersonCount() {
    return person_.size();
  }
  /**
   * <code>repeated .Person person = 1;</code>
   */
  public com.example.tutorial.Person getPerson(int index) {
    return person_.get(index);
  }
  /**
   * <code>repeated .Person person = 1;</code>
   */
  public com.example.tutorial.PersonOrBuilder getPersonOrBuilder(
      int index) {
    return person_.get(index);
  }

  public static final int KEY2P_FIELD_NUMBER = 2;
  private static final class Key2PDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.example.tutorial.Person> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, com.example.tutorial.Person>newDefaultInstance(
                com.example.tutorial.OuterSample.internal_static_Family_Key2PEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.example.tutorial.Person.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, com.example.tutorial.Person> key2P_;
  private com.google.protobuf.MapField<java.lang.String, com.example.tutorial.Person>
  internalGetKey2P() {
    if (key2P_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          Key2PDefaultEntryHolder.defaultEntry);
    }
    return key2P_;
  }

  public int getKey2PCount() {
    return internalGetKey2P().getMap().size();
  }
  /**
   * <code>map&lt;string, .Person&gt; key2P = 2;</code>
   */

  public boolean containsKey2P(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetKey2P().getMap().containsKey(key);
  }
  /**
   * Use {@link #getKey2PMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.example.tutorial.Person> getKey2P() {
    return getKey2PMap();
  }
  /**
   * <code>map&lt;string, .Person&gt; key2P = 2;</code>
   */

  public java.util.Map<java.lang.String, com.example.tutorial.Person> getKey2PMap() {
    return internalGetKey2P().getMap();
  }
  /**
   * <code>map&lt;string, .Person&gt; key2P = 2;</code>
   */

  public com.example.tutorial.Person getKey2POrDefault(
      java.lang.String key,
      com.example.tutorial.Person defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.example.tutorial.Person> map =
        internalGetKey2P().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .Person&gt; key2P = 2;</code>
   */

  public com.example.tutorial.Person getKey2POrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.example.tutorial.Person> map =
        internalGetKey2P().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    for (int i = 0; i < person_.size(); i++) {
      output.writeMessage(1, person_.get(i));
    }
    for (java.util.Map.Entry<java.lang.String, com.example.tutorial.Person> entry
         : internalGetKey2P().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.example.tutorial.Person>
      key2P = Key2PDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      output.writeMessage(2, key2P);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < person_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, person_.get(i));
    }
    for (java.util.Map.Entry<java.lang.String, com.example.tutorial.Person> entry
         : internalGetKey2P().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.example.tutorial.Person>
      key2P = Key2PDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, key2P);
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
    if (!(obj instanceof com.example.tutorial.Family)) {
      return super.equals(obj);
    }
    com.example.tutorial.Family other = (com.example.tutorial.Family) obj;

    boolean result = true;
    result = result && getPersonList()
        .equals(other.getPersonList());
    result = result && internalGetKey2P().equals(
        other.internalGetKey2P());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (getPersonCount() > 0) {
      hash = (37 * hash) + PERSON_FIELD_NUMBER;
      hash = (53 * hash) + getPersonList().hashCode();
    }
    if (!internalGetKey2P().getMap().isEmpty()) {
      hash = (37 * hash) + KEY2P_FIELD_NUMBER;
      hash = (53 * hash) + internalGetKey2P().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.tutorial.Family parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.tutorial.Family parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.tutorial.Family parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.tutorial.Family parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.tutorial.Family parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.tutorial.Family parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.tutorial.Family parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.tutorial.Family parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.tutorial.Family parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.tutorial.Family parseFrom(
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
  public static Builder newBuilder(com.example.tutorial.Family prototype) {
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
   * Protobuf type {@code Family}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Family)
      com.example.tutorial.FamilyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.tutorial.OuterSample.internal_static_Family_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetKey2P();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableKey2P();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.tutorial.OuterSample.internal_static_Family_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.tutorial.Family.class, com.example.tutorial.Family.Builder.class);
    }

    // Construct using com.example.tutorial.Family.newBuilder()
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
        getPersonFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (personBuilder_ == null) {
        person_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        personBuilder_.clear();
      }
      internalGetMutableKey2P().clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.tutorial.OuterSample.internal_static_Family_descriptor;
    }

    public com.example.tutorial.Family getDefaultInstanceForType() {
      return com.example.tutorial.Family.getDefaultInstance();
    }

    public com.example.tutorial.Family build() {
      com.example.tutorial.Family result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.example.tutorial.Family buildPartial() {
      com.example.tutorial.Family result = new com.example.tutorial.Family(this);
      int from_bitField0_ = bitField0_;
      if (personBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          person_ = java.util.Collections.unmodifiableList(person_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.person_ = person_;
      } else {
        result.person_ = personBuilder_.build();
      }
      result.key2P_ = internalGetKey2P();
      result.key2P_.makeImmutable();
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
      if (other instanceof com.example.tutorial.Family) {
        return mergeFrom((com.example.tutorial.Family)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.tutorial.Family other) {
      if (other == com.example.tutorial.Family.getDefaultInstance()) return this;
      if (personBuilder_ == null) {
        if (!other.person_.isEmpty()) {
          if (person_.isEmpty()) {
            person_ = other.person_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePersonIsMutable();
            person_.addAll(other.person_);
          }
          onChanged();
        }
      } else {
        if (!other.person_.isEmpty()) {
          if (personBuilder_.isEmpty()) {
            personBuilder_.dispose();
            personBuilder_ = null;
            person_ = other.person_;
            bitField0_ = (bitField0_ & ~0x00000001);
            personBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPersonFieldBuilder() : null;
          } else {
            personBuilder_.addAllMessages(other.person_);
          }
        }
      }
      internalGetMutableKey2P().mergeFrom(
          other.internalGetKey2P());
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
      com.example.tutorial.Family parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.tutorial.Family) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.example.tutorial.Person> person_ =
      java.util.Collections.emptyList();
    private void ensurePersonIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        person_ = new java.util.ArrayList<com.example.tutorial.Person>(person_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.tutorial.Person, com.example.tutorial.Person.Builder, com.example.tutorial.PersonOrBuilder> personBuilder_;

    /**
     * <code>repeated .Person person = 1;</code>
     */
    public java.util.List<com.example.tutorial.Person> getPersonList() {
      if (personBuilder_ == null) {
        return java.util.Collections.unmodifiableList(person_);
      } else {
        return personBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public int getPersonCount() {
      if (personBuilder_ == null) {
        return person_.size();
      } else {
        return personBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public com.example.tutorial.Person getPerson(int index) {
      if (personBuilder_ == null) {
        return person_.get(index);
      } else {
        return personBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public Builder setPerson(
        int index, com.example.tutorial.Person value) {
      if (personBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersonIsMutable();
        person_.set(index, value);
        onChanged();
      } else {
        personBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public Builder setPerson(
        int index, com.example.tutorial.Person.Builder builderForValue) {
      if (personBuilder_ == null) {
        ensurePersonIsMutable();
        person_.set(index, builderForValue.build());
        onChanged();
      } else {
        personBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public Builder addPerson(com.example.tutorial.Person value) {
      if (personBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersonIsMutable();
        person_.add(value);
        onChanged();
      } else {
        personBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public Builder addPerson(
        int index, com.example.tutorial.Person value) {
      if (personBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersonIsMutable();
        person_.add(index, value);
        onChanged();
      } else {
        personBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public Builder addPerson(
        com.example.tutorial.Person.Builder builderForValue) {
      if (personBuilder_ == null) {
        ensurePersonIsMutable();
        person_.add(builderForValue.build());
        onChanged();
      } else {
        personBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public Builder addPerson(
        int index, com.example.tutorial.Person.Builder builderForValue) {
      if (personBuilder_ == null) {
        ensurePersonIsMutable();
        person_.add(index, builderForValue.build());
        onChanged();
      } else {
        personBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public Builder addAllPerson(
        java.lang.Iterable<? extends com.example.tutorial.Person> values) {
      if (personBuilder_ == null) {
        ensurePersonIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, person_);
        onChanged();
      } else {
        personBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public Builder clearPerson() {
      if (personBuilder_ == null) {
        person_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        personBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public Builder removePerson(int index) {
      if (personBuilder_ == null) {
        ensurePersonIsMutable();
        person_.remove(index);
        onChanged();
      } else {
        personBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public com.example.tutorial.Person.Builder getPersonBuilder(
        int index) {
      return getPersonFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public com.example.tutorial.PersonOrBuilder getPersonOrBuilder(
        int index) {
      if (personBuilder_ == null) {
        return person_.get(index);  } else {
        return personBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public java.util.List<? extends com.example.tutorial.PersonOrBuilder> 
         getPersonOrBuilderList() {
      if (personBuilder_ != null) {
        return personBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(person_);
      }
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public com.example.tutorial.Person.Builder addPersonBuilder() {
      return getPersonFieldBuilder().addBuilder(
          com.example.tutorial.Person.getDefaultInstance());
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public com.example.tutorial.Person.Builder addPersonBuilder(
        int index) {
      return getPersonFieldBuilder().addBuilder(
          index, com.example.tutorial.Person.getDefaultInstance());
    }
    /**
     * <code>repeated .Person person = 1;</code>
     */
    public java.util.List<com.example.tutorial.Person.Builder> 
         getPersonBuilderList() {
      return getPersonFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.tutorial.Person, com.example.tutorial.Person.Builder, com.example.tutorial.PersonOrBuilder> 
        getPersonFieldBuilder() {
      if (personBuilder_ == null) {
        personBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.example.tutorial.Person, com.example.tutorial.Person.Builder, com.example.tutorial.PersonOrBuilder>(
                person_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        person_ = null;
      }
      return personBuilder_;
    }

    private com.google.protobuf.MapField<
        java.lang.String, com.example.tutorial.Person> key2P_;
    private com.google.protobuf.MapField<java.lang.String, com.example.tutorial.Person>
    internalGetKey2P() {
      if (key2P_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            Key2PDefaultEntryHolder.defaultEntry);
      }
      return key2P_;
    }
    private com.google.protobuf.MapField<java.lang.String, com.example.tutorial.Person>
    internalGetMutableKey2P() {
      onChanged();;
      if (key2P_ == null) {
        key2P_ = com.google.protobuf.MapField.newMapField(
            Key2PDefaultEntryHolder.defaultEntry);
      }
      if (!key2P_.isMutable()) {
        key2P_ = key2P_.copy();
      }
      return key2P_;
    }

    public int getKey2PCount() {
      return internalGetKey2P().getMap().size();
    }
    /**
     * <code>map&lt;string, .Person&gt; key2P = 2;</code>
     */

    public boolean containsKey2P(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetKey2P().getMap().containsKey(key);
    }
    /**
     * Use {@link #getKey2PMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.example.tutorial.Person> getKey2P() {
      return getKey2PMap();
    }
    /**
     * <code>map&lt;string, .Person&gt; key2P = 2;</code>
     */

    public java.util.Map<java.lang.String, com.example.tutorial.Person> getKey2PMap() {
      return internalGetKey2P().getMap();
    }
    /**
     * <code>map&lt;string, .Person&gt; key2P = 2;</code>
     */

    public com.example.tutorial.Person getKey2POrDefault(
        java.lang.String key,
        com.example.tutorial.Person defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.example.tutorial.Person> map =
          internalGetKey2P().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .Person&gt; key2P = 2;</code>
     */

    public com.example.tutorial.Person getKey2POrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.example.tutorial.Person> map =
          internalGetKey2P().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearKey2P() {
      getMutableKey2P().clear();
      return this;
    }
    /**
     * <code>map&lt;string, .Person&gt; key2P = 2;</code>
     */

    public Builder removeKey2P(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      getMutableKey2P().remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.example.tutorial.Person>
    getMutableKey2P() {
      return internalGetMutableKey2P().getMutableMap();
    }
    /**
     * <code>map&lt;string, .Person&gt; key2P = 2;</code>
     */
    public Builder putKey2P(
        java.lang.String key,
        com.example.tutorial.Person value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      getMutableKey2P().put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, .Person&gt; key2P = 2;</code>
     */

    public Builder putAllKey2P(
        java.util.Map<java.lang.String, com.example.tutorial.Person> values) {
      getMutableKey2P().putAll(values);
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:Family)
  }

  // @@protoc_insertion_point(class_scope:Family)
  private static final com.example.tutorial.Family DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.tutorial.Family();
  }

  public static com.example.tutorial.Family getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Family>
      PARSER = new com.google.protobuf.AbstractParser<Family>() {
    public Family parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Family(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Family> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Family> getParserForType() {
    return PARSER;
  }

  public com.example.tutorial.Family getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

