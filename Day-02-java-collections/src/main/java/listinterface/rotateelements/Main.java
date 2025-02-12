package listinterface.rotateelements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // list of elements
        List<Integer> list=new ArrayList<>(Arrays.asList(10,20,30,40,50,60,70));
//        List<Integer> list=new LinkedList<>(Arrays.asList(10,20,30,40,50,60,70));

        // rotate elements
        System.out.println(list);
        RotateElements.rotateElements(list, 3);
        System.out.println(list);
    }
}
