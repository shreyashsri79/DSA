package GeeksForGeeks;

import java.util.ArrayList;
import java.util.List;

public class UnionOfArray {
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        if (arr1[i] <= arr2[j]) {
            list.add(arr1[i++]);
        }
        else{
            list.add(arr2[j++]);
        }
        while ( i < n && j < m){
            if (arr1[i] <= arr2[j]) {
                if (list.get(list.size() - 1) != arr1[i]) list.add(arr1[i]);
                i++;
            }
            else{
                if (list.get(list.size() - 1) != arr2[j]) list.add(arr2[j]);
                j++;
            }
        }
        while (i < n) {
            if (list.get(list.size() - 1) != arr1[i]) list.add(arr1[i]);
            i++;
        }
        while (j < m){
            if (list.get(list.size() - 1) != arr2[j]) list.add(arr2[j]);
            j++;
        }
        return list;
    }
}
