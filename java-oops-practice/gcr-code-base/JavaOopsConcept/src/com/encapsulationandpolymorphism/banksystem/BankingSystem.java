package com.encapsulationandpolymorphism.banksystem;


import java.util.ArrayList;
import java.util.List;

// Main application class
public class BankingSystem {

    public static void main(String[] args) {

        // Creating list of bank accounts (Polymorphism)
        List<BankAccount> accounts = new ArrayList<>();

        // Creating different account types
        BankAccount acc1 = new SavingsAccount("SB101", "Arif", 50000);
        BankAccount acc2 = new CurrentAccount("CA201", "TechCorp", 200000);

        // Adding accounts to list
        accounts.add(acc1);
        accounts.add(acc2);

        // Processing accounts polymorphically
        for (BankAccount account : accounts) {

            account.displayAccountDetails();

            // Deposit and withdraw operations
            account.deposit(5000);
            account.withdraw(3000);

            // Dynamic interest calculation
            double interest = account.calculateInterest();
            System.out.println("Calculated Interest : ₹" + interest);

            // Loan processing (interface usage)
            if (account instanceof Loanable) {
                Loanable loanAccount = (Loanable) account;
                loanAccount.applyForLoan(100000);
                System.out.println("Loan Eligibility : ₹" + loanAccount.calculateLoanEligibility());
            }

            System.out.println("-----------------------------------");
        }
    }
}