package com.map.insuranceplicy;
import java.time.LocalDate;

public class InsuranceApp {

	public static void main(String[] args) {

		PolicyManager manager = new PolicyManager();

		// Creating policies
		Policy p1 = new Policy(201, "Karan Nagesh", LocalDate.now().plusDays(15), "Health", 12000);

		Policy p2 = new Policy(202, "Ravi Sharma", LocalDate.now().plusDays(45), "Auto", 8000);

		Policy p3 = new Policy(203, "Karan Nagesh", LocalDate.now().minusDays(5), "Home", 15000);

		// Adding policies
		manager.addPolicy(p1);
		manager.addPolicy(p2);
		manager.addPolicy(p3);

		// Display all
		manager.displayAllPolicies();

		// Retrieve by policy number
		System.out.println("\nRetrieve Policy 201:");
		System.out.println(manager.getPolicyByNumber(201));

		// Expiring soon
		manager.policiesExpiringSoon();

		// Policies by policyholder
		manager.policiesByHolder("Arif Iqubal");

		// Remove expired policies
		manager.removeExpiredPolicies();

		// Display after removal
		manager.displayAllPolicies();
	}
}
