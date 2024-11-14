package org.example.lab7.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {
    private List<Book> books = new ArrayList<>();
    public Library(List<Book> books){
        this.books = books;
    }
    public void addBook(Book book){
        books.add(book);
    }
    public Optional<Book> findBookByISBN(String ISBN){
        return books.stream()
                .filter(book -> book.getISBN().equals(ISBN))
                .findFirst();
    }
}
