package com.set.policymanagement;


import java.time.LocalDate;
import java.util.Objects;

// Policy class represents an insurance policy
class Policy {

	private int policyNumber; // Unique identifier
	private String policyHolderName;
	private LocalDate expiryDate;
	private String coverageType; // Health, Auto, Home
	private double premiumAmount;

	// Constructor
	public Policy(int policyNumber, String policyHolderName, LocalDate expiryDate, String coverageType,
			double premiumAmount) {

		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.expiryDate = expiryDate;
		this.coverageType = coverageType;
		this.premiumAmount = premiumAmount;
	}

	// Getters
	public int getPolicyNumber() {
		return policyNumber;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public String getCoverageType() {
		return coverageType;
	}

	// Override equals → uniqueness based on policy number
	@Override
	public boolean equals(Object o) {
		Policy p = (Policy) o;
		return this.policyNumber == p.policyNumber;
	}

	// Override hashCode
	@Override
	public int hashCode() {
		return Objects.hash(policyNumber);
	}

	@Override
	public String toString() {
		return "Policy{" + "Number=" + policyNumber + ", Name='" + policyHolderName + '\'' + ", Expiry=" + expiryDate
				+ ", Coverage='" + coverageType + '\'' + ", Premium=" + premiumAmount + '}';
	}
}