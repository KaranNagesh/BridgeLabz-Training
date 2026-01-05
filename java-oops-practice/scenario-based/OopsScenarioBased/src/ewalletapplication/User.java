package ewalletapplication;


//User class represents wallet owner
class User {

private String name;    // User name
private Wallet wallet;  // Associated wallet

// Constructor to initialize user
public User(String name, Wallet wallet) {
   this.name = name;
   this.wallet = wallet;
}

// Getter for user name
public String getName() {
   return name;
}

// Getter for wallet
public Wallet getWallet() {
   return wallet;
}
}