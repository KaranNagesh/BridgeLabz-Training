package com.constructorsandinstances.level1;

public class LibraryBook {
	//Attribute
	String title ;
	String author ; 
	double price ;
	boolean availability;
	
	LibraryBook(){
		title = "Stranger things";
		author =  "nahra";
		price = 100;
		availability = true;
	}
	
	//parameterized constructor
	LibraryBook(String title , String author , double price , boolean availability){
		this.title = title;
		this.author = author;
		this.price = price;
		this.availability = availability;
	}
	
	
	//Function of borrowing a book
	void borrowBook() {
		if(availability) {
			availability = false;
			System.out.println("Book borrowed successfully");
		} else {
			System.out.println("Book is not available");
		}
	}
	
	public static void main(String[] args) {
		LibraryBook book1 = new LibraryBook();
		book1.title = "Rich dad poor dad";
		book1.author = "Allen walker";
		book1.price = 1680;
		
		//borrowing when available
		book1.borrowBook();
		
		//not available this time
		book1.borrowBook();
	}
	
}
