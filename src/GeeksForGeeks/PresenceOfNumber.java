package GeeksForGeeks;

public class PresenceOfNumber {
    public static int searchInSorted(int arr[], int N, int K) {

        // Your code here
        return binarySearch(arr, K, 0, N - 1);

    }

    private static int binarySearch(int arr[], int K, int low, int high) {
        if ((high - low < 2) && (arr[high] != K && arr[low] != K)) return -1;
        int mid = low + (high - low) / 2;
        if (arr[mid] > K) {
            return binarySearch(arr, K, low, mid - 1);
        } else if (arr[mid] < K) {
            return binarySearch(arr, K, mid + 1, high);
        } else return 1;
    }
}
