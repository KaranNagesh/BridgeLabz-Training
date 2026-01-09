package linearandbinartsearch;


import java.util.Scanner; // Import Scanner for user input

public class BinarySearch2DMatrix {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user for number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Take matrix input
        System.out.println("Enter matrix elements (row-wise sorted):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Ask user for target value
        System.out.print("Enter target value to search: ");
        int target = sc.nextInt();

        // Perform binary search in matrix
        boolean found = searchMatrix(matrix, rows, cols, target);

        // Display result
        if (found) {
            System.out.println("Target value FOUND in the matrix.");
        } else {
            System.out.println("Target value NOT FOUND in the matrix.");
        }

        // Close Scanner
        sc.close();
    }

    // Method to perform binary search in a 2D matrix
    static boolean searchMatrix(int[][] matrix, int rows, int cols, int target) {

        int left = 0;
        int right = rows * cols - 1;

        // Binary search loop
        while (left <= right) {

            // Find middle index
            int mid = left + (right - left) / 2;

            // Convert 1D index to 2D indices
            int row = mid / cols;
            int col = mid % cols;

            int midElement = matrix[row][col];

            // Compare middle element with target
            if (midElement == target) {
                return true;
            }
            // If target is smaller, search left half
            else if (target < midElement) {
                right = mid - 1;
            }
            // If target is larger, search right half
            else {
                left = mid + 1;
            }
        }

        // Target not found
        return false;
    }
}