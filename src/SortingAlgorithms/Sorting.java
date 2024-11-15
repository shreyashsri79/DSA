package SortingAlgorithms;

import Print.Print;

import java.awt.*;
import java.util.ArrayList;

public class Sorting {

    /////////////////////////////////////////Bubble Sort////////////////////////////////////////////////////////////////
    public static void bubbleSort( int[] arr){
        for (int i = arr.length - 1;  i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) Swapping.swap(arr, j, j + 1);
            }
        }
    }

    ////////////////////////////////////////Selection Sort//////////////////////////////////////////////////////////////
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) min = j;
            }
            Swapping.swap(arr , i , min);
        }
    }

    ////////////////////////////////////////Insertion Sort//////////////////////////////////////////////////////////////
    public static void insertionSort( int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]){
                Swapping.swap(arr, j, j - 1);
                j--;
            }
        }
    }

    ////////////////////////////////////////Merge Sort//////////////////////////////////////////////////////////////////
    public static void mergeSort( int[] arr){
        divide( arr, 0, arr.length - 1);
    }
    private static void divide( int[] arr, int low, int high){
        if (low >= high) return;
        int mid = low + ( high - low)/2;
        divide( arr, low, mid);
        divide( arr, mid + 1, high);
        merge(arr, low, mid, high);
    }
    private static void merge( int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while ( left <= mid && right <= high){
            if (arr[left] < arr[right]) {
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid){
            temp.add(arr[left]);
            left++;
        }
        while (right <= high){
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        Print.printArray(arr);
        System.out.println();
    }

    ///////////////////////////////////////////Quick Sort///////////////////////////////////////////////////////////////
    public static void quickSort( int[] arr){
        qs( arr, 0, arr.length - 1);
    }
    private static void qs( int[] arr, int low, int high){
        if (low < high){
            int pivot = helper( arr, low, high);
            qs( arr, low, pivot - 1);
            qs( arr, pivot + 1, high);
        }
    }
    private static int helper( int[] arr, int low, int high){
        int i = low;
        int j = high;
        int pivot = low; //taking first element as pivot.
        while (i < j){
            while ( arr[i] <= arr[pivot] && i < high) i++;
            while ( arr[j] >= arr[pivot] && j > low) j--;
            if (i < j) Swapping.swap(arr, i, j);
        }
        Swapping.swap( arr, j, pivot);
        return j;
    }

}

