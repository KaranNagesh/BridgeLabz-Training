package com.javastreams.largefile;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Program to read a large file line by line and print lines containing "error"
public class ErrorLogReader {

    public static void main(String[] args) {

        String filePath = "src\\com\\javastreams\\largefile\\largefile.txt";

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filePath));

            String line;

            // Read file line by line
            while ((line = reader.readLine()) != null) {

                // Case-insensitive check for "error"
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error while reading the large file.");
            e.printStackTrace();

        } finally {
            // Close reader
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                System.out.println("Error while closing the file.");
            }
        }
    }
}