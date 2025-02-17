package junit.basicproblems.taskmanager;

public class TaskManager {

    // Simulates a long-running task
    public String longRunningTask() {
        try {
            Thread.sleep(3000); // Sleep for 3 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Task Completed";
    }
}
