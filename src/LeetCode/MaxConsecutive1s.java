package LeetCode;

public class MaxConsecutive1s {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for( int i = 0; i < nums.length; i++){
            if ( nums[i] == 1) count++;
            else{
                if ( count > max) {
                    max = count;
                }
                count = 0;
            }
            if( i == nums.length - 1 && nums[i] == 1){
                if ( count > max) {
                    max = count;
                }
            }
        }
        return max;
    }
}
