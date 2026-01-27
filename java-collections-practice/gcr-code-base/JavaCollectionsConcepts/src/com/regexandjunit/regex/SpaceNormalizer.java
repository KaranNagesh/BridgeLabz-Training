package com.regexandjunit.regex;

public class SpaceNormalizer {

	public static void main(String[] args) {

		String input = "This   is   an    example   with    multiple   spaces.";

		// Replace multiple spaces with a single space
		String output = input.replaceAll("\\s+", " ");

		// Print result
		System.out.println(output);
	}
}
