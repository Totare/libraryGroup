package greta.library.domain;

import java.util.Objects;

public class Book {
    private String name;
    private String author;
    private String isbn;
    private boolean available;

    public Book(String name, String author, String isbn, boolean available) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable() {
        this.available = true;
    }

    public void setUnAvailable() {
        this.available = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return available == book.available &&
                name.equals(book.name) &&
                author.equals(book.author) &&
                isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, isbn, available);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", available=" + available +
                '}';
    }

}
