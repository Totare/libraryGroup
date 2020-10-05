package greta.library.domain;

import java.util.HashMap;
import java.util.Map;

public class Library {

    private Map<String, Book> books;

    public void addBook(String name, String author, String isbn) {
        books = new HashMap<String, Book>();
        Book book = new Book(name, author, isbn, true);

        if (books.containsKey(isbn)){
            System.out.println("ATTENTION : le livre exite deja !!");
            //throw new RuntimeException("le livre exite deja");
        }
        books.put(isbn, book);
    }

    public void borrow(String isbn) {
        Book book = books.get(isbn);
        if (!book.isAvailable()){
            System.out.println("Le livre n'est pas dispo !");
        } else {
            book.setUnavailable();
        }
    }

    public void giveBack(String isbn) {
        Book book = books.get(isbn);
        if (book.isAvailable()){
            System.out.println("Le livre est deja present !");
        } else {
            book.setAvailable();
        }
    }

    public void showAll() {
        books.forEach((k, v) -> System.out.println((k + ":" + v)));
    }

    public void showUnavailable() {
        for (Map.Entry<String, Book> book : books.entrySet()) {
            if (!book.getValue().isAvailable()) {
                System.out.println(book);
            }
        }

    }


}
