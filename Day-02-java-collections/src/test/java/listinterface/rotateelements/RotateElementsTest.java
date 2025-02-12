package listinterface.rotateelements;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotateElementsTest {

    @Test
    public void testRotateElements() {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        RotateElements.rotateElements(list, 2);
        List<Integer> expected = Arrays.asList(30, 40, 50, 10, 20);
        assertEquals(expected, list, "List should be rotated by 2 places");
    }

    @Test
    public void testRotateElementsZeroRotation() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        RotateElements.rotateElements(list, 0);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, list, "Zero rotation should return the same list");
    }

    @Test
    public void testRotateElementsMoreThanSize() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        RotateElements.rotateElements(list, 7);
        List<Integer> expected = Arrays.asList(3, 4, 5, 1, 2); // Since 7 % 5 = 2
        assertEquals(expected, list, "Rotation should handle cases where k > size");
    }

    @Test
    public void testRotateElementsEmptyList() {
        List<Integer> list = new ArrayList<>();
        RotateElements.rotateElements(list, 3);
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, list, "Rotating an empty list should return an empty list");
    }

    @Test
    public void testRotateElementsSingleElement() {
        List<Integer> list = new ArrayList<>(Collections.singletonList(42));
        RotateElements.rotateElements(list, 5);
        List<Integer> expected = Collections.singletonList(42);
        assertEquals(expected, list, "Single element list should remain unchanged");
    }
}

