package com.ashwani.connectionjdbc.Java_DSA.Array.Searching;

public class BinarySearchDemo01 {
    public static void main(String[] args) {
        int[] arr = {-18, -12, 10, 13, 16, 18, 19};
        int target = 16;
        System.out.println(binarySearch(arr, target));
    }


    static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            //find mid
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
