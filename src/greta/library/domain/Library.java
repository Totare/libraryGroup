package greta.library.domain;

import java.util.HashMap;
import java.util.Map;

public class Library {

    private Map<String, Book> books =  new HashMap<String, Book>();

    public void addBook(String name, String author, String isbn) {
        Book book = new Book(name, author, isbn, true);

        if (books.containsKey(isbn)){
            System.out.println("ATTENTION : le livre exite deja !!");
            //throw new RuntimeException("le livre exite deja");
        }
        books.put(isbn, book);
    }

    public void borrow(String isbn) {
        Book currentbook = books.get(isbn);
        if (!currentbook.isAvailable()){
            System.out.println("Le livre n'est pas dispo !");
        } else {
            currentbook.setUnAvailable();
        }
    }

    public void giveBack(String isbn) {
        Book currentbook = books.get(isbn);
        if (currentbook.isAvailable()){
            System.out.println("Le livre est deja present !");
        } else {
            currentbook.setAvailable();
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
