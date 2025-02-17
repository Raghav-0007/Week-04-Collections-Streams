package junit.basicproblems.mathoperations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathOperationsTest {

    MathOperations mathOps = new MathOperations();

    @Test
    void testDivideValidNumbers() {
        assertEquals(5, mathOps.divide(10, 2));
        assertEquals(-3, mathOps.divide(-9, 3));
    }

    @Test
    void testDivideByZeroThrowsException() {
        Exception exception = assertThrows(ArithmeticException.class, () -> mathOps.divide(10, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
