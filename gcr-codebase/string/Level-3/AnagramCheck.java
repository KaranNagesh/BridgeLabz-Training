import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two texts are anagrams
    public static boolean isAnagram(String text1, String text2) {

        // Step 1: Check length
        if (text1.length() != text2.length()) {
            return false;
        }

        // Step 2: Frequency arrays for ASCII characters
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        // Step 3: Find frequency of characters in both texts
        for (int i = 0; i < text1.length(); i++) {
            char ch1 = text1.charAt(i);
            char ch2 = text2.charAt(i);
            freq1[ch1]++;
            freq2[ch2]++;
        }

        // Step 4: Compare frequency arrays
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first text:");
        String text1 = sc.nextLine();

        System.out.println("Enter second text:");
        String text2 = sc.nextLine();

        boolean result = isAnagram(text1, text2);

        if (result) {
            System.out.println("The given texts are Anagrams");
        } else {
            System.out.println("The given texts are NOT Anagrams");
        }
    }
}
