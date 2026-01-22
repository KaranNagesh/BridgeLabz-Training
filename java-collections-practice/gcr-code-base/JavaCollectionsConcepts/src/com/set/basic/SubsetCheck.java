package com.set.basic;


import java.util.HashSet;
import java.util.Set;

public class SubsetCheck {

	// Method to check subset
	static boolean isSubset(Set<Integer> set1, Set<Integer> set2) {

		// Check if set2 contains all elements of set1
		return set2.containsAll(set1);
	}

	public static void main(String[] args) {

		// Creating Set1
		Set<Integer> set1 = new HashSet<>();
		set1.add(2);
		set1.add(3);

		// Creating Set2
		Set<Integer> set2 = new HashSet<>();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);

		// Print sets first
		System.out.println("Set1: " + set1);
		System.out.println("Set2: " + set2);

		// Check subset
		System.out.println("Is Set1 a subset of Set2? " + isSubset(set1, set2));
	}
}