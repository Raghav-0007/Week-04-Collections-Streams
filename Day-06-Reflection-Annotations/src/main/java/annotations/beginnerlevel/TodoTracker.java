package annotations.beginnerlevel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Step 1: Define the @Todo annotation
@Retention(RetentionPolicy.RUNTIME)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

// Step 2: Define a class with pending tasks
public class TodoTracker {

    @Todo(task = "Implement login feature", assignedTo = "Alice", priority = "HIGH")
    public void login() {
        System.out.println("Login feature pending...");
    }

    @Todo(task = "Optimize database queries", assignedTo = "Bob")
    public void optimizeDB() {
        System.out.println("Database optimization pending...");
    }

    @Todo(task = "Improve UI design", assignedTo = "Charlie", priority = "LOW")
    public void improveUI() {
        System.out.println("UI improvement pending...");
    }

    // Step 3: Use Reflection to retrieve and print all pending tasks
    public void listPendingTasks() {
        Class<?> clazz = this.getClass();

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println("Task: " + todo.task());
                System.out.println("Assigned To: " + todo.assignedTo());
                System.out.println("Priority: " + todo.priority());
                System.out.println("Method: " + method.getName());
                System.out.println("-------------------------");
            }
        }
    }

    // Step 4: Main method to test
    public static void main(String[] args) {
        TodoTracker tracker = new TodoTracker();
        tracker.listPendingTasks();
    }
}

