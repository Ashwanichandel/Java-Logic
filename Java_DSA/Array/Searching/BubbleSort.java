package com.ashwani.connectionjdbc.Java_DSA.Array.Searching;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 7, 2, 4, 1};
        bubbleSort(arr);
    }

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int temp = 0;
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[i] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i=1;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
}
