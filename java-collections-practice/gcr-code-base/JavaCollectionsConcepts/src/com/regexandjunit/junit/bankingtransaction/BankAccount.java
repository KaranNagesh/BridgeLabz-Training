package com.regexandjunit.junit.bankingtransaction;

public class BankAccount {

	// Stores current account balance
	private double balance;

	// Initializes account with zero balance
	public BankAccount() {
		this.balance = 0.0;
	}

	// Adds amount to the balance
	public void deposit(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Deposit amount must be positive");
		}
		balance += amount;
	}

	// Withdraws amount if sufficient balance is available
	public void withdraw(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Withdrawal amount must be positive");
		}
		if (amount > balance) {
			throw new IllegalStateException("Insufficient funds");
		}
		balance -= amount;
	}

	// Returns current account balance
	public double getBalance() {
		return balance;
	}
}
