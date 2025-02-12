package listinterface.removeduplicates;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicate() {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4));
        RemoveDuplicates.removeDuplicate(list);
        List<Integer> expected = Arrays.asList(3, 1, 2, 4);
        assertEquals(expected, list, "Duplicates should be removed while maintaining order");
    }

    @Test
    public void testRemoveDuplicateNoDuplicates() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        RemoveDuplicates.removeDuplicate(list);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        assertEquals(expected, list, "List with no duplicates should remain unchanged");
    }

    @Test
    public void testRemoveDuplicateAllSame() {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 5, 5, 5));
        RemoveDuplicates.removeDuplicate(list);
        List<Integer> expected = Collections.singletonList(5);
        assertEquals(expected, list, "All duplicate elements should be reduced to a single element");
    }

    @Test
    public void testRemoveDuplicateEmptyList() {
        List<Integer> list = new ArrayList<>();
        RemoveDuplicates.removeDuplicate(list);
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, list, "Empty list should remain unchanged");
    }

    @Test
    public void testRemoveDuplicateSingleElement() {
        List<Integer> list = new ArrayList<>(Collections.singletonList(10));
        RemoveDuplicates.removeDuplicate(list);
        List<Integer> expected = Collections.singletonList(10);
        assertEquals(expected, list, "Single element list should remain unchanged");
    }
}

