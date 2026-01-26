package com.exceptions;

import java.util.Scanner;

public class NestedTryCatch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Sample array
		int[] arr = { 10, 20, 30, 40, 50 };

		try {
			// Take index input
			System.out.print("Enter array index: ");
			int index = sc.nextInt();

			try {
				// Take divisor input
				System.out.print("Enter divisor: ");
				int divisor = sc.nextInt();

				// Access array element and divide
				int result = arr[index] / divisor;
				System.out.println("Result: " + result);

			} catch (ArithmeticException e) {
				// Handles division by zero
				System.out.println("Cannot divide by zero!");
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			// Handles invalid index access
			System.out.println("Invalid array index!");
		} finally {
			sc.close(); // Close scanner
		}
	}
}