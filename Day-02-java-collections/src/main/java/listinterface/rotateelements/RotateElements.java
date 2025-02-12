package listinterface.rotateelements;

import java.util.Collections;
import java.util.List;

public class RotateElements {

    // method to rotate elements
    public  static void rotateElements(List<Integer> list, int k){
        if(list.isEmpty() || k<1) return;
        int n=list.size();
        k=k%n;

        // method-1
//        while (k!=0) {
//            list.add(list.get(0));
//            list.remove(0);
//            k--;
//        }

        // method-2
        Collections.reverse(list.subList(0,k));
        Collections.reverse(list.subList(k,n));
        Collections.reverse(list);
    }
}
