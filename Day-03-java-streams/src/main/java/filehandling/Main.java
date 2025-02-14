package filehandling;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        String file1 = "src/main/java/filehandling/file.txt";
        String file2 = "src/main/java/filehandling/file2.txt";
        try {
            FileInputStream fis = new FileInputStream(file1);
            InputStreamReader reader=new InputStreamReader(fis);
            BufferedReader br=new BufferedReader(reader);

            FileOutputStream fos=new FileOutputStream(file2);
            OutputStreamWriter writer=new OutputStreamWriter(fos);
            BufferedWriter bw=new BufferedWriter(writer);

            String line;
            while ((line=br.readLine())!=null){
                bw.write(line);
                bw.flush();
                bw.newLine();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
