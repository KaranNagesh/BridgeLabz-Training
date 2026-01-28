package com.reflectionandannotation.annotation.maxlength;

public class ValidationTest {

	public static void main(String[] args) {

		// Valid username
		User user1 = new User("Arif123");
		System.out.println("Username: " + user1.getUsername());

		// Invalid username (length > 10)
		User user2 = new User("VeryLongUsername");
	}
}
