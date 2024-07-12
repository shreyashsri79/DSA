package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class NextPermutations {
    public static void nextPermutation(int[] nums) {
        int idx = -1;
        for( int i = nums.length - 2; i >= 0; i--){
            if( nums[i] < nums[ i + 1]){
                idx = i;
                break;
            }
        }
        if( idx == -1){
            reverse( nums, 0, nums.length - 1);
            return;
        }
        for( int i = nums.length - 1; i > idx; i--){
            if( nums[i] > nums[idx]){
                swap( nums, i, idx);
                break;
            }
        }
        reverse( nums, idx + 1, nums.length - 1);
        return;
    }
    private static void swap( int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    private static void reverse( int[] arr, int low, int high){
        while( low <= high){
            swap( arr, low, high);
            low++;
            high--;
        }
    }
}
