package arrays;

public class Arrays {
    int[] arr;
    int count;


    public Arrays(int length){
         this.arr = new int[3];

    }

    public void insert(int item){
        // resize array
        if(arr.length == count){
            int[] newItems = new int[count*2];
            for(int i=0; i < count; i++)
                newItems[i] = arr[i];

            arr = newItems;
        }
        // add items end of the array
        arr[count++] = item;
    }

    public void print(){
        for(int num : arr)
            System.out.println(num);

    }
    
    public void removeAt(int index){
        if(index < 0 || index >= count)
            throw new IllegalArgumentException();

        for(int i = index; i < count; i++)
            arr[i] = arr[i + 1];

        count --;

        if(count == arr.length/2){
            int[] newItems = new int[count];
            for(int i = 0; i < count ; i++){
                newItems[i] = arr[i];
            }
            arr = newItems;
        }
    }

    public int indexOf(int item){
        for(int i =0; i < count; i++){
            if(arr[i] == item)
                return i;
        }

        return -1;
    }



}
