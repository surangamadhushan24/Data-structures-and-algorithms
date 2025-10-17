package hashtable;

import java.util.LinkedList;

public class HashTable {
    private class Entry{
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }

    }

    // entries = { LE ,LE, LE}

    private LinkedList<Entry> [] entries = new LinkedList[5];

    private void put(int key, String value){
        var index= hash(key);
        if(entries[index] == null){
           entries[index] = new LinkedList<>();
        }



        entries[index].addLast(new Entry(key,value));

    }

    private int hash(int key){
        return key % entries.length;
    }




}
