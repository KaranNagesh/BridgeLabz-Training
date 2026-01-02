package com.inheritance.hirearchiallevel.bankaccounttypes;

//FixedDepositAccount inherits BankAccount
public class FixedDepositAccount extends BankAccount {

private int lockInPeriod; // in months

public FixedDepositAccount(int accountNumber, double balance, int lockInPeriod) {
   super(accountNumber, balance);
   this.lockInPeriod = lockInPeriod;
}

public void displayAccountType() {
   System.out.println("Account Type: Fixed Deposit Account");
   displayDetails();
   System.out.println("Lock-in Period: " + lockInPeriod + " months");
   System.out.println();
}
}