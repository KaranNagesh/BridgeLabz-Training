package javaiostreams.com.csv.basics;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MergeCSVFiles {

    public static void main(String[] args) {

        // Map to store ID → Name,Age
        Map<String, String> studentDetails = new HashMap<>();

        String outputDir = "output";
        String outputFile = outputDir + "/merged_students.csv";

        // Create output directory if not exists
        File dir = new File(outputDir);
        if (!dir.exists()) {
            dir.mkdir();
        }

        // =======================
        // STEP 1: Read students1.csv
        // =======================
        try (BufferedReader br1 = new BufferedReader(
                new InputStreamReader(
                        MergeCSVFiles.class.getClassLoader()
                                .getResourceAsStream("data/csv/students1.csv")))) {

            String line;
            boolean isHeader = true;

            while ((line = br1.readLine()) != null) {

                // Skip header
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                // Skip empty lines
                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split(",");

                // Validate columns
                if (data.length < 3) {
                    System.out.println("Skipping invalid row: " + line);
                    continue;
                }

                String id = data[0].trim();
                String nameAge = data[1].trim() + "," + data[2].trim();

                studentDetails.put(id, nameAge);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // =======================
        // STEP 2: Read students2.csv & merge
        // =======================
        try (BufferedReader br2 = new BufferedReader(
                new InputStreamReader(
                        MergeCSVFiles.class.getClassLoader()
                                .getResourceAsStream("data/csv/students2.csv")));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            // Write header
            bw.write("ID,Name,Age,Marks,Grade");
            bw.newLine();

            String line;
            boolean isHeader = true;

            while ((line = br2.readLine()) != null) {

                // Skip header
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                // Skip empty lines
                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split(",");

                // Validate columns
                if (data.length < 3) {
                    System.out.println("Skipping invalid row: " + line);
                    continue;
                }

                String id = data[0].trim();
                String marks = data[1].trim();
                String grade = data[2].trim();

                // Merge if ID exists
                if (studentDetails.containsKey(id)) {
                    bw.write(id + "," + studentDetails.get(id) + "," + marks + "," + grade);
                    bw.newLine();
                }
            }

            System.out.println("✅ CSV files merged successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
