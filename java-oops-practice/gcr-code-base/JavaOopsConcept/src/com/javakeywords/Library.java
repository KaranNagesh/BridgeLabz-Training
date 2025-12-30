package com.javakeywords;

class Book {
    // Static variable shared across all instances
    private static String libraryName;

    // Instance variables
    private String title;
    private String author;
    private final String isbn; // Final variable (cannot be changed)

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to set library name
    public static void setLibraryName(String name) {
        libraryName = name;
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}

public class Library {
    public static void main(String[] args) {

        // Set static library name
        Book.setLibraryName("Egmore Library");

        // Display library name
        Book.displayLibraryName();

        // Create Book object
        Book book1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");

        // Display book details
        book1.displayBookDetails();
    }
}
