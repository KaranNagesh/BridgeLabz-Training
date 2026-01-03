package com.encapsulationandpolymorphism.banksystem;


//Abstract base class for all bank accounts
abstract class BankAccount {

// Private fields to ensure encapsulation
private String accountNumber;
private String holderName;
private double balance;

// Constructor to initialize account details
public BankAccount(String accountNumber, String holderName, double balance) {
   this.accountNumber = accountNumber;
   this.holderName = holderName;
   this.balance = balance;
}

// Concrete method to deposit money
public void deposit(double amount) {
   if (amount > 0) {
       balance += amount;
       System.out.println("Deposited ₹" + amount);
   }
}

// Concrete method to withdraw money
public void withdraw(double amount) {
   if (amount > 0 && balance >= amount) {
       balance -= amount;
       System.out.println("Withdrawn ₹" + amount);
   } else {
       System.out.println("Insufficient balance.");
   }
}

// Abstract method to calculate interest
public abstract double calculateInterest();

// Getter methods (controlled access)
public String getAccountNumber() {
   return accountNumber;
}

public String getHolderName() {
   return holderName;
}

public double getBalance() {
   return balance;
}

// Common method to display account details
public void displayAccountDetails() {
   System.out.println("Account Number : " + accountNumber);
   System.out.println("Holder Name    : " + holderName);
   System.out.println("Balance        : ₹" + balance);
}
}