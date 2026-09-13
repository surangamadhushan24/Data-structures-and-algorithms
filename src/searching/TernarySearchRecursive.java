package searching;

public class TernarySearchRecursive {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9,12,13,16,17};

        System.out.println(ternarySearchRecursive(arr,17,0,arr.length-1));
    }

    private static int ternarySearchRecursive(int[] arr, int target,int left,int right) {

        int partitionSize = (right-left)/3;


        int middle1 = (left+partitionSize);
        int middle2 = (right-partitionSize);

        if(left>right){
            return -1;
        }

        if(arr[middle1]==target){
            return middle1;
        }

        if(arr[middle2]==target){
            return middle2;
        }

        if (arr[middle1]>target){
            return ternarySearchRecursive(arr,target,left,middle1-1);
        }
        if (arr[middle1]<target && target<arr[middle2]){
            return ternarySearchRecursive(arr,target,middle1+1,middle2-1);
        }



        return ternarySearchRecursive(arr,target,middle2+1,right);



    }
}
