package queueinterface.reverseaqueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    // method to reverse a queue
    public static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        // Step 1: Dequeue all elements and push into stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // Step 2: Pop from stack and enqueue back into queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}
