package com.regexandjunit.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyExtractor {

	public static void main(String[] args) {

		String text = "The price is $45.99, and the discount is 10.50.";

		// Regex for currency values
		String regex = "\\$?\\d+(\\.\\d{2})?";

		// Compile pattern
		Pattern pattern = Pattern.compile(regex);

		// Create matcher
		Matcher matcher = pattern.matcher(text);

		// Find and print all currency values
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
