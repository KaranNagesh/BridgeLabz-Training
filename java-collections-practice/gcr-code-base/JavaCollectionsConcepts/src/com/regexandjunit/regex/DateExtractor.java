package com.regexandjunit.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateExtractor {

	public static void main(String[] args) {

		String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

		// Regex for dd/mm/yyyy format
		String regex = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}\\b";

		// Compile pattern
		Pattern pattern = Pattern.compile(regex);

		// Create matcher
		Matcher matcher = pattern.matcher(text);

		// Find and print all matching dates
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
