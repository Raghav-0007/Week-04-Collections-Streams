package setinterface.checktwosets;

import java.util.Iterator;
import java.util.Set;

public class CheckTwoSets {

    public static boolean checkSets(Set<Integer> set1, Set<Integer> set2){
        return set1.containsAll(set2);
    }
}
