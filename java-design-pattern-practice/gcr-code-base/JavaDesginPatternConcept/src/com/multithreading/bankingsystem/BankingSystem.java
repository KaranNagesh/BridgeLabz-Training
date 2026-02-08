package com.multithreading.bankingsystem;

public class BankingSystem {

	public static void main(String[] args) throws InterruptedException {

		// Shared bank account
		BankAccount account = new BankAccount();

		// Create transaction threads
		Thread t1 = new Thread(new Transaction(account, "Customer-1", 3000), "Customer-1");

		Thread t2 = new Thread(new Transaction(account, "Customer-2", 4000), "Customer-2");

		Thread t3 = new Thread(new Transaction(account, "Customer-3", 2000), "Customer-3");

		Thread t4 = new Thread(new Transaction(account, "Customer-4", 5000), "Customer-4");

		Thread t5 = new Thread(new Transaction(account, "Customer-5", 1500), "Customer-5");

		// Start all transactions
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

		// Main thread waits for all transactions
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();

		// Final balance
		System.out.println("Final Account Balance: " + account.getBalance());
	}
}