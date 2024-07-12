package LeetCode;

public class Moves0s {
    public static void moveZeroes(int[] nums) {
        for( int i = 0, j = 0; i < nums.length; i++){
            if ( nums[i] != 0) {
                swap( nums, i , j);
                j++;
            }
        }
    }
    private static void swap( int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
