package LeetCode;

public class CheckIfArrayWasSortedBeforeRotation {
    public static boolean check(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1){
                if (nums[i] > nums[0]) count++;
            }
            else{
                if (nums[i] > nums[i + 1]) count++;
            }
            if (count > 1) return false;
        }
        return true;
    }
}
