// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bibliography.proto

package org.example.proto;

public final class BibliographyProtos {
  private BibliographyProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Bibliography_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Bibliography_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022bibliography.proto\"\177\n\014Bibliography\022\023\n\006" +
      "author\030\001 \001(\tH\000\210\001\001\022\022\n\005genre\030\002 \001(\tH\001\210\001\001\022\025\n" +
      "\010quantity\030\003 \001(\005H\002\210\001\001\022\r\n\005books\030\004 \003(\tB\t\n\007_" +
      "authorB\010\n\006_genreB\013\n\t_quantityB)\n\021org.exa" +
      "mple.protoB\022BibliographyProtosP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Bibliography_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Bibliography_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Bibliography_descriptor,
        new java.lang.String[] { "Author", "Genre", "Quantity", "Books", "Author", "Genre", "Quantity", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}