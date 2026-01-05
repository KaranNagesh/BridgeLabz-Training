package hashmapandhashfunction;

import java.util.*;

public class ZeroSumSubarrays {

    public static void findZeroSumSubarrays(int[] arr) {

        // Map to store prefix sum and list of indices
        Map<Integer, List<Integer>> map = new HashMap<>();

        int prefixSum = 0;

        // Base case: prefix sum 0 at index -1
        map.put(0, new ArrayList<>(Arrays.asList(-1)));

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            // If prefix sum already exists, zero-sum subarrays found
            if (map.containsKey(prefixSum)) {
                for (int startIndex : map.get(prefixSum)) {
                    System.out.println(
                        "Zero-sum subarray found from index "
                        + (startIndex + 1) + " to " + i
                    );
                }
            }

            // Store current index for this prefix sum
            map.putIfAbsent(prefixSum, new ArrayList<>());
            map.get(prefixSum).add(i);
        }
    }

    // Main method
    public static void main(String[] args) {

        int[] arr = {3, 4, -7, 3, 1, 3, 1, -4};

        findZeroSumSubarrays(arr);
    }
}
