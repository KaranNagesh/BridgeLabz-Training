package com.map.basic;


import java.util.*;

public class InvertMap {

	// Method to invert a map
	static <K, V> Map<V, List<K>> invertMap(Map<K, V> originalMap) {

		// Result map: value -> list of keys
		Map<V, List<K>> invertedMap = new HashMap<>();

		// Traverse original map
		for (Map.Entry<K, V> entry : originalMap.entrySet()) {

			K key = entry.getKey();
			V value = entry.getValue();

			// If value not present, create new list
			invertedMap.putIfAbsent(value, new ArrayList<>());

			// Add key to the list of that value
			invertedMap.get(value).add(key);
		}

		return invertedMap;
	}

	public static void main(String[] args) {

		// Input map
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 1);

		System.out.println("Original Map: " + map);

		// Invert map
		Map<Integer, List<String>> inverted = invertMap(map);

		System.out.println("Inverted Map: " + inverted);
	}
}