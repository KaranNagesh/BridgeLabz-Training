package linearandbinartsearch;

import java.util.Scanner; // Import Scanner for user input

public class FirstNegative {

    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Ask user for size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Take array elements input
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call linear search method
        int index = findFirstNegative(arr);

        // Display result
        if (index != -1) {
            System.out.println("First negative number found at index: " + index);
        } else {
            System.out.println("No negative number found in the array.");
        }

        // Close Scanner
        sc.close();
    }

    // Method to find first negative number using Linear Search
    static int findFirstNegative(int[] arr) {

        // Traverse array from start
        for (int i = 0; i < arr.length; i++) {

            // Check if element is negative
            if (arr[i] < 0) {
                return i; // Return index of first negative number
            }
        }

        // Return -1 if no negative number found
        return -1;
    }
}