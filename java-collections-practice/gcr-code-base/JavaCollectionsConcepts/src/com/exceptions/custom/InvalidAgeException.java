package com.exceptions.custom;


//Custom exception class
class InvalidAgeException extends Exception {

	// Constructor with custom message
	public InvalidAgeException(String message) {
		super(message);
	}
}