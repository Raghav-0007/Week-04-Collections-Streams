package annotations.advancedlevel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

// Step 1: Define @JsonField annotation
@Retention(RetentionPolicy.RUNTIME)
@interface JsonField {
    String name(); // Custom JSON key
}

// Step 2: Define a User class with annotated fields
public class User {

    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_age")
    private int age;

    private String password; // Not annotated, so it won't be included in JSON

    public User(String username, int age, String password) {
        this.username = username;
        this.age = age;
        this.password = password;
    }

    // Step 3: Convert object to JSON string using Reflection
    public String toJson() {
        StringBuilder json = new StringBuilder("{");

        Class<?> clazz = this.getClass();
        Field[] fields = clazz.getDeclaredFields();
        boolean firstField = true;

        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                JsonField annotation = field.getAnnotation(JsonField.class);

                try {
                    if (!firstField) {
                        json.append(", ");
                    }
                    firstField = false;

                    json.append("\"").append(annotation.name()).append("\": ")
                            .append("\"").append(field.get(this)).append("\"");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        json.append("}");
        return json.toString();
    }

    // Step 4: Main method to test JSON serialization
    public static void main(String[] args) {
        User user = new User("Alice", 25, "secret123");
        System.out.println(user.toJson()); // Convert object to JSON
    }
}

