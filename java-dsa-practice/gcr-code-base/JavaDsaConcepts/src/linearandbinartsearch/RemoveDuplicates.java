package linearandbinartsearch;

import java.util.HashSet;   // Import HashSet to track unique characters
import java.util.Scanner;   // Import Scanner for user input

public class RemoveDuplicates {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Step 1: Initialize an empty StringBuilder
        StringBuilder sb = new StringBuilder();

        // Step 2: Initialize HashSet to store already seen characters
        HashSet<Character> seen = new HashSet<>();

        // Step 3: Traverse through each character of the string
        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            // Step 4: If character is not already present
            if (!seen.contains(ch)) {

                // Append character to StringBuilder
                sb.append(ch);

                // Add character to HashSet
                seen.add(ch);
            }
        }

        // Step 5: Convert StringBuilder to String
        String result = sb.toString();

        // Display result
        System.out.println("String after removing duplicates: " + result);

        // Close Scanner
        sc.close();
    }
}