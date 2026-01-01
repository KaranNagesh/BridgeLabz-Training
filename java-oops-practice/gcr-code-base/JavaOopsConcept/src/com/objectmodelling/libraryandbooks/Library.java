package com.objectmodelling.libraryandbooks;
import java.util.*;

public class Library {

    private ArrayList<Books> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Add book to library
    public void addBook(Books book) {
        books.add(book);
    }

    // Display all books
    public void displayLibraryBooks() {
        for (Books books : books) {
            books.displayBook();
            System.out.println("------------");
        }
    }

}
