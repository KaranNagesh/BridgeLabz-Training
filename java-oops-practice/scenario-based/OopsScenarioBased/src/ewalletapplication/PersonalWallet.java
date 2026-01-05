package ewalletapplication;


//PersonalWallet inherits Wallet
class PersonalWallet extends Wallet {

// Daily transfer limit for personal users
private static final double DAILY_LIMIT = 5000;

// Constructor calls parent Wallet constructor
public PersonalWallet(double initialAmount, boolean referralBonus) {
   super(initialAmount, referralBonus);
}

// Overridden transfer method (polymorphism)
@Override
public void transferTo(User receiver, double amount) {

   // Check daily transfer limit
   if (amount > DAILY_LIMIT) {
       System.out.println("Transfer exceeds personal wallet limit.");
       return;
   }

   // Try to debit amount
   if (debit(amount)) {
       // Credit amount to receiver's wallet
       receiver.getWallet().credit(amount);

       // Record transaction
       Transaction.record("Personal Transfer", amount);

       System.out.println("Transferred ₹" + amount + " to " + receiver.getName());
   } else {
       // Insufficient funds case
       System.out.println("Insufficient balance.");
   }
}
}