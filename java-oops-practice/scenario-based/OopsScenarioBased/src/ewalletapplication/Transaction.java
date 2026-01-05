package ewalletapplication;

//Utility class to log transactions
class Transaction {

// Static method to record transaction details
public static void record(String type, double amount) {
   System.out.println(
       "Transaction Recorded: " + type + " | Amount: ₹" + amount
   );
}
}