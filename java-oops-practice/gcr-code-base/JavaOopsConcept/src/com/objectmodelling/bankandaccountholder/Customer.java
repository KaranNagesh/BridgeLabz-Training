package com.objectmodelling.bankandaccountholder;

public class Customer {
	
	private String name;
	private double balance;
	
	public Customer(String name, double balance) {
		this.name = name;
		this.balance = balance;
		
	}
		public void viewBalance() {
			System.out.println(name + "'s balance : Rs." + balance);	
		
		}
		public void deposit(double amount) {
			balance += amount;
		}
		
		public String getName() {
			return this.name;
		}
		
}
