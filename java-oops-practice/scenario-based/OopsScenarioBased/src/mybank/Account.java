package mybank;
public abstract class Account implements ITransaction {
	protected int accountNumber;
	private double balance;
	
	
		// getters
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	// Constructor
	public Account(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
		}
		System.out.println("Deposit amount = " + amount);
		System.out.println("Total Balance = " + balance);
	}
	
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal amount = " + amount);
			System.out.println("Total Balance = " + balance);
		} else {
			System.out.println("You dont have sufficient balance");
		}
	}
	
	public void checkBalance() {
		System.out.println("Balance = " + getBalance() );
	}
	
	public abstract void calculateInterest();
	

}