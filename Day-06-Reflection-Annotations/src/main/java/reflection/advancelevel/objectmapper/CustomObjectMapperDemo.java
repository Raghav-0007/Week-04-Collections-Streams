package reflection.advancelevel.objectmapper;

import java.util.Map;

// Main class to test the ObjectMapper
public class CustomObjectMapperDemo {
    public static void main(String[] args) {
        Map<String, Object> properties = Map.of(
                "name", "John Doe",
                "age", 30
        );

        // Convert Map to Person object
        Person person = ObjectMapper.toObject(Person.class, properties);

        // Print the populated object
        System.out.println(person);
    }
}
