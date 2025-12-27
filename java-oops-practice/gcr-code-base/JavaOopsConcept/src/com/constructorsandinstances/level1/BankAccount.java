package com.constructorandinstance.level1;

public class BankAccount {
	
	public int accountNumber;
	protected String accountHolder;
	private int balance;
	
	public void setBalance(int b) {
		balance = b;
	}
	public int getBalance() {
		return balance;
	}
	static class SavingsAccount extends BankAccount{
		void display(){
			System.out.println("Account Number : "+accountNumber);
			System.out.println("Account Holder: "+accountHolder);
			System.out.println("Balance : "+getBalance());
			
		}
	}
	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount();
			sa.accountNumber  = 1;
			sa.accountHolder = "carnel";
			sa.setBalance(1000);
		
            sa.display();
	}

}
