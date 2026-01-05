package ewalletapplication;

//Abstract base class for all wallet types
abstract class Wallet implements Transferrable {

// Private balance to enforce encapsulation
private double balance;

// Constructor to initialize wallet
// referralBonus decides whether to add extra money
public Wallet(double initialAmount, boolean referralBonus) {
   balance = initialAmount;

   // Add referral bonus if applicable
   if (referralBonus) {
       balance += 50;
   }
}

// Getter method to safely expose balance
public double getBalance() {
   return balance;
}

// Protected method to add money (accessible to subclasses only)
protected void credit(double amount) {
   balance += amount;
}

// Protected method to deduct money after checking balance
protected boolean debit(double amount) {
   if (balance >= amount) {
       balance -= amount;
       return true; // Successful deduction
   }
   return false; // Insufficient balance
}
}