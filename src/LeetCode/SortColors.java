package LeetCode;

import java.util.HashMap;

public class SortColors {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,0);
        map.put(2,0);
        for( int num : nums){
            map.put( num, map.get(num) + 1);
        }
        int i = 0;
        while( i < nums.length){
            if( map.get(0) != 0){
                nums[i++] = 0;
                map.put( 0, map.get(0) - 1);
            }
            else if( map.get(1) != 0){
                nums[i++] = 1;
                map.put( 1, map.get(1) - 1);
            }
            else {
                nums[i++] = 2;
                map.put( 2, map.get(2) - 1);
            }
        }
    }
}
