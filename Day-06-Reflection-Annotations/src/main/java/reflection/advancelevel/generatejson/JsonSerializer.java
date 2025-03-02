package reflection.advancelevel.generatejson;

import java.lang.reflect.Field;
import java.util.*;

class JsonSerializer{
    // Converts an object to a JSON-like string
    public static String toJson(Object obj) {
        if (obj == null) return "{}"; // Handle null case

        Class<?> clazz = obj.getClass();
        Map<String, Object> jsonMap = new HashMap<>();

        try {
            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true); // Allow access to private fields
                jsonMap.put(field.getName(), field.get(obj)); // Store field name and value
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Error accessing field values", e);
        }

        return mapToJson(jsonMap);
    }

    // Converts a Map to a JSON-like string
    private static String mapToJson(Map<String, Object> map) {
        StringBuilder json = new StringBuilder("{");
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            json.append("\"").append(entry.getKey()).append("\": ")
                    .append(formatValue(entry.getValue())).append(", ");
        }
        if (!map.isEmpty()) json.setLength(json.length() - 2); // Remove last comma
        json.append("}");
        return json.toString();
    }

    // Formats values correctly (adds quotes for Strings)
    private static String formatValue(Object value) {
        if (value instanceof String) {
            return "\"" + value + "\"";
        }
        return value != null ? value.toString() : "null";
    }
}
