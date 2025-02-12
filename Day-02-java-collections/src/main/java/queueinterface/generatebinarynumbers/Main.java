package queueinterface.generatebinarynumbers;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // generate binary numbers
        List<String> list=GenerateBinaryNumbers.generateBinary(10);
        System.out.println(list);
    }
}
