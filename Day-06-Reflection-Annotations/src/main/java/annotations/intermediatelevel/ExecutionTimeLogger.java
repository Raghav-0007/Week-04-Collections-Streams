package annotations.intermediatelevel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Step 1: Define @LogExecutionTime annotation
@Retention(RetentionPolicy.RUNTIME)
@interface LogExecutionTime {}

// Step 2: Define a class with methods to measure execution time
public class ExecutionTimeLogger {

    @LogExecutionTime
    public void quickTask() {
        System.out.println("Executing quick task...");
    }

    @LogExecutionTime
    public void slowTask() {
        System.out.println("Executing slow task...");
        try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
    }

    public void normalTask() {
        System.out.println("Executing normal task...");
    }

    // Step 3: Use Reflection to measure and print execution time
    public void measureMethods() {
        Class<?> clazz = this.getClass();

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                try {
                    long startTime = System.nanoTime();
                    method.invoke(this); // Execute method
                    long endTime = System.nanoTime();

                    long duration = (endTime - startTime) / 1_000_000; // Convert to milliseconds
                    System.out.println("Method [" + method.getName() + "] executed in " + duration + " ms");
                    System.out.println("-------------------------");

                } catch (Exception e) {
                    System.out.println("Error executing method: " + method.getName());
                    e.printStackTrace();
                }
            }
        }
    }

    // Step 4: Main method to test
    public static void main(String[] args) {
        ExecutionTimeLogger logger = new ExecutionTimeLogger();
        logger.measureMethods();
    }
}

