package GeeksForGeeks;

import java.util.HashMap;

public class LongestArrayWithSumK {
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int nums[], int n, int k) {
        //Complete the function
        HashMap<Integer,Integer> map = new HashMap<>();
        int length = 0;
        int maxLength = 0;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            if ( sum == k){
                length = i + 1;
            }
            else if( map.containsKey(sum - k)){
                length = i - map.get(sum - k);
            }
            if(!map.containsKey(sum)) map.put( sum, i);
            maxLength = Math.max( length, maxLength);
        }
        return maxLength;
    }
}
