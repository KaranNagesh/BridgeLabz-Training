package algorithmanalysis;


public class SearchPerformance {

    // Linear Search - O(N)
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search - O(log N)
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] dataSizes = {1000, 10000, 1_000_000};
        int target = -1; // worst case (element not present)

        for (int size : dataSizes) {

            int[] data = new int[size];

            // Fill array with sorted values
            for (int i = 0; i < size; i++) {
                data[i] = i;
            }

            // -------- Linear Search Timing --------
            long startLinear = System.nanoTime();
            linearSearch(data, target);
            long endLinear = System.nanoTime();

            long linearTime = endLinear - startLinear;

            // -------- Binary Search Timing --------
            // Data already sorted, so no need to sort again
            long startBinary = System.nanoTime();
            binarySearch(data, target);
            long endBinary = System.nanoTime();

            long binaryTime = endBinary - startBinary;

            // -------- Display Results --------
            System.out.println("Dataset Size: " + size);
            System.out.println("Linear Search Time: " + linearTime + " ns");
            System.out.println("Binary Search Time: " + binaryTime + " ns");
            System.out.println("-----------------------------------");
        }
    }
}