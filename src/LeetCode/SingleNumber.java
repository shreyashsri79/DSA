package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for( int i : nums){
            if( map.containsKey(i)) map.put( i, map.get(i) + 1);
            else map.put( i, 1);
        }
        for(Map.Entry< Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) return e.getKey();
        }
        return 0;
    }
}
