package com.regexandjunit.regex;

import java.util.Scanner;

public class IPAddressValidator {

	// Method to validate IPv4 address
	public static boolean isValidIPv4(String ip) {

		String regex = "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.){3}"
				+ "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$";

		return ip.matches(regex);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Take IP input
		System.out.print("Enter IPv4 address: ");
		String ip = sc.nextLine();

		// Validate and print result
		if (isValidIPv4(ip)) {
			System.out.println("Valid IP address");
		} else {
			System.out.println("Invalid IP address");
		}

		sc.close();
	}
}
