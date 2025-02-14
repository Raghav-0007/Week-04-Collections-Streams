package pipedstreams;

import java.io.*;

public class Main{
public static void main(String[] args) {
    try {
        PipedOutputStream outputStream = new PipedOutputStream();
        PipedInputStream inputStream = new PipedInputStream(outputStream); // Connect pipes

        Thread writer = new WriterThread(outputStream);
        Thread reader = new ReaderThread(inputStream);

        writer.start();
        reader.start();

        writer.join(); // Ensure writer finishes first
        reader.join(); // Wait for reader to finish
    } catch (IOException | InterruptedException e) {
        System.err.println("Error: " + e.getMessage());
    }
}
}