package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse( nums, 0, nums.length - 1);
        reverse( nums, 0, k - 1);
        reverse( nums, k, nums.length - 1);
    }
    private static void reverse( int[] nums, int start, int end){
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
