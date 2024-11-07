package org.example.lab6.library;

public class Book{
    private String title;
    private String publisher;
    private int publishingYear;
    public Book(String title, String publisher, int publishingYear){
        this.title = title;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
    }
    public String title(){
        return this.title;
    }
    public String publisher(){
        return this.publisher;
    }
    public int year(){
        return this.publishingYear;
    }
    @Override
    public String toString(){
        return this.title + " " + this.publisher + " " + this.publishingYear;
    }
}
