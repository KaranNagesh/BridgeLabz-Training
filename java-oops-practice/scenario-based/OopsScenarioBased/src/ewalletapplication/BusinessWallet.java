package ewalletapplication;


//BusinessWallet inherits Wallet
class BusinessWallet extends Wallet {

// Tax rate applied on business transactions
private static final double TAX_RATE = 0.02; // 2%

// Constructor calls parent constructor
public BusinessWallet(double initialAmount, boolean referralBonus) {
   super(initialAmount, referralBonus);
}

// Overridden transfer method with business rules
@Override
public void transferTo(User receiver, double amount) {

   // Calculate tax on transaction
   double tax = amount * TAX_RATE;

   // Total amount to be deducted (amount + tax)
   double totalDeduction = amount + tax;

   // Check if sufficient balance exists
   if (debit(totalDeduction)) {
       // Credit receiver only with actual transfer amount
       receiver.getWallet().credit(amount);

       // Record transaction with tax info
       Transaction.record("Business Transfer (Tax: ₹" + tax + ")", amount);

       System.out.println("Transferred ₹" + amount + " with tax ₹" + tax);
   } else {
       // Insufficient funds including tax
       System.out.println("Insufficient balance including tax.");
   }
}
}