package searching;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9,12,13};

        System.out.println(binarySearchRecursive(arr,12,0,arr.length-1));
    }

    private static int binarySearchRecursive(int[] arr, int target,int left,int right) {

        int middle = (left+right)/2;

        if(left>right){
            return -1;
        }

        if(arr[middle]==target){
            return middle;
        }

        if (arr[middle]>target){
            return binarySearchRecursive(arr,target,left,middle-1);
        }


        return binarySearchRecursive(arr,target,middle+1,right);



    }
}
