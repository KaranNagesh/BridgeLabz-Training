package com.javastreams.piped;

import java.io.IOException;
import java.io.PipedInputStream;

// Thread that reads data from PipedInputStream
public class ReaderThread extends Thread {

    private PipedInputStream pis;

    // Constructor
    public ReaderThread(PipedInputStream pis) {
        this.pis = pis;
    }

    @Override
    public void run() {
        try {
            int data;

            // Read data byte by byte
            while ((data = pis.read()) != -1) {
                System.out.print((char) data);
            }

            pis.close();

        } catch (IOException e) {
            System.out.println("Error in Reader Thread");
            e.printStackTrace();
        }
    }
}