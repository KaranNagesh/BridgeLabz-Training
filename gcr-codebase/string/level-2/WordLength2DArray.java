import java.util.Scanner;

public class WordLength2DArray {

    // Method to find string length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // Stops when index is out of bounds
        }
        return count;
    }

    // Method to split text into words using charAt()
    public static String[] splitIntoWords(String text) {

        int wordCount = 0;
        boolean inWord = false;

        // Count words
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (text.charAt(i) == ' ') {
                inWord = false;
            }
        }

        String[] words = new String[wordCount];
        String word = "";
        int index = 0;

        // Extract words
        for (int i = 0; i < findLength(text); i++) {
            char ch = text.charAt(i);

            if (ch != ' ') {
                word += ch;
            } else if (!word.equals("")) {
                words[index++] = word;
                word = "";
            }
        }

        if (!word.equals("")) {
            words[index] = word;
        }

        return words;
    }

    // Method to create 2D array of words and their lengths
    public static String[][] createWordLengthArray(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitIntoWords(text);
        String[][] wordLengthData = createWordLengthArray(words);

        System.out.println("\nWord\tLength");

        for (int i = 0; i < wordLengthData.length; i++) {
            int length = Integer.parseInt(wordLengthData[i][1]);
            System.out.println(wordLengthData[i][0] + "\t" + length);
        }

        sc.close();
    }
}
