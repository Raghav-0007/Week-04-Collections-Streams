package junit.basicproblems.database;

public class DatabaseConnection {

    private boolean isConnected;

    // Simulate database connection
    public void connect() {
        isConnected = true;
        System.out.println("Database Connected.");
    }

    // Simulate closing the database connection
    public void disconnect() {
        isConnected = false;
        System.out.println("Database Disconnected.");
    }

    // Check connection status
    public boolean isConnected() {
        return isConnected;
    }
}

