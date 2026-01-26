package com.javastreams.bytearray;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Program to convert image to byte array and write it back to file
public class ImageByteArrayApp {

    public static void main(String[] args) {

        String inputImage = "src/com/javastreams/bytearray/test.jpeg";
        String outputImage = "src/com/javastreams/bytearray/copied.jpeg";

        try {
            // Read image into byte array output stream
            FileInputStream fis = new FileInputStream(inputImage);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            byte[] imageBytes = baos.toByteArray();

            fis.close();
            baos.close();

            // Write byte array back to new image file
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(outputImage);

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            bais.close();
            fos.close();

            System.out.println("Image copied successfully using ByteArray Streams.");

        } catch (IOException e) {
            System.out.println("Error while processing image file.");
            e.printStackTrace();
        }
    }
}