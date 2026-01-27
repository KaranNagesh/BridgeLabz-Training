package com.regexandjunit.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkExtractor {

	public static void main(String[] args) {

		String text = "Visit https://www.google.com and http://example.org for more info.";

		// Regex for extracting URLs
		String regex = "https?://[^\\s]+";

		// Compile the pattern
		Pattern pattern = Pattern.compile(regex);

		// Create matcher
		Matcher matcher = pattern.matcher(text);

		// Find and print all links
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
