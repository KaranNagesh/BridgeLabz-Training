package com.javastreams.wordcount;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

// Program to count words and display top 5 frequent words
public class Main {

    public static void main(String[] args) {

        String filePath = "src\\com\\javastreams\\wordcount\\Input.txt";

        HashMap<String, Integer> wordCountMap = new HashMap<>();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;

            // Read file line by line
            while ((line = reader.readLine()) != null) {

                // Convert to lowercase and split into words
                String[] words = line.toLowerCase().split("\\W+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word,
                                wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

            // Sort words by frequency
            List<Map.Entry<String, Integer>> list =
                    new ArrayList<>(wordCountMap.entrySet());

            list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

            // Display top 5 words
            System.out.println("Top 5 most frequent words:");
            int count = 0;

            for (Map.Entry<String, Integer> entry : list) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
                count++;
                if (count == 5)
                    break;
            }

        } catch (IOException e) {
            System.out.println("Error while reading file.");
            e.printStackTrace();

        } finally {
            // Close reader
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                System.out.println("Error while closing reader.");
            }
        }
    }
}
