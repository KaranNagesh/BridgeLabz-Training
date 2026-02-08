
package com.designpattern.smartlibrarymanagement;

//Strategy interface for reservation behavior
interface ReservationStrategy {
	void reserve(String user, String book);
}

//Student reservation strategy
class LimitedDaysReservation implements ReservationStrategy {
	public void reserve(String user, String book) {
		System.out.println(user + " reserved " + book + " for 7 days.");
	}
}

//Faculty reservation strategy
class ExtendedDaysReservation implements ReservationStrategy {
	public void reserve(String user, String book) {
		System.out.println(user + " reserved " + book + " for 30 days.");
	}
}
