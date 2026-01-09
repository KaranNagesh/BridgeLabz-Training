package linearandbinartsearch;


import java.io.BufferedReader;     // For efficient reading
import java.io.InputStreamReader;  // Reads characters from byte stream (System.in)
import java.io.FileWriter;         // Writes characters to file
import java.io.IOException;        // Handles I/O exceptions

public class InputStreamReaderToFile {

    public static void main(String[] args) {

        // File path where user input will be stored
        String filePath = "user_input.txt";

        // Try-with-resources ensures streams are closed automatically
        try (
            // Step 1: Create InputStreamReader for console input
            InputStreamReader isr = new InputStreamReader(System.in);

            // Step 2: Wrap InputStreamReader with BufferedReader
            BufferedReader br = new BufferedReader(isr);

            // Step 3: Create FileWriter to write data into file
            FileWriter writer = new FileWriter(filePath)
        ) {
            System.out.println("Enter text (type 'exit' to stop):");

            String input;

            // Step 4: Read input until user types "exit"
            while (true) {

                input = br.readLine(); // Read user input

                // Stop condition
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                // Step 5: Write input to file with new line
                writer.write(input);
                writer.write(System.lineSeparator());
            }

            System.out.println("User input successfully written to file.");

        } catch (IOException e) {
            System.out.println("Error during input/output: " + e.getMessage());
        }
    }
}