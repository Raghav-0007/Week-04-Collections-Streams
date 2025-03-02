package reflection.intermediatelevel.dynamicmethodinvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            // Create an instance of MathOperations
            MathOperations mathOps = new MathOperations();

            // Take user input for method name and parameters
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter method name (add, subtract, multiply): ");
            String methodName = scanner.next();

            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            // Get the Method object based on user input
            Method method = MathOperations.class.getMethod(methodName, int.class, int.class);

            // Invoke the method dynamically
            int result = (int) method.invoke(mathOps, num1, num2);

            // Display the result
            System.out.println("Result: " + result);

            scanner.close();
        } catch (Exception e) {
            System.out.println("Invalid method name or error in invocation!");
            System.out.println(e.getMessage());
        }
    }
}
