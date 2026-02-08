
package com.designpattern.smartlibrarymanagement;

import java.util.*;

//Singleton class representing the central library catalog
class LibraryCatalog {

	// Static instance to ensure only one object
	private static LibraryCatalog instance;

	// Stores all books in the catalog
	private List<Book> books = new ArrayList<>();

	// Stores subscribed users
	private List<Observer> observers = new ArrayList<>();

	// Private constructor to prevent object creation
	private LibraryCatalog() {
	}

	// Global access point for catalog instance
	public static synchronized LibraryCatalog getInstance() {
		if (instance == null) { // Create only once
			instance = new LibraryCatalog();
		}
		return instance;
	}

	// Adds book and notifies observers
	public void addBook(Book book) {
		books.add(book); // Add book to catalog
		Logger.getInstance().log("Book added: " + book.getTitle()); // Log activity
		notifyObservers(book.getTitle()); // Notify users
	}

	// Register user for notifications
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	// Notify all subscribed users
	private void notifyObservers(String bookTitle) {
		for (Observer o : observers) {
			o.update("New book available: " + bookTitle);
		}
	}
}
