package linearandbinartsearch;

import java.util.Scanner; // Import Scanner for user input

public class WordInSentences {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user for number of sentences
        System.out.print("Enter number of sentences: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        // Declare array to store sentences
        String[] sentences = new String[n];

        // Take sentence input
        System.out.println("Enter the sentences:");
        for (int i = 0; i < n; i++) {
            sentences[i] = sc.nextLine();
        }

        // Ask user for the word to search
        System.out.print("Enter the word to search: ");
        String word = sc.nextLine();

        // Call linear search method
        String result = findSentenceContainingWord(sentences, word);

        // Display result
        System.out.println("Result: " + result);

        // Close Scanner
        sc.close();
    }

    // Method to perform linear search on sentences
    static String findSentenceContainingWord(String[] sentences, String word) {

        // Traverse sentences one by one
        for (String sentence : sentences) {

            // Check if sentence contains the word (case-insensitive)
            if (sentence.toLowerCase().contains(word.toLowerCase())) {
                return sentence; // Return first matching sentence
            }
        }

        // If word is not found in any sentence
        return "Not Found";
    }
}