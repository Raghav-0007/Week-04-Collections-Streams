package pipedstreams;

import java.io.*;

class ReaderThread extends Thread {
    private PipedInputStream inputStream;

    public ReaderThread(PipedInputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        try {
            int data;
            while ((data = inputStream.read()) != -1) { // Read data from the pipe
                System.out.print((char) data);
            }
            inputStream.close(); // Close stream after reading
        } catch (IOException e) {
            System.err.println("Reader Error: " + e.getMessage());
        }
    }
}
