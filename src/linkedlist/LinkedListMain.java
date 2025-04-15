package linkedlist;

import java.util.Arrays;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(12);
        linkedList.addFirst(15);
        linkedList.addFirst(23);
        linkedList.addLast(10);
        linkedList.deleteFirst();
        linkedList.deleteLast();

        var array = linkedList.toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(linkedList.indexOf(12));
        System.out.println(linkedList.contains(12));
;

    }
}
