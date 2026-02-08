
package com.designpattern.smartlibrarymanagement;

//Main class to integrate all patterns
public class LibraryApp {

	public static void main(String[] args) {

		// Get singleton catalog instance
		LibraryCatalog catalog = LibraryCatalog.getInstance();

		// Create users using Factory
		User student = UserFactory.createUser("student", "Alice");
		User faculty = UserFactory.createUser("faculty", "Dr. Bob");

		// Display roles
		student.showRole();
		faculty.showRole();

		// Register users as observers
		catalog.addObserver(student);
		catalog.addObserver(faculty);

		// Create book using Builder
		Book book = new Book.BookBuilder("Design Patterns").author("GoF").edition("2nd").genre("Software Engineering")
				.build();

		// Add book to catalog (triggers notification)
		catalog.addBook(book);

		// Reserve book using Strategy
		student.reserveBook("Design Patterns");
		faculty.reserveBook("Design Patterns");
	}
}
