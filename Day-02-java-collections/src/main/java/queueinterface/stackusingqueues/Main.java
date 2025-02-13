package queueinterface.stackusingqueues;

public class Main {
    public static void main(String[] args) {

        StackUsingQueues stack=new StackUsingQueues();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(6);
        System.out.println("top element"+stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("top element"+stack.top());
    }
}
