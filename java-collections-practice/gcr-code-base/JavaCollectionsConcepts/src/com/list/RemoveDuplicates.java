package com.list;


import java.util.*;

public class RemoveDuplicates {

	// Method to remove duplicates while maintaining order
	static List<Integer> removeDuplicates(List<Integer> list) {

		// LinkedHashSet preserves insertion order
		Set<Integer> set = new LinkedHashSet<>(list);

		// Convert set back to list
		return new ArrayList<>(set);
	}

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(3, 1, 2, 2, 3, 4);

		List<Integer> result = removeDuplicates(numbers);

		System.out.println("Result: " + result);
	}
}