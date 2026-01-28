package com.regexandjunit.junit.userregistration;

public class UserRegistration {

	// Registers a user after validating inputs
	public void registerUser(String username, String email, String password) {

		// Validates username
		if (username == null || username.trim().isEmpty()) {
			throw new IllegalArgumentException("Invalid username");
		}

		// Validates email
		if (email == null || !email.contains("@")) {
			throw new IllegalArgumentException("Invalid email");
		}

		// Validates password
		if (password == null || password.length() < 8) {
			throw new IllegalArgumentException("Invalid password");
		}

		// User registration logic (simulated)
		System.out.println("User registered successfully");
	}
}
