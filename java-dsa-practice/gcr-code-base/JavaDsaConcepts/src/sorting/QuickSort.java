package sorting;


public class QuickSort {

    // Main Quick Sort method
    public static void quickSort(int[] prices, int low, int high) {

        if (low < high) {

            // Partition index
            int pivotIndex = partition(prices, low, high);

            // Recursively sort elements before and after partition
            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    // Partition method
    private static int partition(int[] prices, int low, int high) {

        // Choose last element as pivot
        int pivot = prices[high];

        int i = low - 1;

        // Rearrange elements based on pivot
        for (int j = low; j < high; j++) {

            if (prices[j] < pivot) {
                i++;

                // Swap prices[i] and prices[j]
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // Place pivot in correct position
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int price : arr) {
            System.out.print(price + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] productPrices = {799, 299, 499, 199, 999, 649};

        System.out.println("Product prices before sorting:");
        printArray(productPrices);

        quickSort(productPrices, 0, productPrices.length - 1);

        System.out.println("Product prices after sorting (Ascending Order):");
        printArray(productPrices);
    }
}