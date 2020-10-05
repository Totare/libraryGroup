package greta.library.ui;

import greta.library.domain.Library;

import java.util.Scanner;

public class Display {
    private Scanner scan = new Scanner(System.in);
    private String choice;
    public Library library = new Library();

    public Display(){
        do{
            System.out.println("Bienvenue dans la library :\nTaper 1 pour ajouter un livre");
            System.out.println("Taper 2 pour emprunter un livre");
            System.out.println("Taper 3 pour rendre un livre");
            System.out.println("Taper 4 pour afficher les livres");
            System.out.println("Taper 5 pour afficher les livres empruntés");
            System.out.println("Taper exit pour sortir");
            String choice = scan.nextLine();

            switch (choice){
                case "exit":
                    break;

                case "1": insertBook();
                    break;

                case "2": borrowBook();
                    break;

                case "3": giveBackBook();
                    break;

                case "4": library.showAll();
                    break;

                case "5": library.showUnavailable();
                    break;

                default:
                    System.out.println("Erreur de saisie !");
            }
        }while(!choice.equals("exit"));
    }

    public void insertBook(){
        System.out.println("entrer le nom :");
        String name = scan.nextLine();
        System.out.println("entrer l'auteur :");
        String author = scan.nextLine();
        System.out.println("entrer l'isbn :");
        String isbn = scan.nextLine();
        library.addBook(name, author, isbn);
    }
    public void borrowBook() {
        System.out.println("entrer l'isbn :");
        String isbn = scan.nextLine();
        library.borrow(isbn);
    }
    public void giveBackBook() {
        System.out.println("entrer l'isbn :");
        String isbn = scan.nextLine();
        library.giveBack(isbn);
    }
}
