package loanbuddy;

public interface IApprovable {
	boolean approveLoan(Application applicant);
	double calculateEMI();

}