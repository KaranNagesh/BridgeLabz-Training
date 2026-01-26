package com.exceptions;


public class MultipleCatch{

	public static void main(String[] args) {

		// You can change this to null to test NullPointerException
		int[] numbers = { 10, 20, 30, 40, 50 };

		int index = 3; // Change index to test ArrayIndexOutOfBoundsException

		try {
			// Access array element at given index
			int value = numbers[index];

			// Print value if access is valid
			System.out.println("Value at index " + index + ": " + value);

		} catch (ArrayIndexOutOfBoundsException e) {
			// Handles invalid index access
			System.out.println("Invalid index!");

		} catch (NullPointerException e) {
			// Handles null array reference
			System.out.println("Array is not initialized!");
		}
	}
}