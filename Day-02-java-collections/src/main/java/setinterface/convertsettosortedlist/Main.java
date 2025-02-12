package setinterface.convertsettosortedlist;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>(Arrays.asList(1,5,3,4,2,7));
        List<Integer> list=ConvertSetToSortedList.setToSortedList(set);
        System.out.println(list);
    }
}
