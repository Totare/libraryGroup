package greta.library.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void setAvailable() {
        Book book = new Book("test", "joe", "azer", false);
        book.setAvailable();
        assertTrue(book.isAvailable());
    }

    @Test
    public void setUnAvailable() {
        Book book = new Book("test", "joe", "azer", true);
        book.setUnavailable();
        assertFalse(book.isAvailable());
    }
}