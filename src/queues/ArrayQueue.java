package queues;

import java.util.Arrays;

public class ArrayQueue {
    // enqueue dequeue peek isEmpty isFull
    int front;
    int rare;
    int[] arr;
    int count;

    public ArrayQueue(){
        arr = new int[5];
    }

    public void enqueue(int item){

        if(count == arr.length)
            throw new IllegalStateException();

        arr[rare++] =item;
        count++;

    }

    public int dequeue(){
        var item = arr[front];
        arr[front++] = 0;
        return item;
    }

    @Override
    public String toString() {
        ;
        return Arrays.toString(arr);
    }
}
