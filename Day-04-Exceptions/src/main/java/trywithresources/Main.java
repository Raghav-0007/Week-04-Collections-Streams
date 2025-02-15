package trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String file="src/main/java/trywithresources/file.txt";

        try(BufferedReader reader=new BufferedReader(new FileReader(file))) {
            String line=reader.readLine();
            System.out.println(line);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
