import java.util.Scanner;

public class TrimStringWithoutTrim {

    // Method to find start and end index after trimming spaces
    // Returns an int array: [startIndex, endIndex]
    public static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with leading/trailing spaces: ");
        String input = sc.nextLine();

        // User-defined trim logic
        int[] indexes = findTrimIndexes(input);
        String trimmedByUser = createSubstring(
                input, indexes[0], indexes[1]);

        // Built-in trim
        String trimmedByBuiltIn = input.trim();

        // Compare results
        boolean isSame = compareStrings(
                trimmedByUser, trimmedByBuiltIn);

        System.out.println("\nTrimmed string (User Method): '" + trimmedByUser + "'");
        System.out.println("Trimmed string (Built-in trim): '" + trimmedByBuiltIn + "'");
        System.out.println("Both strings are equal: " + isSame);

        sc.close();
    }
}
