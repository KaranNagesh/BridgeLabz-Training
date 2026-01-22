package com.map.insuranceplicy;

import java.time.LocalDate;

//Represents an insurance policy
class Policy {

	private int policyNumber; // Unique identifier
	private String policyHolderName;
	private LocalDate expiryDate;
	private String coverageType;
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

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	@Override
	public String toString() {
		return "Policy{" + "Number=" + policyNumber + ", Holder='" + policyHolderName + '\'' + ", Expiry=" + expiryDate
				+ ", Coverage='" + coverageType + '\'' + ", Premium=" + premiumAmount + '}';
	}
}