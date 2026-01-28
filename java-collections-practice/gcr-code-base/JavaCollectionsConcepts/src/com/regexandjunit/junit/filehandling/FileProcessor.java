package com.regexandjunit.junit.filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileProcessor {

    // Writes content to a file
    public void writeToFile(String filename, String content) throws IOException {
        Path path = Paths.get(filename);
        Files.write(path, content.getBytes());
    }

    // Reads content from a file
    public String readFromFile(String filename) throws IOException {
        Path path = Paths.get(filename);
        return Files.readString(path);
    }
}
