// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sample.proto

package com.example.tutorial;

public interface FamilyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Family)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Person person = 1;</code>
   */
  java.util.List<com.example.tutorial.Person> 
      getPersonList();
  /**
   * <code>repeated .Person person = 1;</code>
   */
  com.example.tutorial.Person getPerson(int index);
  /**
   * <code>repeated .Person person = 1;</code>
   */
  int getPersonCount();
  /**
   * <code>repeated .Person person = 1;</code>
   */
  java.util.List<? extends com.example.tutorial.PersonOrBuilder> 
      getPersonOrBuilderList();
  /**
   * <code>repeated .Person person = 1;</code>
   */
  com.example.tutorial.PersonOrBuilder getPersonOrBuilder(
      int index);

  /**
   * <code>map&lt;string, .Person&gt; key2P = 2;</code>
   */
  int getKey2PCount();
  /**
   * <code>map&lt;string, .Person&gt; key2P = 2;</code>
   */
  boolean containsKey2P(
      java.lang.String key);
  /**
   * Use {@link #getKey2PMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.example.tutorial.Person>
  getKey2P();
  /**
   * <code>map&lt;string, .Person&gt; key2P = 2;</code>
   */
  java.util.Map<java.lang.String, com.example.tutorial.Person>
  getKey2PMap();
  /**
   * <code>map&lt;string, .Person&gt; key2P = 2;</code>
   */

  com.example.tutorial.Person getKey2POrDefault(
      java.lang.String key,
      com.example.tutorial.Person defaultValue);
  /**
   * <code>map&lt;string, .Person&gt; key2P = 2;</code>
   */

  com.example.tutorial.Person getKey2POrThrow(
      java.lang.String key);
}
