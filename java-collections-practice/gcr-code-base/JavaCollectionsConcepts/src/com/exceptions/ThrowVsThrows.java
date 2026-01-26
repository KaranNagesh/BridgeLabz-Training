package com.exceptions;

public class ThrowVsThrows {

	// Method declares that it may throw IllegalArgumentException
	static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {

		// Validate input
		if (amount < 0 || rate < 0) {
			// Explicitly throw exception
			throw new IllegalArgumentException("Amount and rate must be positive");
		}

		// Simple interest calculation
		return (amount * rate * years) / 100;
	}

	public static void main(String[] args) {

		try {
			// Call method with sample values
			double interest = calculateInterest(10000, 5, 2);

			// Print result if valid
			System.out.println("Calculated Interest: " + interest);

		} catch (IllegalArgumentException e) {
			// Handle propagated exception
			System.out.println("Invalid input: Amount and rate must be positive");
		}
	}
}