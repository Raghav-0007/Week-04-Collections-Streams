package junit.basicproblems.taskmanager;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        System.out.println("Starting long-running task...");
        String result = taskManager.longRunningTask();
        System.out.println(result);
    }
}
