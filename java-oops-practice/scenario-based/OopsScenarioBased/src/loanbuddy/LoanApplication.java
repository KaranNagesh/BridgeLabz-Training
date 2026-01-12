
package loanbuddy;

public abstract class LoanApplication implements IApprovable {
	protected double loanAmount;
	protected int term;
	protected double interestRate;
	private boolean approved;
	
	public LoanApplication(double loanAmount, int term, double interestRate) {
		 this.loanAmount = loanAmount;
		this.term = term;
		this.interestRate = interestRate;
	}
	
	public void setApproved(boolean status) {
		this.approved = status;
	}
	
	public boolean isApproved() {
		return approved;
	}
	
	 protected double calculateEMIFormula() {
	        double r = interestRate / (12 * 100);
	        double n = term;
	        return (loanAmount * r * Math.pow(1 + r, n)) /
	               (Math.pow(1 + r, n) - 1);
	    }

}
