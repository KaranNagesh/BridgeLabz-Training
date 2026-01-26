package com.exceptions.customchecked;


import java.util.Scanner;

public class BankTransactionSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BankAccount account = new BankAccount(5000); // Initial balance

		try {
			// Take withdrawal amount
			System.out.print("Enter withdrawal amount: ");
			double amount = sc.nextDouble();

			// Attempt withdrawal
			account.withdraw(amount);

		} catch (InsufficientBalanceException e) {
			// Handles custom checked exception
			System.out.println(e.getMessage());

		} catch (IllegalArgumentException e) {
			// Handles unchecked exception
			System.out.println(e.getMessage());

		} finally {
			sc.close(); // Cleanup
		}
	}
}