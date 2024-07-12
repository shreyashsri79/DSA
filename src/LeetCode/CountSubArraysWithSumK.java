package LeetCode;

import java.util.HashMap;

public class CountSubArraysWithSumK {
    public int subArraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0, sum = 0;
        map.put(0,1);
        for( int i : nums){
            sum += i;
            count += map.getOrDefault( sum - k, 0);
            map.put( sum, map.getOrDefault( sum, 0) + 1);
        }
        return count;
    }
}
