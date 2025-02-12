package setinterface.findsubsets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>(Arrays.asList(1,5,3,4,2,7));
        Set<Integer> set2=new HashSet<>(Arrays.asList(1,4,3));
        boolean bool=FindSubsets.isSubset(set1, set2);
        System.out.println(bool);
    }
}
