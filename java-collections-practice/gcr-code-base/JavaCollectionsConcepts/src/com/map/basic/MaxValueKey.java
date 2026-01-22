package com.map.basic;

import java.util.HashMap;
import java.util.Map;

public class MaxValueKey {

	// Method to find key with maximum value
	static String getKeyWithMaxValue(Map<String, Integer> map) {

		String maxKey = null;
		int maxValue = Integer.MIN_VALUE;

		// Traverse map entries
		for (Map.Entry<String, Integer> entry : map.entrySet()) {

			if (entry.getValue() > maxValue) {
				maxValue = entry.getValue();
				maxKey = entry.getKey();
			}
		}
		return maxKey;
	}

	public static void main(String[] args) {

		// Input map
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 15);

		System.out.println("Key with highest value: " + getKeyWithMaxValue(map));
	}
}