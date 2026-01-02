package com.inheritance.hirearchiallevel.bankaccounttypes;


//SavingsAccount inherits BankAccount
public class SavingsAccount extends BankAccount {

private double interestRate;

public SavingsAccount(int accountNumber, double balance, double interestRate) {
   super(accountNumber, balance);
   this.interestRate = interestRate;
}

public void displayAccountType() {
   System.out.println("Account Type: Savings Account");
   displayDetails();
   System.out.println("Interest Rate: " + interestRate + "%");
   System.out.println();
}
}