package listinterface.findelement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // list of elements
        List<Character> list=new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        char ch=FindElement.findElement(list, 2);
        System.out.println(ch);
    }
}
