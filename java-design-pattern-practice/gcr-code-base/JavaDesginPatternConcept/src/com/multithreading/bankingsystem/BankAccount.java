
package com.multithreading.bankingsystem;

import java.time.LocalDateTime;

//BankAccount represents shared resource
class BankAccount {

	private int balance = 10000; // Initial balance

	// Withdraw method (NOT synchronized initially)
	public boolean withdraw(String customer, int amount) {

		// Display attempt details
		System.out.println("[" + Thread.currentThread().getName() + "] Attempting to withdraw " + amount + " at "
				+ LocalDateTime.now());

		// Check sufficient balance
		if (balance >= amount) {

			try {
				Thread.sleep(500); // Simulate processing delay
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			balance -= amount; // Deduct amount
			System.out.println("Transaction successful: " + customer + ", Amount: " + amount + ", Balance: " + balance);
			return true;

		} else {
			System.out.println("Transaction failed: " + customer + ", Insufficient balance");
			return false;
		}
	}

	// Getter for balance
	public int getBalance() {
		return balance;
	}
}
