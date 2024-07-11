package GeeksForGeeks;

import java.util.List;

public class Print2ndLargest {
    public int print2largest(List<Integer> arr) {
        // Code Here
        int[] max = {-1, arr.get(0)};
        for ( int i = 1; i < arr.size(); i++){
            if ( max[1] < arr.get(i)){
                max[0] = max[1];
                max[1] = arr.get(i);
            }
            else if ( max[0] < arr.get(i) && max[1] != arr.get(i)) max[0] = arr.get(i);
        }
        return max[0];
    }
}
