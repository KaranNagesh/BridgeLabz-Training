package loanbuddy;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Application applicant = new Application(
                "Karan",
                72000,
                60555000,
                500000
        );

        LoanApplication loan = new HomeLoan(500000, 240);

        if (loan.approveLoan(applicant)) {
            System.out.println("Loan Approved!");
            System.out.println("Monthly EMI: ₹" + loan.calculateEMI());
        } else {
            System.out.println("Loan Rejected.");
        }
	}
}
