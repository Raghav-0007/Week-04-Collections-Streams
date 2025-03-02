package reflection.advancelevel.objectmapper;

import java.lang.reflect.Field;
import java.util.Map;

class ObjectMapper {
    // Generic method to map properties to an object
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            // Create a new instance of the given class
            T instance = clazz.getDeclaredConstructor().newInstance();

            // Iterate through the map and set the field values
            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                try {
                    Field field = clazz.getDeclaredField(entry.getKey()); // Get field by name
                    field.setAccessible(true); // Allow access to private fields
                    field.set(instance, entry.getValue()); // Set value
                } catch (NoSuchFieldException e) {
                    // Ignore if the field is not found
                }
            }

            return instance;
        } catch (Exception e) {
            throw new RuntimeException("Error creating object", e);
        }
    }
}
