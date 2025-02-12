package listinterface.findfrequency;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindFrequencyTest {

    @Test
    public void testFindFrequency() {
        String[] arr = {"apple", "banana", "apple", "orange", "banana", "banana"};
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 2);
        expected.put("banana", 3);
        expected.put("orange", 1);

        assertEquals(expected, FindFrequency.findFrequency(arr), "Frequency map should match expected result");
    }

    @Test
    public void testFindFrequencyEmptyArray() {
        String[] arr = {};
        Map<String, Integer> expected = new HashMap<>();

        assertEquals(expected, FindFrequency.findFrequency(arr), "Empty array should return empty map");
    }

    @Test
    public void testFindFrequencySingleElement() {
        String[] arr = {"apple"};
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 1);

        assertEquals(expected, FindFrequency.findFrequency(arr), "Single element array should return correct frequency");
    }

    @Test
    public void testFindFrequencySameElement() {
        String[] arr = {"banana", "banana", "banana"};
        Map<String, Integer> expected = new HashMap<>();
        expected.put("banana", 3);

        assertEquals(expected, FindFrequency.findFrequency(arr), "All same elements should return correct frequency");
    }
}

