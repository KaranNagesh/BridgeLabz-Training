package linearandbinartsearch;


import java.util.Scanner; // Import Scanner for user input

public class PeakElement {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user for array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Take array input
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find peak element index
        int peakIndex = findPeakElement(arr);

        // Display result
        System.out.println("Peak element found at index: " + peakIndex);
        System.out.println("Peak element value: " + arr[peakIndex]);

        // Close Scanner
        sc.close();
    }

    // Method to find a peak element using Binary Search
    static int findPeakElement(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        // Binary Search loop
        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Check if mid is a peak (handle boundary conditions)
            boolean leftSmaller = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean rightSmaller = (mid == arr.length - 1) || (arr[mid] > arr[mid + 1]);

            // If both neighbors are smaller, mid is a peak
            if (leftSmaller && rightSmaller) {
                return mid;
            }

            // If left neighbor is greater, search left half
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            }
            // Else search right half
            else {
                left = mid + 1;
            }
        }

        // Control should never reach here for valid input
        return -1;
    }
}