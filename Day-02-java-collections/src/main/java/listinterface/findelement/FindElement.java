package listinterface.findelement;

import java.util.*;

public class FindElement {

    // method to find element of given index
    public static char findElement(List<Character> list, int k){
        Collections.reverse(list);
        return list.get(k-1);
    }
}
