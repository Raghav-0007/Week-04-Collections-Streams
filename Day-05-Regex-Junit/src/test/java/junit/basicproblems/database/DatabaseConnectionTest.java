package junit.basicproblems.database;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {

    DatabaseConnection db;

    @BeforeEach
    void setUp() {
        db = new DatabaseConnection();
        db.connect(); // Establish connection before each test
    }

    @AfterEach
    void tearDown() {
        db.disconnect(); // Close connection after each test
    }

    @Test
    void testConnectionIsEstablished() {
        assertTrue(db.isConnected(), "Database should be connected.");
    }

    @Test
    void testConnectionIsClosedAfterTest() {
        db.disconnect();
        assertFalse(db.isConnected(), "Database should be disconnected.");
    }
}
