package com.objectmodelling.bankandaccountholder;

public class Bank {
	
	private String bankName;
	
	public Bank(String bankName) {
		this.bankName = bankName;
	}
	
	
    void openAccount(Customer customer) {
		System.out.println("Account opened for " + customer.getName() + " in " + bankName);
	}
	
}
