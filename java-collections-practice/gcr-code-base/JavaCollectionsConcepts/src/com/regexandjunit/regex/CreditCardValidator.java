package com.regexandjunit.regex;

import java.util.Scanner;

public class CreditCardValidator {

	// Method to validate Visa or MasterCard
	public static boolean isValidCard(String cardNumber) {

		// Regex for Visa or MasterCard (16 digits)
		String regex = "^(4\\d{15}|5\\d{15})$";

		return cardNumber.matches(regex);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Take card number input
		System.out.print("Enter credit card number: ");
		String card = sc.nextLine();

		// Validate and print result
		if (isValidCard(card)) {
			System.out.println("Valid credit card number");
		} else {
			System.out.println("Invalid credit card number");
		}

		sc.close();
	}
}
