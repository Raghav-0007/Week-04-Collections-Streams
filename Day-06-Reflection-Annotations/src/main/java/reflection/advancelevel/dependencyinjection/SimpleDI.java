package reflection.advancelevel.dependencyinjection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

// Single-Class Dependency Injection Container
public class SimpleDI {

    // Step 1: Define @Inject annotation
    @Retention(RetentionPolicy.RUNTIME)
    @interface Inject {}

    // Step 2: DI Container to register and inject dependencies
    private static final Map<Class<?>, Object> instances = new HashMap<>();

    public static <T> void register(Class<T> clazz) {
        try {
            instances.put(clazz, clazz.getDeclaredConstructor().newInstance());
        } catch (Exception e) {
            throw new RuntimeException("Failed to create instance: " + clazz.getName(), e);
        }
    }

    public static <T> T getInstance(Class<T> clazz) {
        try {
            T instance = clazz.getDeclaredConstructor().newInstance();
            for (Field field : clazz.getDeclaredFields()) {
                if (field.isAnnotationPresent(Inject.class)) {
                    field.setAccessible(true);
                    Object dependency = instances.get(field.getType());
                    if (dependency == null) {
                        throw new RuntimeException("No registered instance for: " + field.getType().getName());
                    }
                    field.set(instance, dependency);
                }
            }
            return instance;
        } catch (Exception e) {
            throw new RuntimeException("Failed to create instance: " + clazz.getName(), e);
        }
    }

    // Step 3: Define a service (dependency)
    static class Service {
        public void serve() {
            System.out.println("Service is running...");
        }
    }

    // Step 4: Define a client that needs dependency injection
    static class Client {
        @Inject
        private Service service;

        public void execute() {
            service.serve();
        }
    }

    // Step 5: Test the DI container
    public static void main(String[] args) {
        register(Service.class);  // Register dependency
        Client client = getInstance(Client.class); // Get Client with injected Service
        client.execute(); // Test
    }
}

