package sorting;


public class HeapSort {

    // Main heap sort function
    public static void heapSort(int[] salaries) {
        int n = salaries.length;

        // Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {

            // Move current root (largest) to end
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Restore heap property on reduced heap
            heapify(salaries, i, 0);
        }
    }

    // Heapify a subtree rooted at index i
    private static void heapify(int[] arr, int heapSize, int i) {

        int largest = i;          // Assume root is largest
        int left = 2 * i + 1;     // Left child
        int right = 2 * i + 2;    // Right child

        // If left child is larger than root
        if (left < heapSize && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < heapSize && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify affected subtree
            heapify(arr, heapSize, largest);
        }
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int salary : arr) {
            System.out.print(salary + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] salaryDemands = {45000, 70000, 55000, 90000, 60000};

        System.out.println("Salary demands before sorting:");
        printArray(salaryDemands);

        heapSort(salaryDemands);

        System.out.println("Salary demands after sorting (Ascending Order):");
        printArray(salaryDemands);
    }
}