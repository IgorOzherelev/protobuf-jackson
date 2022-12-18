package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

import static org.example.Bibliography.*;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        BibliographyBuilder builder = new BibliographyBuilder();
        Bibliography bibliography = builder
                .addAuthor("Fyodor Dostoevsky")
                .addQuantity(5)
                .addGenre("realism")
                .addBooks(List.of("Poor_Folk", "The Double", "The Idiot",
                        "The Gambler", "Crime and Punishment")).build();

        String jsonBibliography = objectMapper.writeValueAsString(bibliography);
        System.out.println(jsonBibliography);

        String str = "{\"author\":\"Fyodor Dostoevsky\",\"genre\":\"realism\",\"quantity\":5," +
                "\"books\":[\"Poor_Folk\",\"The Double\",\"The Idiot\",\"The Gambler\",\"Crime and Punishment\"]}";

        Bibliography b = objectMapper.readValue(str, Bibliography.class);
        System.out.println(b.getAuthor());
    }
}