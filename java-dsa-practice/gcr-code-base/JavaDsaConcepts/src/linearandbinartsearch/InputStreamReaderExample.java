package linearandbinartsearch;

import java.io.BufferedReader;       // For efficient reading of characters
import java.io.FileInputStream;      // Reads raw byte data from file
import java.io.InputStreamReader;    // Converts byte stream to character stream
import java.io.IOException;          // Handles I/O exceptions
import java.nio.charset.StandardCharsets; // For UTF-8 charset
import java.util.Scanner;            // For user input

public class InputStreamReaderExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take file path from user
        System.out.print("Enter full file path: ");
        String filePath = sc.nextLine();

        // Try-with-resources ensures resources are closed automatically
        try (
            //  Create FileInputStream to read binary data
            FileInputStream fis = new FileInputStream(filePath);

            //  Wrap FileInputStream with InputStreamReader (UTF-8 encoding)
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);

            //  Wrap InputStreamReader with BufferedReader
            BufferedReader br = new BufferedReader(isr)
        ) {
            String line;

            // Read and print file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            // Handle file not found or encoding/read errors
            System.out.println("Error reading the file: " + e.getMessage());
        }

        sc.close();
    }
}