import LeetCode.RemoveDuplicatesFromSortedArray;
import LeetCode.RotateArray;
import Print.Print;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        RotateArray.rotate(arr, 3);
        Print.printArray(arr);
    }
}