package ewalletapplication;


//Main class to run the application
public class EWalletApp {

public static void main(String[] args) {

   // Creating user with PersonalWallet and referral bonus
   User user1 = new User(
           "Karan",
           new PersonalWallet(2000, true)
   );

   // Creating user with BusinessWallet (no referral bonus)
   User shop = new User(
           "TechStore",
           new BusinessWallet(10000, false)
   );

   // Display initial balances
   System.out.println("Karan Balance: ₹" + user1.getWallet().getBalance());
   System.out.println("Shop Balance: ₹" + shop.getWallet().getBalance());

   System.out.println("\n--- Transfers ---");

   // Personal wallet transfer
   user1.getWallet().transferTo(shop, 1000);

   // Business wallet transfer
   shop.getWallet().transferTo(user1, 2000);

   // Display final balances
   System.out.println("\n--- Final Balances ---");
   System.out.println("Karan Balance: ₹" + user1.getWallet().getBalance());
   System.out.println("Shop Balance: ₹" + shop.getWallet().getBalance());
}
}