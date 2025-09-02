package com.ashwani.connectionjdbc.ashwani.logic_Building;

import java.util.Arrays;

public class PracticeSet02 {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6};
        //swap(arr,0,4);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

    }
    public static void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
