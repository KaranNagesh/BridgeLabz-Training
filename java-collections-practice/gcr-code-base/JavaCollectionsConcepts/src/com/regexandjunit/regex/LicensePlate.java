package com.regexandjunit.regex;
import java.util.*;

public class LicensePlate {
	public static void main(String[] args) {
		String pattern = "^[A-Z]{2}[0-9]{4}";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter License Plate Number : ");
		String licenceNumber = sc.nextLine().trim();
		
		if(licenceNumber.matches(pattern)) {
			System.out.println("Valid");
		} else {
			System.out.println("INvalid");
		}
		
	}
}
