package com.regexandjunit.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SSNValidator {

	public static void main(String[] args) {

		String text = "My SSN is 123-45-6789.";

		// Regex for SSN validation
		String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);

		// Check and print result
		if (matcher.find()) {
			System.out.println("Valid SSN: " + matcher.group());
		} else {
			System.out.println("Invalid SSN");
		}
	}
}
