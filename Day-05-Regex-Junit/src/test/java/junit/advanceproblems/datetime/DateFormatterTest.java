package junit.advanceproblems.datetime;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {

    @Test
    void testValidDates() {
        assertEquals("15-08-2023", DateFormatter.formatDate("2023-08-15"));
        assertEquals("01-01-2000", DateFormatter.formatDate("2000-01-01"));
        assertEquals("31-12-2025", DateFormatter.formatDate("2025-12-31"));
    }

    @Test
    void testInvalidDates() {
        assertEquals("Invalid Date Format", DateFormatter.formatDate("15-08-2023")); // Wrong format
        assertEquals("Invalid Date Format", DateFormatter.formatDate("2023/08/15")); // Wrong delimiter
        assertEquals("Invalid Date Format", DateFormatter.formatDate("abcd-ef-gh")); // Nonsense input
        assertEquals("Invalid Date Format", DateFormatter.formatDate("")); // Empty input
        assertEquals("Invalid Date Format", DateFormatter.formatDate(null)); // Null input
    }
}
