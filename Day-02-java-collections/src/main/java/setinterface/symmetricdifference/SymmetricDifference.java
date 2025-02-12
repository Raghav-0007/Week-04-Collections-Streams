package setinterface.symmetricdifference;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SymmetricDifference {

    // method to find symmetric Difference of two sets
    public static List<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2){
        List<Integer> list=new ArrayList<>();
        for(int i: set1){
            if(!set2.contains(i))
                list.add(i);
        }
        for(int i: set2){
            if(!set1.contains(i))
                list.add(i);
        }
        return list;
    }
}
