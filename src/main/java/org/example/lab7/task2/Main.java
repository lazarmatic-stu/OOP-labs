package org.example.lab7.task2;

import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Book> books = List.of(
        new Book("Lazar", "Autor1", "123" , Status.AVAILABLE),
        new Book("Marko", "Autor2", "1234" , Status.RESERVED),
        new Book("Nikola", "Autor3 ", "4321" , Status.CHECKED_OUT)
        );
        Library library = new Library(books);

        Book book1 = library.findBookByISBN("123").orElse(new Book("Unknown", "Unknown", "978" , Status.RESERVED));
        System.out.println("Using orElse: " + book1);

        Book book2 = library.findBookByISBN("1243124").orElseGet(() -> new Book("Default", "Default Author", "7247" , Status.AVAILABLE));
        System.out.println("Using orElseGet: " + book2);

        try {
            Book book3 = library.findBookByISBN("172478").orElseThrow(() -> new RuntimeException("Book not found!"));
            System.out.println("Using orElseThrow: " + book3);
        } catch (RuntimeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
}
