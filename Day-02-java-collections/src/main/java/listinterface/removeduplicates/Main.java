package listinterface.removeduplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4));
        System.out.println(list);
        RemoveDuplicates.removeDuplicate(list);
        System.out.println(list);
    }
}
