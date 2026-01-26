package com.javastreams.filter;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Program to convert uppercase text to lowercase using filter streams
public class UpperToLowerApp {

    public static void main(String[] args) {

        String inputFile = "src/com/javastreams/filter/Input.txt";
        String outputFile = "src/com/javastreams/filter/Output.txt";

        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            // Create buffered reader and writer
            reader = new BufferedReader(new FileReader(inputFile));
            writer = new BufferedWriter(new FileWriter(outputFile));

            String line;

            // Read each line, convert to lowercase, and write
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }

            System.out.println("File converted from uppercase to lowercase successfully.");

        } catch (IOException e) {
            System.out.println("Error while processing files.");
            e.printStackTrace();

        } finally {
            // Close resources
            try {
                if (reader != null)
                    reader.close();
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
                System.out.println("Error while closing streams.");
            }
        }
    }
}