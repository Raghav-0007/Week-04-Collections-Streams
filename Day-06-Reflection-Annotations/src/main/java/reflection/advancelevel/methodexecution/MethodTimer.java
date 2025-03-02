package reflection.advancelevel.methodexecution;

import java.lang.reflect.Method;

// Single-Class Method Execution Timer
public class MethodTimer {

    // Sample methods to test execution time
    public void quickTask() {
        System.out.println("Executing quick task...");
    }

    public void slowTask() {
        System.out.println("Executing slow task...");
        try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
    }

    // Measure execution time of all no-arg methods in this class
    public void measureExecutionTime() {
        Class<?> clazz = this.getClass();

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.getParameterCount() == 0 && !method.getName().equals("measureExecutionTime")) {
                try {
                    long startTime = System.nanoTime();
                    method.invoke(this); // Invoke method
                    long endTime = System.nanoTime();

                    long duration = (endTime - startTime) / 1_000_000; // Convert to milliseconds
                    System.out.println("Method [" + method.getName() + "] executed in " + duration + " ms");

                } catch (Exception e) {
                    System.out.println("Error executing method: " + method.getName());
                    e.printStackTrace();
                }
            }
        }
    }

    // Main method to test
    public static void main(String[] args) {
        MethodTimer timer = new MethodTimer();
        timer.measureExecutionTime();
    }
}

