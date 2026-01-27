package com.regexandjunit.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizedWord {

	public static void main(String[] args) {

		String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

		// Regex for capitalized words
		String regex = "\\b[A-Z][a-z]+\\b";

		// Compile pattern
		Pattern pattern = Pattern.compile(regex);

		// Create matcher
		Matcher matcher = pattern.matcher(text);

		// Find and print all capitalized words
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
