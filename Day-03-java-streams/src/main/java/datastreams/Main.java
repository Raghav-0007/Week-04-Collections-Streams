package datastreams;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/main/java/datastreams/file.txt";

        // Write student data to a binary file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            // Writing student details
            dos.writeInt(101);         // Roll Number
            dos.writeUTF("Alice");     // Name
            dos.writeDouble(3.8);      // GPA

            dos.writeInt(102);
            dos.writeUTF("Bob");
            dos.writeDouble(3.6);

            System.out.println("Student data has been written to the file.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Read student data from the binary file
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            System.out.println("\nReading student data from the file:");
            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}