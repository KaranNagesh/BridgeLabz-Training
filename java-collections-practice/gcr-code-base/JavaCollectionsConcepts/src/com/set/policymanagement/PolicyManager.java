package com.set.policymanagement;


import java.time.LocalDate;
import java.util.*;

// Manages insurance policies
class PolicyManager {

	// Different sets for different purposes
	Set<Policy> hashSet = new HashSet<>(); // Fast lookup
	Set<Policy> linkedHashSet = new LinkedHashSet<>(); // Maintain insertion order
	Set<Policy> treeSet = new TreeSet<>( // Sorted by expiry date
			Comparator.comparing(Policy::getExpiryDate));

	// Add policy to all sets
	public void addPolicy(Policy policy) {
		hashSet.add(policy);
		linkedHashSet.add(policy);
		treeSet.add(policy);
	}

	// Display all unique policies
	public void displayAllPolicies() {
		System.out.println("\nAll Unique Policies:");
		for (Policy p : hashSet) {
			System.out.println(p);
		}
	}

	// Policies expiring within next 30 days
	public void policiesExpiringSoon() {
		System.out.println("\nPolicies Expiring in Next 30 Days:");
		LocalDate today = LocalDate.now();

		for (Policy p : treeSet) {
			if (!p.getExpiryDate().isAfter(today.plusDays(30))) {
				System.out.println(p);
			}
		}
	}

	// Policies by coverage type
	public void policiesByCoverage(String type) {
		System.out.println("\nPolicies with Coverage Type: " + type);
		for (Policy p : hashSet) {
			if (p.getCoverageType().equalsIgnoreCase(type)) {
				System.out.println(p);
			}
		}
	}

	// Find duplicate policies (by policy number)
	public void findDuplicates(List<Policy> list) {
		System.out.println("\nDuplicate Policies:");
		Set<Integer> seen = new HashSet<>();

		for (Policy p : list) {
			if (!seen.add(p.getPolicyNumber())) {
				System.out.println(p);
			}
		}
	}
}