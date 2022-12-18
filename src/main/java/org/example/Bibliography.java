package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Bibliography {
    private String author;
    private String genre;
    private Integer quantity;
    private List<String> books;

    public Bibliography() {
    }

    public Bibliography(String author, String genre, Integer quantity, List<String> books) {
        this.author = author;
        this.genre = genre;
        this.quantity = quantity;
        this.books = books;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }

    public static class BibliographyBuilder {
        private String author;
        private String genre;
        private Integer quantity;
        private final List<String> books = new ArrayList<>(10);

        public BibliographyBuilder addAuthor(String author) {
            this.author = author;

            return this;
        }

        public BibliographyBuilder addGenre(String genre) {
            this.genre = genre;

            return this;
        }

        public BibliographyBuilder addQuantity(Integer quantity) {
            this.quantity = quantity;

            return this;
        }

        public BibliographyBuilder addBook(String book) {
            this.books.add(book);

            return this;
        }

        public BibliographyBuilder addBooks(Collection<String> books) {
            this.books.addAll(books);

            return this;
        }

        public Bibliography build() {
            return new Bibliography(author, genre, quantity, books);
        }
    }
}
