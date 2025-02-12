package setinterface.unionandintersectionoftwosets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set2=new HashSet<>(Arrays.asList(1,3,4,6));
        System.out.println(UnionIntersectionSets.intersectionOfSets(set1,set2));
        System.out.println(UnionIntersectionSets.unionOfSets(set1,set2));
    }
}
