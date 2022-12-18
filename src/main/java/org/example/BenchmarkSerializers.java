package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.protobuf.InvalidProtocolBufferException;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.infra.Blackhole;

import static org.openjdk.jmh.annotations.Mode.AverageTime;

@BenchmarkMode(AverageTime)
public class BenchmarkSerializers {
    @Benchmark
    public void serializeToJson(BenchmarkState state, Blackhole blackhole) throws JsonProcessingException {
        Bibliography bibliography = state.getBibliography();
        String json = state.getObjectMapper().writeValueAsString(bibliography);
        blackhole.consume(json);
    }

    @Benchmark
    public void deserializeFromJson(BenchmarkState state, Blackhole blackhole) throws JsonProcessingException {
        Bibliography bibliography = state.getObjectMapper().readValue(state.getBibliographyJson(), Bibliography.class);
        blackhole.consume(bibliography);
    }

    @Benchmark
    public void serializeToProto(BenchmarkState state, Blackhole blackhole) {
        byte[] bytes = state.getBibliographyProto().toByteArray();
        blackhole.consume(bytes);
    }

    @Benchmark
    public void deserializeFromProto(BenchmarkState state, Blackhole blackhole) throws InvalidProtocolBufferException {
        org.example.proto.Bibliography bibliography = org.example.proto.Bibliography.parseFrom(state.getBibliographyProtoBytes());
        blackhole.consume(bibliography);
    }
}
