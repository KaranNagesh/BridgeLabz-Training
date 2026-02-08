
package com.designpattern.smartlibrarymanagement;

//Faculty user implementation
class Faculty implements User {

	private String name; // Faculty name
	private ReservationStrategy strategy = new ExtendedDaysReservation(); // Strategy

	public Faculty(String name) {
		this.name = name;
	}

	public void showRole() {
		System.out.println(name + " is a Faculty.");
	}

	public void reserveBook(String bookName) {
		strategy.reserve(name, bookName);
	}

	public void update(String msg) {
		System.out.println(name + " notified: " + msg);
	}
}
