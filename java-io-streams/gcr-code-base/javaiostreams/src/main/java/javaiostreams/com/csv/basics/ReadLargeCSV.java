package javaiostreams.com.csv.basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLargeCSV {

    private static final int CHUNK_SIZE = 100;

    public static void main(String[] args) {

        int totalRecords = 0;

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        ReadLargeCSV.class.getClassLoader()
                                .getResourceAsStream("data/large_employees.csv")))) {

            String line;
            boolean isHeader = true;
            List<String> batch = new ArrayList<>(CHUNK_SIZE);

            while ((line = br.readLine()) != null) {

                // Skip header
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                batch.add(line);

                if (batch.size() == CHUNK_SIZE) {
                    processBatch(batch);
                    totalRecords += batch.size();
                    batch.clear();

                    System.out.println("Processed records so far: " + totalRecords);
                }
            }

            // Remaining records
            if (!batch.isEmpty()) {
                processBatch(batch);
                totalRecords += batch.size();
            }

            System.out.println("Total records processed: " + totalRecords);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processBatch(List<String> batch) {
        for (String record : batch) {
            // simulate processing
        }
    }
}
