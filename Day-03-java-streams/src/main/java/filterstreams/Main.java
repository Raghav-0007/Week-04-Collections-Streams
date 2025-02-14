package filterstreams;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String inputFile = "src/main/java/filehandling/file.txt";  // Change to your file path
        String outputFile = "src/main/java/filehandling/file2.txt";

        try {
            UpperToLowerConverter.convertUpperToLower(inputFile, outputFile);
            System.out.println("Conversion completed. Check output file.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
