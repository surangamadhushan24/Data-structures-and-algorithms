package searching;

public class BinarySearchIteration {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,8,9,12,13};

        System.out.println(binarySearchIteration(arr,8));
    }

    private static int binarySearchIteration(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;
        while (left<=right){
            int middle = (left+right)/2;
            if(arr[middle] == target)
                return middle;

            if(arr[middle]>target){
                right = middle -1;
            }
            else {
                left = middle +1;
            }
        }
        return -1;
    }


}
