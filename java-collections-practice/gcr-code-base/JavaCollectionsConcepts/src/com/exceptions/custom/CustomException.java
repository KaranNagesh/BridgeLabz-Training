package com.exceptions.custom;

import java.util.Scanner;

public class CustomException {

	// Method that validates age
	static void validateAge(int age) throws InvalidAgeException {

		// If age is below 18, throw custom exception
		if (age < 18) {
			throw new InvalidAgeException("Age must be 18 or above");
		}

		// If valid age
		System.out.println("Access granted!");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			// Take age input from user
			System.out.print("Enter your age: ");
			int age = sc.nextInt();

			// Call validation method
			validateAge(age);

		} catch (InvalidAgeException e) {
			// Handle custom exception
			System.out.println(e.getMessage());

		} finally {
			sc.close(); // Close scanner
		}
	}
}