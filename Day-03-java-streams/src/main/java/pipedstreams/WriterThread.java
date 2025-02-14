package pipedstreams;

import java.io.*;

class WriterThread extends Thread {
    private PipedOutputStream outputStream;

    public WriterThread(PipedOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
        try {
            String message = "Hello from WriterThread!";
            outputStream.write(message.getBytes()); // Write data to the pipe
            outputStream.close(); // Close the stream after writing
        } catch (IOException e) {
            System.err.println("Writer Error: " + e.getMessage());
        }
    }
}