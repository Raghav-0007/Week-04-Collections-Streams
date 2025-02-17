package junit.basicproblems.mathoperations;

public class MathOperations {

    // Method to divide two numbers
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
