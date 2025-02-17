package junit.basicproblems.stringutils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    StringUtils utils = new StringUtils();

    @Test
    void testReverse() {
        assertEquals("cba", utils.reverse("abc"));
        assertEquals("987654321", utils.reverse("123456789"));
        assertEquals("", utils.reverse(""));
        assertNull(utils.reverse(null)); // Handling null case
    }

    @Test
    void testIsPalindrome() {
        assertTrue(utils.isPalindrome("madam"));
        assertTrue(utils.isPalindrome("racecar"));
        assertTrue(utils.isPalindrome("Level")); // Case-insensitive
        assertFalse(utils.isPalindrome("hello"));
        assertFalse(utils.isPalindrome("world"));
        assertFalse(utils.isPalindrome(null)); // Handling null case
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", utils.toUpperCase("hello"));
        assertEquals("JAVA", utils.toUpperCase("java"));
        assertEquals("", utils.toUpperCase(""));
        assertNull(utils.toUpperCase(null)); // Handling null case
    }
}

