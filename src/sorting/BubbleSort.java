package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {8,5,6,4,3,5,2};
        // 1 passes {5,6,4,3,5,2,8}
        // 2 passes {5,4,3,5,2,6,8}

        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {

        boolean isSorted;

        for(int j = 0; j <arr.length-1; j++){
            isSorted = true;
            for(int i=0;i<arr.length-1 -j;i++){
                
                if(arr[i]>arr[i+1]){
                    
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    isSorted = false;
                }

            }
            if(isSorted){
                return;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
