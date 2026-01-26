package com.exceptions;


import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			// Ask user for first number
			System.out.print("Enter first number: ");
			int num1 = sc.nextInt();

			// Ask user for second number
			System.out.print("Enter second number: ");
			int num2 = sc.nextInt();

			// Perform division
			int result = num1 / num2;

			// Print result
			System.out.println("Result: " + result);

		} catch (ArithmeticException e) {
			// Handles division by zero
			System.out.println("Error: Cannot divide by zero");

		} catch (InputMismatchException e) {
			// Handles non-numeric input
			System.out.println("Error: Please enter valid numeric values");

		} finally {
			// Close scanner resource
			sc.close();
		}
	}
}