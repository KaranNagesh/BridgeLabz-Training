package com.inheritance.singlelevel.librarymanagement;

public class Main {
	public static void main(String[] args) {
		
		//Creating object of author class
		Book book1 = new Author("2 States",2014,"Chetan Bhagat","A graduate of IIT Delhi and IIM \nAhmedabad, he transitioned from an investment banking \ncareer to full-time writing, publishing bestsellers like Five Point\n Someone, 2 States, and The 3 Mistakes of My Life, many adapted \ninto successful Bollywood films, making him a prominent figure\n in popular Indian literature and media");
		
		//displaying book details
		System.out.println("----------------");
		book1.displayInfo();
		System.out.println("----------------");
	}
}
