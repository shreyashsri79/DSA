package GeeksForGeeks;

public class LargestElement {
    public static int largest(int n, int[] arr) {
        // code here
        int max = arr[0];
        for ( int element : arr){
            if ( element > max) max = element;
        }
        return max;
    }
}
