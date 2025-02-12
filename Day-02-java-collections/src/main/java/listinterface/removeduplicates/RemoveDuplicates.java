package listinterface.removeduplicates;

import java.util.*;

public class RemoveDuplicates {

    public static void removeDuplicate(List<Integer> list){
        Set<Integer> set=new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);
    }
}
