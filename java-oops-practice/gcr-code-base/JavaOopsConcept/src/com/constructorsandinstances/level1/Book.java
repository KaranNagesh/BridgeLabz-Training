package com.constructorsandinstances.level1;

public class Book {
	//Attribute
	String title ;
	String author ;
	double price; 
	
	//Default constructor
	Book(){
		title = "2-state";
		author = "Chetan bhagat";
		price = 800.00;
	}
	
	//Parameterized constructor
	Book(String title , String author, String price){
		this.title = "Ice and fire";
		this.author = "Duffer brother";
		this.price = 1200.00;
	}
	
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.author = "Munsiprem chand";
		b1.price = 1800;
		b1.title = "Kahani";
		System.out.println(" The title of the book is " + b1.title);
		System.out.println(" The author of the book is " + b1.author);
		System.out.println(" The price of the book is " + b1.price);

	}
	
}
