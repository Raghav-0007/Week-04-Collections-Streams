package listinterface.findfrequency;

import java.util.HashMap;
import java.util.Map;

public class FindFrequency {

    // method to find the frequency of elements
    public static Map<String, Integer> findFrequency(String[] arr) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : arr) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        return map;
    }
}

