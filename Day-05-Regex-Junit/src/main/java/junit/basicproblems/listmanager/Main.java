package junit.basicproblems.listmanager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListManager manager = new ListManager();
        List<Integer> list = new ArrayList<>();

        // Adding elements
        manager.addElement(list, 10);
        manager.addElement(list, 20);
        manager.addElement(list, 30);
        System.out.println("List after adding elements: " + list);

        // Removing an element
        boolean removed = manager.removeElement(list, 20);
        System.out.println("Is 20 removed? " + removed);
        System.out.println("List after removal: " + list);

        // Getting the size of the list
        System.out.println("Current list size: " + manager.getSize(list));

        // Trying to remove an element that does not exist
        removed = manager.removeElement(list, 99);
        System.out.println("Is 99 removed? " + removed);
        System.out.println("Final list: " + list);
    }
}
