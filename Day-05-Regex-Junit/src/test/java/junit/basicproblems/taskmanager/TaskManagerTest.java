package junit.basicproblems.taskmanager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

class TaskManagerTest {

    TaskManager taskManager = new TaskManager();

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS) // Fails if execution takes more than 2 seconds
    void testLongRunningTaskTimeout() {
        assertEquals("Task Completed", taskManager.longRunningTask());
    }
}
