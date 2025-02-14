package bytearraystream;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ImageByteArrayConverter obj=new ImageByteArrayConverter();
        String file="src/main/java/bytearraystream/file.txt";
        String img="src/main/java/bytearraystream/image.png";

        try {
            // Convert image to byte array
            byte[] imageBytes = obj.imageToByteArray(img);

            // Convert byte array back to image
            obj.byteArrayToImage(imageBytes, file);

            // Verify if both files are identical
            if (obj.compareFiles(img, file)) {
                System.out.println("Success: The copied image is identical to the original.");
            } else {
                System.out.println("Error: The copied image is not identical.");
            }

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
