package queueinterface.reverseaqueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>(Arrays.asList(10,20,30,40));
        ReverseQueue.reverseQueue(queue);
        System.out.println(queue);
    }
}
