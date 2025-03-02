package annotations.intermediatelevel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

// Step 1: Define @MaxLength annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MaxLength {
    int value();
}

// Step 2: Define User class with validation in constructor
public class User {

    @MaxLength(10) // Username cannot exceed 10 characters
    private String username;

    public User(String username) {
        this.username = username;
        validateMaxLength();
    }

    // Step 3: Validate field length using Reflection
    private void validateMaxLength() {
        Class<?> clazz = this.getClass();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength maxLength = field.getAnnotation(MaxLength.class);
                field.setAccessible(true);

                try {
                    String value = (String) field.get(this);
                    if (value.length() > maxLength.value()) {
                        throw new IllegalArgumentException(
                                "Error: " + field.getName() + " exceeds max length of " + maxLength.value() + " characters."
                        );
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Step 4: Main method to test
    public static void main(String[] args) {
        try {
            User user1 = new User("Alice"); // Valid
            System.out.println("User1 created successfully.");

            User user2 = new User("LongUsername123"); // Invalid, exceeds 10 chars
            System.out.println("User2 created successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

