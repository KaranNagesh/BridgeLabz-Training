package sorting;


public class MergeSort {

    // Main merge sort method
    public static void mergeSort(int[] prices, int left, int right) {

        if (left < right) {

            // Find the middle index
            int mid = left + (right - left) / 2;

            // Recursively sort left half
            mergeSort(prices, left, mid);

            // Recursively sort right half
            mergeSort(prices, mid + 1, right);

            // Merge the sorted halves
            merge(prices, left, mid, right);
        }
    }

    // Merge two sorted subarrays
    private static void merge(int[] prices, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data into temporary arrays
        for (int i = 0; i < n1; i++)
            leftArr[i] = prices[left + i];

        for (int j = 0; j < n2; j++)
            rightArr[j] = prices[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge the temporary arrays back into prices[]
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                prices[k++] = leftArr[i++];
            } else {
                prices[k++] = rightArr[j++];
            }
        }

        // Copy remaining elements of leftArr, if any
        while (i < n1) {
            prices[k++] = leftArr[i++];
        }

        // Copy remaining elements of rightArr, if any
        while (j < n2) {
            prices[k++] = rightArr[j++];
        }
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int price : arr) {
            System.out.print(price + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] bookPrices = {450, 299, 799, 120, 999, 650};

        System.out.println("Book prices before sorting:");
        printArray(bookPrices);

        mergeSort(bookPrices, 0, bookPrices.length - 1);

        System.out.println("Book prices after sorting (Ascending Order):");
        printArray(bookPrices);
    }
}