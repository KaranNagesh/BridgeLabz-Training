package com.map.banksystem;

public class BankingApp {

	public static void main(String[] args) {

		BankingSystem bank = new BankingSystem();

		// Adding accounts
		bank.addAccount(1001, 5000);
		bank.addAccount(1002, 12000);
		bank.addAccount(1003, 8000);

		// Display accounts
		bank.displayAccounts();

		// Add withdrawal requests
		bank.requestWithdrawal(1001, 2000);
		bank.requestWithdrawal(1003, 9000);
		bank.requestWithdrawal(1002, 3000);

		// Process withdrawals
		bank.processWithdrawals();

		// Display sorted customers
		bank.displaySortedByBalance();
	}
}