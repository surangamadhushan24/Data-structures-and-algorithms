package stack;

import java.util.Arrays;

public class Stack {

    int count;
    int[] arr;

    public Stack(){
        arr = new int[5];
    }

    public void push(int item){

        if(arr.length == count){
            throw new StackOverflowError();
        }

        arr[count++] =item;

    }

    public int peak(){

        if(count==0){
            throw new IllegalMonitorStateException();
        }

        return arr[count - 1];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public int pop(){

        if(count==0){
            throw new IllegalMonitorStateException();
        }

        return arr[--count];
    }

    @Override
    public String toString() {
        var content = Arrays.copyOfRange(arr,0,count);
        return Arrays.toString(content) ;
    }
}
