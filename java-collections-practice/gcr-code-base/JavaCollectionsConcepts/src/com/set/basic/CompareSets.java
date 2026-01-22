package com.set.basic;

import java.util.HashSet;
import java.util.Set;

public class CompareSets {

	// Method to check if two sets are equal
	static boolean areSetsEqual(Set<Integer> set1, Set<Integer> set2) {

		// equals() checks size and elements (order-independent)
		return set1.equals(set2);
	}

	public static void main(String[] args) {

		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);

		Set<Integer> set2 = new HashSet<>();
		set2.add(3);
		set2.add(2);
		set2.add(1);

		System.out.println("Are sets equal? " + areSetsEqual(set1, set2));
	}
}