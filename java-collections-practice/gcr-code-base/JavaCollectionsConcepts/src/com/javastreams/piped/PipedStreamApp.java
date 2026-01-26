package com.javastreams.piped;


import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

// Main class to demonstrate piped stream communication
public class PipedStreamApp {

    public static void main(String[] args) {

        try {
            // Create piped streams
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            // Create threads
            WriterThread writer = new WriterThread(pos);
            ReaderThread reader = new ReaderThread(pis);

            // Start threads
            reader.start();
            writer.start();

        } catch (IOException e) {
            System.out.println("Error while connecting piped streams");
            e.printStackTrace();
        }
    }
}
