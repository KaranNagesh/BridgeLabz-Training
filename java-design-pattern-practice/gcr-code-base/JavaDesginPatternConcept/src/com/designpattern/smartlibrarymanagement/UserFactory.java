package com.designpattern.smartlibrarymanagement;


//Factory class to create users dynamically
class UserFactory {

	public static User createUser(String type, String name) {
		switch (type.toLowerCase()) { // Decide object type at runtime
		case "student":
			return new Student(name);
		case "faculty":
			return new Faculty(name);
		case "librarian":
			return new Librarian(name);
		default:
			throw new IllegalArgumentException("Invalid user type");
		}
	}
}