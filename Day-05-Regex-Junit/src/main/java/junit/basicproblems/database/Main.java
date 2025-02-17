package junit.basicproblems.database;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection db = new DatabaseConnection();

        // Connecting to the database
        db.connect();
        System.out.println("Is database connected? " + db.isConnected());

        // Disconnecting from the database
        db.disconnect();
        System.out.println("Is database connected? " + db.isConnected());
    }
}
