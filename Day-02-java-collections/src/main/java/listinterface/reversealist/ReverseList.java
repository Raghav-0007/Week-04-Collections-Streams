package listinterface.reversealist;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {

    // method to reverse the list
    public static void reverseList(List<Integer> list){
        int i=0;
        int j=list.size()-1;

        while (i<j){
            int temp=list.get(j);
            list.set(j,list.get(i));
            list.set(i,temp);
            i++;
            j--;
        }
    }
}
