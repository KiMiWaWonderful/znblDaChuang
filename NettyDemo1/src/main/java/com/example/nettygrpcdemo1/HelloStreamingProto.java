// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/hello_streaming.proto

package com.example.nettygrpcdemo1;

public final class HelloStreamingProto {
  private HelloStreamingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_manualflowcontrol_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_manualflowcontrol_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_manualflowcontrol_HelloReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_manualflowcontrol_HelloReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$src/main/proto/hello_streaming.proto\022\021" +
      "manualflowcontrol\"\034\n\014HelloRequest\022\014\n\004nam" +
      "e\030\001 \001(\t\"\035\n\nHelloReply\022\017\n\007message\030\001 \001(\t2m" +
      "\n\020StreamingGreeter\022Y\n\021SayHelloStreaming\022" +
      "\037.manualflowcontrol.HelloRequest\032\035.manua" +
      "lflowcontrol.HelloReply\"\000(\0010\001B:\n\032com.exa" +
      "mple.nettygrpcdemo1B\023HelloStreamingProto" +
      "P\001\242\002\004HLWSb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_manualflowcontrol_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_manualflowcontrol_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_manualflowcontrol_HelloRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_manualflowcontrol_HelloReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_manualflowcontrol_HelloReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_manualflowcontrol_HelloReply_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
