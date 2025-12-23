import java.util.Scanner;

public class WordLengthAnalyzer {

    // Method to find length of string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // Exception ends counting
        }
        return count;
    }

    // Method to split text into words using charAt()
    public static String[] splitIntoWords(String text) {

        int wordCount = 0;
        boolean inWord = false;

        // Count number of words
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

        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }

        return data;
    }

    // Method to find shortest and longest word indexes
    // Returns: [shortestIndex, longestIndex]
    public static int[] findShortestAndLongest(String[][] data) {

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < data.length; i++) {
            int currentLength = Integer.parseInt(data[i][1]);

            if (currentLength < Integer.parseInt(data[minIndex][1])) {
                minIndex = i;
            }

            if (currentLength > Integer.parseInt(data[maxIndex][1])) {
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String[] words = splitIntoWords(text);
        String[][] wordLengthData = createWordLengthArray(words);
        int[] result = findShortestAndLongest(wordLengthData);

        System.out.println("\nWord\tLength");
        for (int i = 0; i < wordLengthData.length; i++) {
            System.out.println(
                wordLengthData[i][0] + "\t" + wordLengthData[i][1]
            );
        }

        System.out.println("\nShortest Word: " +
                wordLengthData[result[0]][0]);

        System.out.println("Longest Word: " +
                wordLengthData[result[1]][0]);

        sc.close();
    }
}
