package hashmapandhashfunction;


import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    // Function to find longest consecutive sequence length
    public static int longestConsecutive(int[] nums) {

        if (nums.length == 0)
            return 0;

        Set<Integer> set = new HashSet<>();

        // Store all elements in HashSet
        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;

        // Traverse through set
        for (int num : set) {

            // Check if it's the start of a sequence
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int currentStreak = 1;

                // Count consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    // Main method
    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};

        System.out.println(
            "Length of Longest Consecutive Sequence: "
            + longestConsecutive(arr)
        );
    }
}
