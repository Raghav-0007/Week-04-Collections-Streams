package queueinterface.circularbuffersimulation;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CircularBufferSimulation {
    Queue<Integer> queue;

    public CircularBufferSimulation(){
        queue=new LinkedList<>();
    }

    public void insert(int data){
        if(queue.size()==3) queue.remove();
        queue.add(data);
        System.out.println(queue);
    }
}
