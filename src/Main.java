import queues.ArrayQueue;
import stack.Stack;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        ArrayQueue aq = new ArrayQueue();
        aq.enqueue(22);
        aq.enqueue(34);
        aq.enqueue(45);
        aq.dequeue();
        System.out.println(aq);


    }
}