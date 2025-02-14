package checkedexception;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // try to read file
            FileReader reader=new FileReader("text.txt");
        }catch (IOException e){
            // catch exception
            System.out.println(e.getMessage());
        }
        System.out.println("after try catch block");
    }
}
