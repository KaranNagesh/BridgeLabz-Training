package com.objectmodelling.libraryandbooks;

public class Books {

    private String title;
    private String author;

    // Constructor
    public Books(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method expected by Library
    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
