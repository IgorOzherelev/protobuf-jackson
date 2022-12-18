# shellcheck disable=SC2046
SRC_DIR=/home/igor/IdeaProjects/protobuf-jackson/src/main/resources
DST_DIR=/home/igor/IdeaProjects/protobuf-jackson/src/main/java/org/example/proto

protoc -I=$SRC_DIR --java_out=$DST_DIR $SRC_DIR/bibliography.proto --experimental_allow_proto3_optional=true