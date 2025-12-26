import java.util.Scanner;

public class ReplaceWordInSentence {

    // Method to replace a word with another word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {

        // Split the sentence into words using space
        String[] words = sentence.split(" ");

        String result = "";

        // Traverse each word in the sentence
        for (int i = 0; i < words.length; i++) {

            // If current word matches the word to be replaced
            if (words[i].equals(oldWord)) {
                result += newWord;   // Replace with new word
            } else {
                result += words[i];  // Keep the original word
            }

            // Add space after each word except the last one
            if (i < words.length - 1) {
                result += " ";
            }
        }

        return result;
    }

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Taking sentence input
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Taking word to be replaced
        System.out.print("Enter the word to replace: ");
        String oldWord = sc.next();

        // Taking new word
        System.out.print("Enter the new word: ");
        String newWord = sc.next();

        // Calling replace method
        String modifiedSentence = replaceWord(sentence, oldWord, newWord);

        // Displaying the result
        System.out.println("Modified Sentence: " + modifiedSentence);

        sc.close();
    }
}
