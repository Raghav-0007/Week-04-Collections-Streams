package junit.advanceproblems.security;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void testValidPasswords() {
        assertTrue(PasswordValidator.isValid("StrongP@ss1"), "Valid password should pass");
        assertTrue(PasswordValidator.isValid("HelloWorld123"), "Valid password should pass");
    }

    @Test
    void testShortPassword() {
        assertFalse(PasswordValidator.isValid("Short1"), "Password with less than 8 characters should fail");
    }

    @Test
    void testNoUpperCase() {
        assertFalse(PasswordValidator.isValid("lowercase123"), "Password without an uppercase letter should fail");
    }

    @Test
    void testNoDigit() {
        assertFalse(PasswordValidator.isValid("NoDigitsHere!"), "Password without a digit should fail");
    }

    @Test
    void testNullPassword() {
        assertFalse(PasswordValidator.isValid(null), "Null password should fail");
    }
}

