package hashmapandhashfunction;


import java.util.HashSet;
import java.util.Set;

public class PairWithGivenSum {

    // Function to check if a pair exists
    public static boolean hasPair(int[] arr, int target) {

        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            int required = target - num;

            // Check if required element already exists
            if (set.contains(required)) {
                System.out.println("Pair found: " + num + " + " + required + " = " + target);
                return true;
            }

            // Store current number
            set.add(num);
        }

        return false;
    }

    // Main method
    public static void main(String[] args) {

        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        if (!hasPair(arr, target)) {
            System.out.println("No pair found");
        }
    }
}