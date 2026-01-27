package com.regexandjunit.regex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmail {
	public static void main(String[] args) {
		String text = "Contact us at support@example.com and info@company.org";
		
		Pattern pattern = Pattern.compile("[a-zA-Z0-9.%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
		
		Matcher matcher = pattern.matcher(text);
		
        System.out.println("Input text: " + text);
        System.out.println("Extracted email addresses:");
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
