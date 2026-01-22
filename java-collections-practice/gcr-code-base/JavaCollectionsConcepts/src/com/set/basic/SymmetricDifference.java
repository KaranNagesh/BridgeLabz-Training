package com.set.basic;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {

	public static void main(String[] args) {

		// Creating first set
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);

		// Creating second set
		Set<Integer> set2 = new HashSet<>();
		set2.add(3);
		set2.add(4);
		set2.add(5);

		// Print original sets
		System.out.println("Set 1: " + set1);
		System.out.println("Set 2: " + set2);

		// Step 1: Find Union
		Set<Integer> union = new HashSet<>(set1);
		union.addAll(set2);

		// Step 2: Find Intersection
		Set<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);

		// Step 3: Remove intersection from union
		union.removeAll(intersection);

		// Final result: Symmetric Difference
		System.out.println("Symmetric Difference: " + union);
	}
}