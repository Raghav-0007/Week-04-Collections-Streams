package annotations.advancedlevel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

// Step 1: Define @CacheResult annotation
@Retention(RetentionPolicy.RUNTIME)
@interface CacheResult {}

// Step 2: Define a class with a computationally expensive method
public class CachingSystem {

    private final Map<String, Object> cache = new HashMap<>(); // Cache storage

    @CacheResult
    public int expensiveOperation(int number) {
        System.out.println("Computing expensive operation for: " + number);
        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); } // Simulating delay
        return number * number;
    }

    // Step 3: Execute method with caching logic
    public Object executeWithCache(String methodName, Object... args) {
        try {
            Method method = this.getClass().getDeclaredMethod(methodName, int.class);

            if (method.isAnnotationPresent(CacheResult.class)) {
                String key = methodName + "_" + args[0]; // Generate cache key

                if (cache.containsKey(key)) {
                    System.out.println("Returning cached result for: " + args[0]);
                    return cache.get(key);
                }

                Object result = method.invoke(this, args);
                cache.put(key, result); // Store result in cache
                return result;
            }

            return method.invoke(this, args);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Step 4: Main method to test caching
    public static void main(String[] args) {
        CachingSystem system = new CachingSystem();

        System.out.println("Result: " + system.executeWithCache("expensiveOperation", 5)); // Computed
        System.out.println("Result: " + system.executeWithCache("expensiveOperation", 5)); // Cached
        System.out.println("Result: " + system.executeWithCache("expensiveOperation", 10)); // Computed
        System.out.println("Result: " + system.executeWithCache("expensiveOperation", 10)); // Cached
    }
}

