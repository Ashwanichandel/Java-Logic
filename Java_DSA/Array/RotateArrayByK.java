package com.ashwani.connectionjdbc.Java_DSA.Array;

import java.util.Arrays;

public class RotateArrayByK {
    public static void main(String[] args) {
        int n = 7;
        int d = 3;
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        rotateByk(arr, n, d);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] rotateArrayByK(int[] arr, int n, int d) {
        d = d % n;
        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        for (int i = n - d; i < n; i++) {
            arr[i] = temp[i - (n - d)];
        }
        return arr;
    }
/*
[1,2,3,4,5,6,7]
first three [1,2,3] reverse -->[3,2,1]
last reverse [4,5,6,7]--->[7,6,5,4]
array after reverse is [3,2,1,7,6,5,4] now reverse it [4,5,6,7,1,2,3]<-- this is ur final answer
 */

    public static void rotateByk(int arr[], int n, int d) {
        d = d % n;
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }


    public static void reverseArray(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
