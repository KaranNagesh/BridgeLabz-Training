package com.regexandjunit.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Set;
import java.util.LinkedHashSet;

public class RepeatingWordFinder {

	public static void main(String[] args) {

		String text = "This is is a repeated repeated word test.";

		// Regex for repeating words (case-insensitive)
		String regex = "\\b(\\w+)\\s+\\1\\b";

		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		Matcher matcher = pattern.matcher(text);

		// Use Set to avoid duplicate outputs
		Set<String> repeatingWords = new LinkedHashSet<>();

		while (matcher.find()) {
			repeatingWords.add(matcher.group(1));
		}

		// Print repeating words
		repeatingWords.forEach(System.out::println);
	}
}
