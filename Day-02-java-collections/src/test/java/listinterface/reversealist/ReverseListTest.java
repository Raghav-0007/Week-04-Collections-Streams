package listinterface.reversealist;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseListTest {

    @Test
    public void testReverseArrayList() {
        List<Integer> arrList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> expected = Arrays.asList(5, 4, 3, 2, 1);

        ReverseList.reverseList(arrList);

        assertEquals(expected, arrList, "ArrayList should be reversed");
    }

    @Test
    public void testReverseLinkedList() {
        List<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> expected = Arrays.asList(5, 4, 3, 2, 1);

        ReverseList.reverseList(linkedList);

        assertEquals(expected, linkedList, "LinkedList should be reversed");
    }

    @Test
    public void testReverseEmptyList() {
        List<Integer> emptyList = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();

        ReverseList.reverseList(emptyList);

        assertEquals(expected, emptyList, "Empty list should remain unchanged");
    }

    @Test
    public void testReverseSingleElementList() {
        List<Integer> singleElementList = new ArrayList<>(Collections.singletonList(10));
        List<Integer> expected = Collections.singletonList(10);

        ReverseList.reverseList(singleElementList);

        assertEquals(expected, singleElementList, "Single element list should remain unchanged");
    }
}

