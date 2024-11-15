package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for( int i : nums){
            map.put( i, map.getOrDefault(i , 0) + 1) ;
        }
        for( Map.Entry<Integer,Integer> e : map.entrySet()){
            if( e.getValue() > nums.length / 3) list.add(e.getKey());
        }
        return list;
    }
}
