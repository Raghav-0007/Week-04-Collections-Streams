package setinterface.unionandintersectionoftwosets;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class UnionIntersectionSets {

    // method to find union of two sets
    public static List<Integer> unionOfSets(Set<Integer> set1, Set<Integer> set2){
        List<Integer> list=new ArrayList<>(set1);

        for(int ele: set2){
            if(!set1.contains(ele)){
                list.add(ele);
            }
        }
        return list;
    }

    // method to find intersection of two sets
    public static List<Integer> intersectionOfSets(Set<Integer> set1, Set<Integer> set2){
        List<Integer> list=new ArrayList<>();
        for(int ele: set2){
            if(set1.contains(ele)){
                list.add(ele);
            }
        }
        return list;
    }
}
