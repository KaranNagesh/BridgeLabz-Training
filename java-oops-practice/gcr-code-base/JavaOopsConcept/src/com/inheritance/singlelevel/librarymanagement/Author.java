package com.inheritance.singlelevel.librarymanagement;

//Inheriting properties of Author class
public class Author extends Book {
	private String name;
	private String bio;
	public Author(String title, int publicationYear,String name, String bio) {
		super(title, publicationYear);
		this.name = name;
		this.bio = bio;
		
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Book Title -> " + title);
		System.out.println("Published in -> " + publicationYear);
		System.out.println("Author -> " + name);
		System.out.println("Bio -> " + bio);
	}

}