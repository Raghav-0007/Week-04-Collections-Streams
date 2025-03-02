package annotations.beginnerlevel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Step 1: Define @ImportantMethod annotation with a level parameter
@Retention(RetentionPolicy.RUNTIME)
@interface ImportantMethod {
    String level() default "HIGH";
}

// Step 2: Define a class with annotated methods
public class AnnotationExample {

    @ImportantMethod(level = "HIGH")
    public void criticalTask() {
        System.out.println("Executing critical task...");
    }

    @ImportantMethod(level = "MEDIUM")
    public void normalTask() {
        System.out.println("Executing normal task...");
    }

    public void regularTask() {
        System.out.println("Executing regular task...");
    }

    // Step 3: Use Reflection to retrieve and print annotated methods
    public void findImportantMethods() {
        Class<?> clazz = this.getClass();

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + " | Importance Level: " + annotation.level());
            }
        }
    }

    // Step 4: Main method to test
    public static void main(String[] args) {
        AnnotationExample example = new AnnotationExample();
        example.findImportantMethods();
    }
}

