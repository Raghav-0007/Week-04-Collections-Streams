package junit.basicproblems.listmanager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ListManagerTest {

    ListManager manager;
    List<Integer> list;

    @BeforeEach
    void setUp() {
        manager = new ListManager();
        list = new ArrayList<>();
    }

    @Test
    void testAddElement() {
        manager.addElement(list, 5);
        assertTrue(list.contains(5));
        assertEquals(1, list.size());
    }

    @Test
    void testRemoveElement() {
        manager.addElement(list, 10);
        assertTrue(manager.removeElement(list, 10));
        assertFalse(list.contains(10));
        assertEquals(0, list.size());

        // Test removing non-existent element
        assertFalse(manager.removeElement(list, 99));
    }

    @Test
    void testGetSize() {
        assertEquals(0, manager.getSize(list));
        manager.addElement(list, 7);
        manager.addElement(list, 3);
        assertEquals(2, manager.getSize(list));
    }
}

