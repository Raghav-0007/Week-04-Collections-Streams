package queueinterface.generatebinarynumbers;

import java.util.*;

public class GenerateBinaryNumbers {

    // method to generate binary numbers
    public static List<String> generateBinary(int n){
        Queue<String> queue=new LinkedList<>();
        List<String> list=new ArrayList<>();
        queue.add("1");
        for (int i = 0; i < n; i++) {
            String word=queue.remove();
            list.add(word);

            queue.add(word+"0");
            queue.add(word+"1");
        }
        return list;
    }
}
