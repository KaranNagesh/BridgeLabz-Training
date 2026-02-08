
package com.designpattern.smartlibrarymanagement;

//Librarian user implementation
class Librarian implements User {

	private String name; // Librarian name

	public Librarian(String name) {
		this.name = name;
	}

	public void showRole() {
		System.out.println(name + " is a Librarian.");
	}

	public void reserveBook(String bookName) {
		System.out.println("Librarian cannot reserve books.");
	}

	public void update(String msg) {
		System.out.println(name + " notified: " + msg);
	}
}
