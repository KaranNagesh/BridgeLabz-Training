package com.regexandjunit.regex;
import java.util.*;

public class ValidataUsername {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	String pattern = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
	
	System.out.println("Enter username : ");
	
	String username = sc.nextLine().trim();
	
	if(username.matches(pattern)) {
		System.out.println("valid username : " + username);
	} else {
		System.out.println("Invalid username : " + username);
	}
	
}
}