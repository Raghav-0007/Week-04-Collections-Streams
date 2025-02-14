package bufferedstreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {

        String file1="src/main/java/bufferedstreams/file.txt";
        String file2="src/main/java/bufferedstreams/file2.txt";
        String file3="src/main/java/bufferedstreams/file100mb.txt";
        try{
            // create file input stream
            FileInputStream fin=new FileInputStream(file3);
            BufferedInputStream inputStream=new BufferedInputStream(fin);

            // create file output stream
            FileOutputStream fo=new FileOutputStream(file2);
            BufferedOutputStream outputStream=new BufferedOutputStream(fo);

            int ch;
            long before=System.nanoTime();
            while ((ch=inputStream.read())!=-1){
                outputStream.write((char)ch);
                outputStream.flush();
            }
            long after=System.nanoTime();
            System.out.println(after-before);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
