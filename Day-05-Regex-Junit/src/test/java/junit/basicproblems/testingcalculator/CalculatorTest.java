package junit.basicproblems.testingcalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(8, calc.add(3, 5));
        assertEquals(-1, calc.add(-3, 2));
    }

    @Test
    void testSubtract() {
        assertEquals(3, calc.subtract(5, 2));
        assertEquals(-5, calc.subtract(5, 10));
    }

    @Test
    void testMultiply() {
        assertEquals(18, calc.multiply(3, 6));
        assertEquals(0, calc.multiply(3, 0));
    }

    @Test
    void testDivide() {
        assertEquals(2, calc.divide(6, 3));
        assertThrows(ArithmeticException.class, () -> calc.divide(6, 0));
    }
}
