package junit.basicproblems.mathoperations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        try {
            int result = mathOps.divide(a, b);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
