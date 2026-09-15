package searching;

public class JumpSearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6 ,7,8,9 ,12,13,15};

        System.out.println(jumpSearchAlgorithm(arr,15));
    }

    private static int jumpSearchAlgorithm(int[] arr, int target) {
        int start = 0;
        int partitionSize = (int) Math.sqrt(arr.length);
        int next = partitionSize;
        // size of partition 1/2n

        while (start<arr.length && arr[next-1]<target){
            start = next;
            next += partitionSize;

            if(next>arr.length){
                next = arr.length;
            }
        }

        for(var i = start;start<next;i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
}
