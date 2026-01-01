package com.objectmodelling.libraryandbooks;

public class Main {
    public static void main(String[] args) {
    	
        // Books created independently
        Books b1 = new Books("Godan", "Premchand");
        Books b2 = new Books("Gunah", "Dharm");

        // Library object
        Library library = new Library();

        // Adding books to library (Aggregation)
        library.addBook(b1);
        library.addBook(b2);

        // Display books
        library.displayLibraryBooks();
    }
}
