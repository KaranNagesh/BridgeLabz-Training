package linearandbinartsearch;


import java.util.Arrays;
import java.util.Scanner;

public class LinearAndBinaryChallenge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // ---------- LINEAR SEARCH PART ----------
        int missing = findFirstMissingPositive(arr.clone());
        System.out.println("First Missing Positive Integer: " + missing);

        // ---------- BINARY SEARCH PART ----------
        System.out.print("Enter target element to search: ");
        int target = sc.nextInt();

        // Sort array before binary search
        Arrays.sort(arr);

        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Target found at index (after sorting): " + index);
        } else {
            System.out.println("Target not found.");
        }

        sc.close();
    }

    // ================= LINEAR SEARCH =================
    // Method to find first missing positive integer
    static int findFirstMissingPositive(int[] arr) {

        int n = arr.length;

        // Step 1: Mark visited positions
        for (int i = 0; i < n; i++) {
            int val = Math.abs(arr[i]);

            // Mark index if value is within range
            if (val >= 1 && val <= n) {
                if (arr[val - 1] > 0) {
                    arr[val - 1] = -arr[val - 1];
                }
            }
        }

        // Step 2: Find first positive index
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                return i + 1;
            }
        }

        // If all numbers from 1 to n are present
        return n + 1;
    }

    // ================= BINARY SEARCH =================
    // Method to perform binary search
    static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            } 
            else if (arr[mid] < target) {
                left = mid + 1; // Search right half
            } 
            else {
                right = mid - 1; // Search left half
            }
        }

        return -1; // Target not found
    }
}