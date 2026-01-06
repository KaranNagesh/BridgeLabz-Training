package mybank;

class CurrentAccount extends Account {
	private static final double interestRate = 10.0;
	public CurrentAccount(int accountNumber, double balance) {
		super(accountNumber, balance);

	}

	@Override
	public void calculateInterest() {
		double interest =  (getBalance() * interestRate) / 100;
		System.out.println("Your Interest Rate in Current Account is = " + interest);
	}

}
