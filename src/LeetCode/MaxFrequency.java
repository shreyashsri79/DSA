package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class MaxFrequency {
    public static int maxFrequency(int[] nums, int k) {
        int count = 1;
        Arrays.sort(nums);
        int highest = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            int diff = highest - nums[i];
            if ( diff <= k){
                nums[i] = highest;
                k -= diff;
                count ++;
            }else break;
        }
        return count;
    }
}
