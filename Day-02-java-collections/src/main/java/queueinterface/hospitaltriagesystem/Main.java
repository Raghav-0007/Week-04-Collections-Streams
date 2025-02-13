package queueinterface.hospitaltriagesystem;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        // PriorityQueue with custom comparator (higher severity first)
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>(
                (p1, p2) -> Integer.compare(p2.severity, p1.severity)
        );

        // Adding patients
        triageQueue.add(new Patient("John", 3));
        triageQueue.add(new Patient("Alice", 5));
        triageQueue.add(new Patient("Bob", 2));

        // Treating patients in priority order
        while (!triageQueue.isEmpty()) {
            System.out.println("Treating: " + triageQueue.poll());
        }
    }
}
