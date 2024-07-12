package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class RearrangeElementsBySign {
    public int[] rearrangeArray(int[] nums) {
        int posIndex = 0, negIndex = 1;
        int n = nums.length;

        int[] result = new int[n];

        for (int num : nums) {
            if (num > 0) {
                result[posIndex] = num;
                posIndex += 2;
            } else {
                result[negIndex] = num;
                negIndex += 2;
            }
        }

        return result;
    }
}
