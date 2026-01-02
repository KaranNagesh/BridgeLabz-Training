package com.inheritance.singlelevel.librarymanagement;

//Super class
public class Book {
	protected String title;
	protected int publicationYear;
	
	public Book(String title, int publicationYear) {
		this.title = title;
		this.publicationYear = publicationYear;
	}
	
	public void displayInfo() {
		System.out.println("Displaying book info");
	}
}