package listinterface.reversealist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // arrayList
        List<Integer> arrList=new ArrayList<>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);

        // linked List
        List<Integer> linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        //revers array lists
        System.out.println("Array List");
        System.out.println(arrList);
        ReverseList.reverseList(arrList);
        System.out.println(arrList);

        // reverse linked list
        System.out.println("Linked List");
        System.out.println(linkedList);
        ReverseList.reverseList(linkedList);
        System.out.println(linkedList);

    }
}
