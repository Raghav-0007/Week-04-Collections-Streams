package bytearraystream;

import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;

public class ImageByteArrayConverter {


    // Convert image file to byte array
    public byte[] imageToByteArray(String filePath) throws IOException {
        File file = new File(filePath);
        FileInputStream fileInputStream = new FileInputStream(file);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = fileInputStream.read(buffer)) != -1) {
            byteArrayOutputStream.write(buffer, 0, bytesRead);
        }

        fileInputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    // Convert byte array back to image file
    public void byteArrayToImage(byte[] imageBytes, String outputPath) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(imageBytes);
        FileOutputStream fileOutputStream = new FileOutputStream(outputPath);

        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = byteArrayInputStream.read(buffer)) != -1) {
            fileOutputStream.write(buffer, 0, bytesRead);
        }

        byteArrayInputStream.close();
        fileOutputStream.close();
    }

    // Compare two files byte by byte
    public boolean compareFiles(String file1Path, String file2Path) throws IOException {
        byte[] file1Bytes = Files.readAllBytes(new File(file1Path).toPath());
        byte[] file2Bytes = Files.readAllBytes(new File(file2Path).toPath());
        return Arrays.equals(file1Bytes, file2Bytes);
    }
}

