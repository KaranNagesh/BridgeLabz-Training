package com.javastreams.userinput;


import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

// Program to read user input from console and save it into a file
public class UserInputApp {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileWriter writer = null;

        try {
            // Read user input
            System.out.print("Enter your name: ");
            String name = br.readLine();

            System.out.print("Enter your age: ");
            String age = br.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = br.readLine();

            // Write data to file
            writer = new FileWriter("src\\com\\javastreams\\userinput\\userData.txt");

            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Language: " + language + "\n");

            System.out.println("\nData saved successfully to file.");

        } catch (IOException e) {
            System.out.println("An error occurred while reading input or writing file.");
            System.out.println(e.getMessage());

        } finally {
            // Close FileWriter
            try {
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
                System.out.println("Error while closing the file.");
            }
        }
    }
}
 