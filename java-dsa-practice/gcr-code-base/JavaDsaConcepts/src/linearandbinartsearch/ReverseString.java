package linearandbinartsearch;


import java.util.Scanner; // Import Scanner for user input

public class ReverseString {

    public static void main(String[] args) {

        // Create Scanner object to read input from user
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Step 1: Create a StringBuilder object
        StringBuilder sb = new StringBuilder();

        // Step 2: Append the input string to StringBuilder
        sb.append(input);

        // Step 3: Reverse the string using reverse() method
        sb.reverse();

        // Step 4: Convert StringBuilder back to String
        String reversedString = sb.toString();

        // Display the reversed string
        System.out.println("Reversed String: " + reversedString);

        // Close Scanner
        sc.close();
    }
}