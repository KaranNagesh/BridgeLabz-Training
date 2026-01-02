package com.inheritance.hirearchiallevel.bankaccounttypes;

//CheckingAccount inherits BankAccount
public class CheckingAccount extends BankAccount {

private double withdrawalLimit;

public CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
   super(accountNumber, balance);
   this.withdrawalLimit = withdrawalLimit;
}

public void displayAccountType() {
   System.out.println("Account Type: Checking Account");
   displayDetails();
   System.out.println("Withdrawal Limit: " + withdrawalLimit);
   System.out.println();
}
}