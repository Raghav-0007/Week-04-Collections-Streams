package reflection.advancelevel.generatejson;

// Main class to test JSON serialization
public class JsonReflectionDemo {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30, true);

        // Convert the object to JSON-like string
        String json = JsonSerializer.toJson(person);

        // Print the JSON output
        System.out.println(json);
    }
}
