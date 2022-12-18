package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

import static org.example.BibliographyProvider.bibliography;
import static org.example.BibliographyProvider.bibliographyProto;

@State(Scope.Benchmark)
public class BenchmarkState {
    private ObjectMapper objectMapper;
    private Bibliography bibliography;
    private org.example.proto.Bibliography bibliographyProto;
    private byte[] bibliographyProtoBytes;

    private static final String bibliographyJson = "{\"author\":\"Fyodor Dostoevsky\",\"genre\":\"realism\",\"quantity\":5," +
            "\"books\":[\"Poor_Folk\",\"The Double\",\"The Idiot\",\"The Gambler\",\"Crime and Punishment\"]}";

    @Setup
    public void setUp() {
        objectMapper = new ObjectMapper();
        initBibliography();
        initBibliographyProto();
    }

    private void initBibliographyProto() {
        bibliographyProto = bibliographyProto();
        bibliographyProtoBytes = bibliographyProto.toByteArray();
    }

    private void initBibliography() {
        bibliography = bibliography();
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    public Bibliography getBibliography() {
        return bibliography;
    }

    public org.example.proto.Bibliography getBibliographyProto() {
        return bibliographyProto;
    }

    public byte[] getBibliographyProtoBytes() {
        return bibliographyProtoBytes;
    }

    public String getBibliographyJson() {
        return bibliographyJson;
    }
}
