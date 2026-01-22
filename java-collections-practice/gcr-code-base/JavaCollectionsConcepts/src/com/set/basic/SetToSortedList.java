package com.set.basic;

import java.util.*;

public class SetToSortedList {

	public static void main(String[] args) {

		// Creating a HashSet
		Set<Integer> set = new HashSet<>();
		set.add(5);
		set.add(3);
		set.add(9);
		set.add(1);

		// Print original set
		System.out.println("Original Set: " + set);

		// Convert Set to List
		List<Integer> sortedList = new ArrayList<>(set);

		// Sort the list in ascending order
		Collections.sort(sortedList);

		// Print sorted list
		System.out.println("Sorted List: " + sortedList);
	}
}
