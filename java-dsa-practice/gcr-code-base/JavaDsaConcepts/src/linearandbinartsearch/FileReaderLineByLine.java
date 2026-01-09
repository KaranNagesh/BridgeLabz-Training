package linearandbinartsearch;


import java.io.BufferedReader; // For reading text efficiently
import java.io.FileReader;     // For reading characters from file
import java.io.IOException;    // For handling I/O exceptions

public class FileReaderLineByLine {

    public static void main(String[] args) {

        // Path of the file to be read
        String filePath = "sample.txt";

        // Try-with-resources ensures file is closed automatically
        try (
            //  Create FileReader object
            FileReader fileReader = new FileReader(filePath);

            // Wrap FileReader with BufferedReader
            BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            String line;

            // Read file line by line
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); // Print each line
            }

        } catch (IOException e) {
            // Handle file not found or read errors
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}