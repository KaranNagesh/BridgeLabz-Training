package mybank;


class SavingsAccount extends Account {
	private static final double interestRate = 5.0;
	public SavingsAccount(int accountNumber, double balance) {
		super(accountNumber, balance);

	}

	@Override
	public void calculateInterest() {
		double interest =  (getBalance() * interestRate) / 100;
		System.out.println("Your Interest Rate in Saving Account is = " + interest);
	}


}