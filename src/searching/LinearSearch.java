package searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {7, 2, 8, 3, 6, 8, 4, 5};
        System.out.println(linearSearch(arr,3));
    }

    private static int linearSearch(int[] arr,int target) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return 1;
        }
        return -1;

    }
}
