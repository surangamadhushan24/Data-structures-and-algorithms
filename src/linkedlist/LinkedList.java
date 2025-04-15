package linkedlist;

import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;
    private Node last;
    private  int size;


    private boolean isEmpty(){
        return first == null;
    }
    public void addFirst(int value){

        var node = new Node();
        node.value = value;

        if(isEmpty()){

            node.next = null;
            first = last =node;

        }
        //   f|12|11  |11|0|l
        else {
            node.next = first;
            first = node;
        }

        size++;
    }

    public void addLast(int value){
        var node = new Node();
        node.value = value;
        if(isEmpty()){
            node.next = null;
            first =last = node;

        }
        else {
            node.next = null;
            last.next = node;
            last = node;
        }

        size++;
    }

    public void deleteFirst(){
        if(isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = null;
            last = null;
        }
        else {
            Node temp = first.next;
            first.next = null;
            first = temp;
        }
        size--;
    }

    public void deleteLast(){
        if(isEmpty())
            throw new NoSuchElementException();
        if (first == last) {
            first = last = null;
        }
        else {
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        size--;
    }

    private Node getPrevious(Node node){
        var current = first;
        while (current != null){
            if(current.next == node)
                return current;
            current = current.next;
        }
        return current;
    }

    public int indexOf(int item){
        int index = 0;
        var current = first;
        while (current != null){
            if(current.value == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    public int size(){
        return size;
    }

    public int[] toArray(){
        int[] array = new int[size];
        var current = first;
        int index = 0;
        while (current != null){
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }


}
