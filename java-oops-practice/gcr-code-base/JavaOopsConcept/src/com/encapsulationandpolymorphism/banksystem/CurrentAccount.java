package com.encapsulationandpolymorphism.banksystem;

//CurrentAccount class
class CurrentAccount extends BankAccount implements Loanable {

private static final double INTEREST_RATE = 0.02; // 2% interest

public CurrentAccount(String accountNumber, String holderName, double balance) {
   super(accountNumber, holderName, balance);
}

// Interest calculation for current account
@Override
public double calculateInterest() {
   return getBalance() * INTEREST_RATE;
}

// Apply for loan
@Override
public void applyForLoan(double loanAmount) {
   System.out.println("Business loan of ₹" + loanAmount + " applied under Current Account.");
}

// Loan eligibility for current account
@Override
public double calculateLoanEligibility() {
   return getBalance() * 10; // Higher eligibility
}
}
