import java.util.Scanner;

public class CharacterFrequencyNested {

    // Method to find character frequency using nested loops
    public static String[] findFrequency(String text) {

        // Convert string to character array
        char[] chars = text.toCharArray();
        int length = chars.length;

        // Frequency array
        int[] freq = new int[length];

        // Nested loops to calculate frequency
        for (int i = 0; i < length; i++) {
            freq[i] = 1;

            if (chars[i] == '0') {
                continue;
            }

            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark duplicate
                }
            }
        }

        // Count unique characters
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        // Create 1D String array to store result
        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " : " + freq[i];
                index++;
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        String[] frequencyResult = findFrequency(text);

        System.out.println("\nCharacter Frequencies:");
        for (String s : frequencyResult) {
            System.out.println(s);
        }
    }
}
