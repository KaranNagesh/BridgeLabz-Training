package com.objectmodelling.bankandaccountholder;

public class Main {
	public static void main(String[] args) {
		
		//Creating object of bank class 
		Bank bank = new Bank("State Bank");
		
		
		//Creating object of customer class
		Customer customer = new Customer("Karan" , 5000);
		bank.openAccount(customer);
		
		
		
		//Accessing methods of customer class
		customer.deposit(2000);
		customer.viewBalance();
		
	}
}
