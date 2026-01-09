package linearandbinartsearch;


import java.io.BufferedReader; // For reading lines efficiently
import java.io.FileReader;     // For reading characters from file
import java.io.IOException;    // For handling I/O exceptions
import java.util.Scanner;      // For user input

public class CountWordInFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take file path from user
        System.out.print("Enter full file path: ");
        String filePath = sc.nextLine();

        // Take target word from user
        System.out.print("Enter the word to count: ");
        String targetWord = sc.nextLine();

        int count = 0; // Counter for occurrences

        // Try-with-resources ensures file is closed automatically
        try (
            // Step 1: Create FileReader
            FileReader fr = new FileReader(filePath);

            // Step 2: Wrap FileReader with BufferedReader
            BufferedReader br = new BufferedReader(fr)
        ) {
            String line;

            // Step 3: Read file line by line
            while ((line = br.readLine()) != null) {

                // Split line into words using spaces and punctuation
                String[] words = line.split("\\W+");

                // Step 4: Check each word
                for (String word : words) {

                    // Case-insensitive comparison
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

            // Step 5: Print final count
            System.out.println("The word \"" + targetWord + "\" appears " + count + " times.");

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        sc.close();
    }
}