import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find first non-repeating character
    public static char findFirstNonRepeatingChar(String text) {

        // Array to store frequency of ASCII characters
        int[] freq = new int[256];

        // First loop: count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Second loop: find first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }

        // If no non-repeating character found
        return '\0';
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        char result = findFirstNonRepeatingChar(text);

        if (result != '\0') {
            System.out.println("First non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }
    }
}
