import java.util.Scanner;

public class FindCharacterFrequency {

    // Method to find frequency of characters and return 2D array
    public static String[][] findCharacterFrequency(String text) {

        // Step 1: Frequency array for ASCII characters
        int[] freq = new int[256];

        // Step 2: Count frequency using charAt()
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Step 3: Count number of unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        // Step 4: Create 2D array to store character and frequency
        String[][] result = new String[uniqueCount][2];

        // Step 5: Store characters and their frequencies
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(freq[i]);
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

        String[][] frequencyResult = findCharacterFrequency(text);

        System.out.println("\nCharacter\tFrequency");
        for (int i = 0; i < frequencyResult.length; i++) {
            System.out.println(
                frequencyResult[i][0] + "\t\t" + frequencyResult[i][1]
            );
        }
    }
}
