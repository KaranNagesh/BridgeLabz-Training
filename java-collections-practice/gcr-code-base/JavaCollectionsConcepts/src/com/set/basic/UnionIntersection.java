package com.set.basic;


import java.util.HashSet;
import java.util.Set;

public class UnionIntersection {

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

		// Print original sets first
		System.out.println("Set 1: " + set1);
		System.out.println("Set 2: " + set2);

		// ----- Union -----
		Set<Integer> union = new HashSet<>(set1);
		union.addAll(set2);

		// ----- Intersection -----
		Set<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);

		// Print results
		System.out.println("Union: " + union);
		System.out.println("Intersection: " + intersection);
	}
}