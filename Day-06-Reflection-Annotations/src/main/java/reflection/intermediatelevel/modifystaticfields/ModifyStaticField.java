package reflection.intermediatelevel.modifystaticfields;

import java.lang.reflect.Field;

public class ModifyStaticField {
    public static void main(String[] args) {
        try {
            // Get the Class object of Configuration
            Class<?> configClass = Configuration.class;

            // Get the Field object for API_KEY
            Field apiKeyField = configClass.getDeclaredField("API_KEY");

            // Make the field accessible (since it's private)
            apiKeyField.setAccessible(true);

            // Modify the static field value
            apiKeyField.set(null, "NEW_SECRET_KEY");

            // Print the modified value
            System.out.println("Modified API_KEY: " + Configuration.getApiKey());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
