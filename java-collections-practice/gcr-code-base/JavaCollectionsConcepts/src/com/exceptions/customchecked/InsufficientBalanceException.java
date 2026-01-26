package com.exceptions.customchecked;

//Custom checked exception
class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException(String message) {
		super(message);
	}
}