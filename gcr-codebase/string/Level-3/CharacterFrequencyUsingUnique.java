import java.util.Scanner;

public class CharacterFrequencyUsingUnique {

    // Method to find unique characters using nested loops
    public static char[] uniqueCharacters(String text) {

        int length = text.length();
        char[] temp = new char[length];
        int uniqueCount = 0;

        // Outer loop to pick each character
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Inner loop to check previous characters
            for (int j = 0; j < i; j++) {
                if (currentChar == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            // Store if unique
            if (isUnique) {
                temp[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create exact sized array
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    // Method to find frequency using unique characters
    public static String[][] findFrequency(String text) {

        // Step 1: Frequency array (ASCII)
        int[] freq = new int[256];

        // Step 2: Count frequency using charAt()
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Step 3: Get unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Step 4: Create 2D array
        String[][] result = new String[uniqueChars.length][2];

        // Step 5: Store character and frequency
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        String[][] frequencyResult = findFrequency(text);

        System.out.println("\nCharacter\tFrequency");
        for (int i = 0; i < frequencyResult.length; i++) {
            System.out.println(
                frequencyResult[i][0] + "\t\t" + frequencyResult[i][1]
            );
        }
    }
}
