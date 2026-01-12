package loanbuddy;

public class Loan {
	protected int loanAmount;
	protected int term;
	protected String type;
	
	Loan(int loanAmount, int term , String type){
		this.loanAmount = loanAmount;
		this.term = term;
		this.type = type;
	}
}
