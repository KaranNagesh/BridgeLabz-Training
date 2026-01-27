package com.regexandjunit.regex;

import java.util.Arrays;
import java.util.List;

public class BadWordCensor {

	public static void main(String[] args) {

		String input = "This is a damn bad example with some stupid words.";

		// List of bad words
		List<String> badWords = Arrays.asList("damn", "stupid");

		// Build regex: (?i)\b(word1|word2|...)\b
		String regex = "(?i)\\b(" + String.join("|", badWords) + ")\\b";

		// Replace bad words with ****
		String output = input.replaceAll(regex, "****");

		// Print result
		System.out.println(output);
	}
}
