package GeeksForGeeks;

import java.util.ArrayList;

public class LeadersInArray {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        int highest = 0;
        for( int i = n - 1; i >= 0; i--){
            if( arr[i] >= highest){
                highest = arr[i];
                list.add(arr[i]);
            }
        }
        reverse(list);
        return list;
    }
    static void swap( ArrayList<Integer> list, int a, int b){
        int temp = list.get(a);
        list.set( a, list.get(b));
        list.set( b, temp);
    }
    static void reverse( ArrayList<Integer> list){
        int i = 0, j = list.size() - 1;
        while( i <= j){
            swap( list, i , j);
            i++;
            j--;
        }
    }
}
