package linearandbinartsearch;

import java.util.Scanner; // Import Scanner for user input

public class RotationPoint {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user for array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Take array input (rotated sorted array)
        System.out.println("Enter elements of rotated sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find index of smallest element (rotation point)
        int rotationIndex = findRotationPoint(arr);

        // Display result
        System.out.println("Rotation point index: " + rotationIndex);
        System.out.println("Smallest element: " + arr[rotationIndex]);

        // Close Scanner
        sc.close();
    }

    // Method to find rotation point using Binary Search
    static int findRotationPoint(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        // Binary Search loop
        while (left < right) {

            // Find middle index
            int mid = left + (right - left) / 2;

            // If mid element is greater than right element,
            // smallest element lies in the right half
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            }
            // Otherwise, smallest element lies in left half (including mid)
            else {
                right = mid;
            }
        }

        // left == right → index of smallest element
        return left;
    }
}