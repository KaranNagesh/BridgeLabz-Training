package com.inheritance.hirearchiallevel.bankaccounttypes;

//Superclass
public class BankAccount {

protected int accountNumber;
protected double balance;

//Parameterized constructor 
public BankAccount(int accountNumber, double balance) {
   this.accountNumber = accountNumber;
   this.balance = balance;
}

public void displayDetails() {
   System.out.println("Account Number: " + accountNumber);
   System.out.println("Balance: " + balance);
}
}