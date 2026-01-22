package com.list;

import java.util.*;

public class FrequencyCounter {

	// Method to count frequency of elements
	static Map<String, Integer> countFrequency(List<String> list) {

		// Map to store element and its frequency
		Map<String, Integer> frequencyMap = new HashMap<>();

		// Traverse each element in the list
		for (String item : list) {

			// If element already exists, increase count
			if (frequencyMap.containsKey(item)) {
				frequencyMap.put(item, frequencyMap.get(item) + 1);
			}
			// If element does not exist, add with count 1
			else {
				frequencyMap.put(item, 1);
			}
		}
		return frequencyMap;
	}

	public static void main(String[] args) {

		// Input list
		List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange");

		// Calling frequency method
		Map<String, Integer> result = countFrequency(fruits);

		// Displaying output
		System.out.println("Frequency of elements: " + result);
	}
}