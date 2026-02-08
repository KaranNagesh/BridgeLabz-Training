
package com.multithreading.bankingsystem;

//Transaction represents ATM transaction
class Transaction implements Runnable {

	private BankAccount account; // Shared account
	private String customerName; // Customer name
	private int amount; // Withdrawal amount

	// Constructor
	public Transaction(BankAccount account, String customerName, int amount) {
		this.account = account;
		this.customerName = customerName;
		this.amount = amount;
	}

	@Override
	public void run() {

		// Display thread state before execution
		System.out.println("Thread State before run: " + Thread.currentThread().getState());

		// Perform withdrawal
		account.withdraw(customerName, amount);
	}
}
