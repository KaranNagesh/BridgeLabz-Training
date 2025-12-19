package com.basics;

import java.util.Scanner;

public class Armstrong {

    // Method to count the number of digits in a number
    public static int countDigits(int num) {
        int count = 0;

        // Loop until number becomes 0
        while (num != 0) {
            count++;        // Increment digit count
            num /= 10;      // Remove last digit
        }
        return count;
    }

    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Read number from user
        int num = sc.nextInt();

        // Store original number for comparison
        int originalNumber = num;

        // Count number of digits
        int digits = countDigits(num);

        // Variable to store sum of powers of digits
        int sum = 0;

        // Loop to calculate Armstrong sum
        while (num != 0) {

            int digit = num % 10;                 // Extract last digit
            sum += (int) Math.pow(digit, digits); // digit^digits
            num /= 10;                            // Remove last digit
        }

        // Check Armstrong condition
        if (sum == originalNumber) {
            System.out.println("Valid Armstrong Number");
        } else {
            System.out.println("Invalid Armstrong Number");
        }

       
    }
}
