package linearandbinartsearch;


import java.util.Scanner; // Import Scanner for user input

public class FirstAndLastOccurrence {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user for array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Take sorted array input
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Ask user for target element
        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        // Find first and last occurrence
        int first = findFirstOccurrence(arr, target);
        int last = findLastOccurrence(arr, target);

        // Display result
        if (first == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("First Occurrence Index: " + first);
            System.out.println("Last Occurrence Index : " + last);
        }

        // Close Scanner
        sc.close();
    }

    // Method to find first occurrence using Binary Search
    static int findFirstOccurrence(int[] arr, int target) {

        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;        // Possible first occurrence
                right = mid - 1;     // Search left side
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    // Method to find last occurrence using Binary Search
    static int findLastOccurrence(int[] arr, int target) {

        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;        // Possible last occurrence
                left = mid + 1;      // Search right side
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}