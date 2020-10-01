package com.company;

import java.util.Scanner;

public class Display {
    private Scanner scan;
    private boolean exit;

    public Display() {
        this.scan = new Scanner(System.in);
        this.exit = true;
    }

    public void terminal(){
        Library library = new Library();
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
                exit = false;
                    break;

                case "1":
                System.out.println("entrer le nom :");
                String name = scan.nextLine();
                System.out.println("entrer l'auteur :");
                String author = scan.nextLine();
                System.out.println("entrer l'isbn :");
                String isbn = scan.nextLine();
                library.addBook(name, author, isbn);
                    break;

                case "2":
                    System.out.println("entrer l'isbn :");
                    String isbnloc = scan.nextLine();
                    library.borrow(isbnloc);
                    break;

                case "3":
                    System.out.println("entrer l'isbn :");
                    String isbnunloc = scan.nextLine();
                    library.giveBack(isbnunloc);

                    break;

                case "4":
                library.showAll();
                    break;

                case "5":
                library.showUnavailable();
                    break;

                default:
                System.out.println("Erreur de saisie !");
            }
        }while(exit);
    }


}
