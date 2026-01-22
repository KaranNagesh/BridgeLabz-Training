package com.map.insuranceplicy;

import java.time.LocalDate;
import java.util.*;

// Manages insurance policies using different Maps
class PolicyManager {

	// 1️⃣ Storage Maps
	private Map<Integer, Policy> hashMap = new HashMap<>(); // Fast access
	private Map<Integer, Policy> linkedHashMap = new LinkedHashMap<>(); // Insertion order
	private TreeMap<LocalDate, List<Policy>> treeMap = new TreeMap<>(); // Sorted by expiry

	// Add policy to all maps
	public void addPolicy(Policy policy) {

		hashMap.put(policy.getPolicyNumber(), policy);
		linkedHashMap.put(policy.getPolicyNumber(), policy);

		// Store in TreeMap by expiry date
		treeMap.putIfAbsent(policy.getExpiryDate(), new ArrayList<>());
		treeMap.get(policy.getExpiryDate()).add(policy);
	}

	// 2️⃣ Retrieve policy by number
	public Policy getPolicyByNumber(int policyNumber) {
		return hashMap.get(policyNumber);
	}

	// 3️⃣ List policies expiring in next 30 days
	public void policiesExpiringSoon() {

		System.out.println("\nPolicies Expiring in Next 30 Days:");
		LocalDate today = LocalDate.now();
		LocalDate limit = today.plusDays(30);

		for (Map.Entry<LocalDate, List<Policy>> entry : treeMap.entrySet()) {
			if (!entry.getKey().isAfter(limit)) {
				for (Policy p : entry.getValue()) {
					System.out.println(p);
				}
			}
		}
	}

	// 4️⃣ List policies for a specific policyholder
	public void policiesByHolder(String name) {

		System.out.println("\nPolicies for Policyholder: " + name);
		for (Policy p : hashMap.values()) {
			if (p.getPolicyHolderName().equalsIgnoreCase(name)) {
				System.out.println(p);
			}
		}
	}

	// 5️⃣ Remove expired policies
	public void removeExpiredPolicies() {

		LocalDate today = LocalDate.now();

		Iterator<Map.Entry<Integer, Policy>> iterator = hashMap.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry<Integer, Policy> entry = iterator.next();

			if (entry.getValue().getExpiryDate().isBefore(today)) {
				iterator.remove();
				linkedHashMap.remove(entry.getKey());
			}
		}

		// Clean TreeMap
		treeMap.headMap(today).clear();

		System.out.println("\nExpired policies removed.");
	}

	// Display all policies (Insertion Order)
	public void displayAllPolicies() {
		System.out.println("\nAll Policies (Insertion Order):");
		for (Policy p : linkedHashMap.values()) {
			System.out.println(p);
		}
	}
}