package algorithmanalysis;


import java.io.*;

public class LargeFileReading {

    // File path (change according to your system)
    private static final String FILE_PATH = "largefile.txt";

    public static void main(String[] args) {

        System.out.println("Reading file using FileReader...");
        long fileReaderTime = readUsingFileReader(FILE_PATH);
        System.out.println("FileReader Time: " + fileReaderTime + " ns\n");

        System.out.println("Reading file using InputStreamReader...");
        long inputStreamReaderTime = readUsingInputStreamReader(FILE_PATH);
        System.out.println("InputStreamReader Time: " + inputStreamReaderTime + " ns");
    }

    
    // File Reader ->   Character stream (slower for large files)
    
    private static long readUsingFileReader(String path) {
        long startTime = System.nanoTime();

        try (FileReader fr = new FileReader(path)) {
            while (fr.read() != -1) {
                // Reading character by character
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        return endTime - startTime;
    }

   
     // Input Stream Reader ->  Byte stream converted to characters (faster)
    
    private static long readUsingInputStreamReader(String path) {
        long startTime = System.nanoTime();

        try (InputStreamReader isr =
                     new InputStreamReader(new FileInputStream(path))) {

            char[] buffer = new char[8192]; // buffer improves speed
            while (isr.read(buffer) != -1) {
                // Reading in chunks
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}