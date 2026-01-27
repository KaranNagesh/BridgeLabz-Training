package com.regexandjunit.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgrammingLanguage {

	public static void main(String[] args) {

		String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

		// Regex for programming languages
		String regex = "\\b(Java|Python|JavaScript|Go)\\b";

		// Compile pattern
		Pattern pattern = Pattern.compile(regex);

		// Create matcher
		Matcher matcher = pattern.matcher(text);

		// Find and print all matches
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
