package setinterface.findsubsets;

import java.util.Set;

public class FindSubsets {

    // method to find subset of two sets
    public static boolean isSubset(Set<Integer> set1, Set<Integer> set2){
        return set1.containsAll(set2);
    }
}
