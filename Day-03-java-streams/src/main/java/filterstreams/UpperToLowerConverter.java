package filterstreams;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class UpperToLowerConverter {
    // Convert uppercase to lowercase and write to a new file
    public static void convertUpperToLower(String inputFile, String outputFile) throws IOException {
        // Use FileReader and BufferedReader for reading
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

        String line;
        while ((line = reader.readLine()) != null) {
            writer.write(line.toLowerCase());  // Convert to lowercase
            writer.newLine();
        }

        // Close streams
        reader.close();
        writer.close();
    }
}
