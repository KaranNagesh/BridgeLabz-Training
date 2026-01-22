package com.map.banksystem;


import java.util.*;

//Banking system implementation
class BankingSystem {

	// Stores account number → balance
	private HashMap<Integer, Double> accounts = new HashMap<>();

	// Queue to process withdrawal requests
	private Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

	// Add new account
	public void addAccount(int accountNumber, double balance) {
		accounts.put(accountNumber, balance);
	}

	// Display all accounts
	public void displayAccounts() {
		System.out.println("Customer Accounts:");
		for (Map.Entry<Integer, Double> entry : accounts.entrySet()) {
			System.out.println("Account: " + entry.getKey() + " | Balance: ₹" + entry.getValue());
		}
	}

	// Add withdrawal request to queue
	public void requestWithdrawal(int accountNumber, double amount) {

		if (!accounts.containsKey(accountNumber)) {
			System.out.println("Account not found: " + accountNumber);
			return;
		}

		withdrawalQueue.add(new WithdrawalRequest(accountNumber, amount));
		System.out.println("Withdrawal request added for Account " + accountNumber + " → ₹" + amount);
	}

	// Process withdrawal requests (FIFO)
	public void processWithdrawals() {

		System.out.println("\nProcessing Withdrawals:");

		while (!withdrawalQueue.isEmpty()) {

			WithdrawalRequest request = withdrawalQueue.poll();
			double balance = accounts.get(request.accountNumber);

			if (balance >= request.amount) {
				accounts.put(request.accountNumber, balance - request.amount);
				System.out.println("Withdrawal successful: Account " + request.accountNumber + " → ₹" + request.amount);
			} else {
				System.out.println("Insufficient balance: Account " + request.accountNumber);
			}
		}
	}

	// Display customers sorted by balance
	public void displaySortedByBalance() {

		TreeMap<Double, List<Integer>> sortedMap = new TreeMap<>();

		for (Map.Entry<Integer, Double> entry : accounts.entrySet()) {
			sortedMap.putIfAbsent(entry.getValue(), new ArrayList<>());
			sortedMap.get(entry.getValue()).add(entry.getKey());
		}

		System.out.println("\nCustomers Sorted by Balance:");
		for (Map.Entry<Double, List<Integer>> entry : sortedMap.entrySet()) {
			for (Integer acc : entry.getValue()) {
				System.out.println("Account: " + acc + " | Balance: ₹" + entry.getKey());
			}
		}
	}
}