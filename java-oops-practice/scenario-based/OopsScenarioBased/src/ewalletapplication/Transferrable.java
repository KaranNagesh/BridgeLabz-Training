package ewalletapplication;

//Interface defining money transfer capability
interface Transferrable {

// Method to transfer money to another user
void transferTo(User receiver, double amount);
}