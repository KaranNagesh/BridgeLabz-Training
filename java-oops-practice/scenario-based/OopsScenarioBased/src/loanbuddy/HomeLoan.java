
package loanbuddy;

public class HomeLoan extends LoanApplication{
	  public HomeLoan(double loanAmount, int term) {
	        super(loanAmount, term, 10.5);
	    }

	    @Override
	    public boolean approveLoan(Application applicant) {
	        boolean status = applicant.getCreditScore() >= 650 &&
	                         applicant.getIncome() >= loanAmount / 8;
	        setApproved(status);
	        return status;
	    }

	    @Override
	    public double calculateEMI() {
	        return calculateEMIFormula() + 500; // processing fee logic
	    }
}
