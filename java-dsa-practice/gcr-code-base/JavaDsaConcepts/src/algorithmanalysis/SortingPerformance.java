package algorithmanalysis;

import java.util.Random;

public class SortingPerformance {

    //BUBBLE SORT (O(N^2)) 
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // MERGE SORT (O(N log N))
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    //QUICK SORT (O(N log N))
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    //Main Method
    public static void main(String[] args) {

        int[] sizes = {1000, 10000}; 
        // Bubble sort skipped for very large data intentionally

        for (int size : sizes) {

            int[] arr1 = generateRandomArray(size);
            int[] arr2 = arr1.clone();
            int[] arr3 = arr1.clone();

            System.out.println("\nDataset Size: " + size);

            // Bubble Sort Timing
            long start = System.nanoTime();
            bubbleSort(arr1);
            long end = System.nanoTime();
            System.out.println("Bubble Sort Time: " + (end - start) + " ns");

            // Merge Sort Timing
            start = System.nanoTime();
            mergeSort(arr2, 0, arr2.length - 1);
            end = System.nanoTime();
            System.out.println("Merge Sort Time: " + (end - start) + " ns");

            // Quick Sort Timing
            start = System.nanoTime();
            quickSort(arr3, 0, arr3.length - 1);
            end = System.nanoTime();
            System.out.println("Quick Sort Time: " + (end - start) + " ns");
        }
    }

    // Generate random array
    static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100000);
        }
        return arr;
    }
}