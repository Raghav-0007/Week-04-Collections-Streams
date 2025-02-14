package readuserinput;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        String file="src/main/java/readuserinput/file.txt";
        try{
            // buffered reader for reading user input
            InputStreamReader streamReader=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(streamReader);

            // file writer to write file data
            FileWriter writer=new FileWriter(file, true);

            // taking input from user
            System.out.println("Enter your name: ");
            String line=br.readLine();
            writer.write(line);
            writer.flush();
            System.out.println("Enter your age: ");
            line=br.readLine();
            writer.write(line);
            writer.flush();
            System.out.println("Enter your favorite language: ");
            line=br.readLine();
            writer.write(line);
            writer.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
