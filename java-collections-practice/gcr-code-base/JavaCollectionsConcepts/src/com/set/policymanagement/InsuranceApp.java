package com.set.policymanagement;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class InsuranceApp {

	public static void main(String[] args) {

		PolicyManager manager = new PolicyManager();

		// Creating policies
		Policy p1 = new Policy(101, "Karan Nagesh", LocalDate.now().plusDays(10), "Health", 12000);

		Policy p2 = new Policy(102, "Ravi Sharma", LocalDate.now().plusDays(40), "Auto", 8000);

		Policy p3 = new Policy(103, "Neha Patel", LocalDate.now().plusDays(20), "Home", 15000);

		Policy p4 = new Policy(101, "Duplicate Policy", LocalDate.now().plusDays(15), "Health", 12000);

		// Adding policies
		manager.addPolicy(p1);
		manager.addPolicy(p2);
		manager.addPolicy(p3);
		manager.addPolicy(p4); // duplicate (ignored in sets)

		// Display all
		manager.displayAllPolicies();

		// Expiring soon
		manager.policiesExpiringSoon();

		// Coverage filter
		manager.policiesByCoverage("Health");

		// Duplicate detection using list
		List<Policy> policyList = new ArrayList<>();
		policyList.add(p1);
		policyList.add(p2);
		policyList.add(p3);
		policyList.add(p4);

		manager.findDuplicates(policyList);

		// Performance comparison
		performanceTest();
	}

	// Performance comparison
	static void performanceTest() {

		System.out.println("\n--- Performance Comparison ---");

		Set<Integer> hashSet = new HashSet<>();
		Set<Integer> linkedHashSet = new LinkedHashSet<>();
		Set<Integer> treeSet = new TreeSet<>();

		int n = 100000;

		long start, end;

		// HashSet
		start = System.nanoTime();
		for (int i = 0; i < n; i++)
			hashSet.add(i);
		end = System.nanoTime();
		System.out.println("HashSet add time: " + (end - start));

		// LinkedHashSet
		start = System.nanoTime();
		for (int i = 0; i < n; i++)
			linkedHashSet.add(i);
		end = System.nanoTime();
		System.out.println("LinkedHashSet add time: " + (end - start));

		// TreeSet
		start = System.nanoTime();
		for (int i = 0; i < n; i++)
			treeSet.add(i);
		end = System.nanoTime();
		System.out.println("TreeSet add time: " + (end - start));
	}
}