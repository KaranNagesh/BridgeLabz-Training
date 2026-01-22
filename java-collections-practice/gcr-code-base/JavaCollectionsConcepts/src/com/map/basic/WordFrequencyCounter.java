package com.map.basic;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

	public static void main(String[] args) {

		String text = "Hello world, hello Java!";

		// Convert to lowercase and remove punctuation
		text = text.toLowerCase().replaceAll("[^a-z ]", "");

		// Split text into words
		String[] words = text.split("\\s+");

		// HashMap to store word frequency
		Map<String, Integer> frequencyMap = new HashMap<>();

		// Count frequency
		for (String word : words) {
			frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
		}

		// Print result
		System.out.println(frequencyMap);
	}
} 