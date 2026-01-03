package com.encapsulationandpolymorphism.banksystem;

//SavingsAccount class
class SavingsAccount extends BankAccount implements Loanable {

private static final double INTEREST_RATE = 0.04; // 4% interest

public SavingsAccount(String accountNumber, String holderName, double balance) {
   super(accountNumber, holderName, balance);
}

// Interest calculation for savings account
@Override
public double calculateInterest() {
   return getBalance() * INTEREST_RATE;
}

// Apply for loan
@Override
public void applyForLoan(double loanAmount) {
   System.out.println("Loan of ₹" + loanAmount + " applied under Savings Account.");
}

// Loan eligibility based on balance
@Override
public double calculateLoanEligibility() {
   return getBalance() * 5; // Eligible up to 5 times balance
}
}