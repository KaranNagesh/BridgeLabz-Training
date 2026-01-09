package linearandbinartsearch;

import java.util.Scanner;

public class ConcatenateStrings {

    public static void main(String[] args) {

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Ask user for number of strings
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        // Create StringBuffer object for efficient concatenation
        StringBuffer buffer = new StringBuffer();

        // Take string inputs from user
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {

            String input = sc.nextLine();

            // Append each string to StringBuffer
            buffer.append(input);
        }

        // Convert StringBuffer to String
        String result = buffer.toString();

        // Display final concatenated string
        System.out.println("Concatenated String: " + result);

        // Close Scanner
        sc.close();
    }
}
