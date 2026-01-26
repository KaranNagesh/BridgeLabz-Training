package com.javastreams.piped;


import java.io.IOException;
import java.io.PipedOutputStream;

// Thread that writes data into PipedOutputStream
public class WriterThread extends Thread {

    private PipedOutputStream pos;

    // Constructor
    public WriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        try {
            String message = "Hello from Writer Thread";

            // Write data as bytes
            pos.write(message.getBytes());
            pos.close();

        } catch (IOException e) {
            System.out.println("Error in Writer Thread");
            e.printStackTrace();
        }
    }
}