package queueinterface.stackusingqueues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public StackUsingQueues(){
        queue1=new LinkedList<>();
        queue2=new LinkedList<>();
    }

    public void push(int data){
        queue1.add(data);
        System.out.println(queue1);
    }

    public int pop(){
        if(queue1.isEmpty()) return -1;
        while (queue1.size()!=1){
            queue2.add(queue1.remove());
        }
        queue1.addAll(queue2);
        queue2.clear();
        return queue1.remove();
    }

    public int top(){
        if(queue1.isEmpty()) return -1;
        while (queue1.size()!=1){
            queue2.add(queue1.remove());
        }
        int temp=queue1.remove();
        queue2.add(temp);
        queue1.addAll(queue2);
        queue2.clear();
        return temp;
    }
}
