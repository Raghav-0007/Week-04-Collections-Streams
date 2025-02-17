package junit.advanceproblems.user;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    @Test
    void testValidRegistration() {
        assertEquals("User registered successfully!", UserRegistration.registerUser("JohnDoe", "john@example.com", "Password123"));
    }

    @Test
    void testEmptyUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                UserRegistration.registerUser("", "john@example.com", "Password123")
        );
        assertEquals("Username cannot be empty", exception.getMessage());
    }

    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                UserRegistration.registerUser("JohnDoe", "invalid-email", "Password123")
        );
        assertEquals("Invalid email format", exception.getMessage());
    }

    @Test
    void testShortPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                UserRegistration.registerUser("JohnDoe", "john@example.com", "short")
        );
        assertEquals("Password must be at least 8 characters long", exception.getMessage());
    }
}
