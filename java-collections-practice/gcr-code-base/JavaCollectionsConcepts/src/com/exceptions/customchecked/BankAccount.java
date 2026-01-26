package com.exceptions.customchecked;


class BankAccount {

	private double balance;

	// Constructor
	public BankAccount(double balance) {
		this.balance = balance;
	}

	// Withdraw method
	public void withdraw(double amount) throws InsufficientBalanceException {

		// Unchecked exception for negative amount
		if (amount < 0) {
			throw new IllegalArgumentException("Invalid amount!");
		}

		// Checked exception for insufficient balance
		if (amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance!");
		}

		// Perform withdrawal
		balance -= amount;
		System.out.println("Withdrawal successful, new balance: " + balance);
	}
}
