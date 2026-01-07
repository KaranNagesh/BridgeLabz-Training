package sorting;


public class InsertionSort {

    // Method to perform insertion sort
    public static void insertionSort(int[] employeeIds) {

        int n = employeeIds.length;

        // Traverse from the second element (index 1)
        for (int i = 1; i < n; i++) {

            int key = employeeIds[i];
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && employeeIds[j] > key) {
                employeeIds[j + 1] = employeeIds[j];
                j--;
            }

            // Insert key at its correct position
            employeeIds[j + 1] = key;
        }
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int id : arr) {
            System.out.print(id + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] employeeIds = {104, 102, 109, 101, 105};

        System.out.println("Employee IDs before sorting:");
        printArray(employeeIds);

        insertionSort(employeeIds);

        System.out.println("Employee IDs after sorting (Ascending Order):");
        printArray(employeeIds);
    }
}