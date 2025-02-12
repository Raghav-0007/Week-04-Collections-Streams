package setinterface.convertsettosortedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class ConvertSetToSortedList {

    public static List<Integer> setToSortedList(Set<Integer> set){
        List<Integer> list=new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}
