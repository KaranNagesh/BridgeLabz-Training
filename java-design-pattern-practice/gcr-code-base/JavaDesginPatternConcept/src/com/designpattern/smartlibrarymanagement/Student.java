
package com.designpattern.smartlibrarymanagement;

//Student user implementation
class Student implements User {

	private String name; // Student name
	private ReservationStrategy strategy = new LimitedDaysReservation(); // Strategy

	public Student(String name) {
		this.name = name;
	}

	public void showRole() {
		System.out.println(name + " is a Student.");
	}

	public void reserveBook(String bookName) {
		strategy.reserve(name, bookName); // Delegate reservation
	}

	public void update(String msg) {
		System.out.println(name + " notified: " + msg);
	}
}
