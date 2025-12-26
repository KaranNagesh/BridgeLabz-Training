import java.util.Scanner;

public class MostFrequentCharacter {

    // Method to find most frequent character
    public static char findMostFrequentChar(String text) {

        // Frequency array for ASCII characters
        int[] freq = new int[256];

        char maxChar = text.charAt(0);
        int maxCount = 0;

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;

            // Update max frequency
            if (freq[text.charAt(i)] > maxCount) {
                maxCount = freq[text.charAt(i)];
                maxChar = text.charAt(i);
            }
        }
        return maxChar;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        System.out.println("Most Frequent Character: '" + findMostFrequentChar(input) + "'");

        sc.close();
    }
}
