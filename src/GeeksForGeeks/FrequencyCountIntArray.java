package GeeksForGeeks;

import java.util.HashMap;

public class FrequencyCountIntArray {
    public static void frequencyCount(int arr[], int N, int P){
        HashMap< Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int key = arr[i];
            if (hashMap.containsKey(key)){
                hashMap.put(key, hashMap.get(key) + 1);
            }
            else hashMap.put(key, 1);
        }

        for (int i = 1; i <= N; i++) {
            int key = i;
            if (hashMap.containsKey(key)) arr[i - 1] = hashMap.get(i);
            else arr[i - 1] = 0;
        }
    }
}
