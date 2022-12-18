package org.example;

import java.util.List;

public class BibliographyProvider {
    public static Bibliography bibliography() {
        Bibliography.BibliographyBuilder builder = new Bibliography.BibliographyBuilder();
        return builder
                .addAuthor("Fyodor Dostoevsky")
                .addQuantity(5)
                .addGenre("realism")
                .addBooks(List.of("Poor Folk", "The Double", "The Idiot",
                        "The Gambler", "Crime and Punishment"))
                .build();
    }

    public static org.example.proto.Bibliography bibliographyProto() {
        return org.example.proto.Bibliography.newBuilder()
                .setAuthor("Fyodor Dostoevsky")
                .setGenre("realism")
                .setQuantity(5)
                .addAllBooks(List.of("Poor Folk", "The Double", "The Idiot",
                        "The Gambler", "Crime and Punishment"))
                .build();
    }
}
