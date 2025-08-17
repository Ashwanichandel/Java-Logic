package com.ashwani.connectionjdbc.Java_DSA.Array;

import java.util.Arrays;

public class MoveZeroToEndDemo02 {
    public static void main(String[] args) {
        int arr[] = {1,1,0,2,0,2,3,0,3,0,3};
        System.out.println(Arrays.toString(moveZeroToEnd(arr,11)));
    }

    public static int[] moveZeroToEnd(int[] arr, int n){
        int j=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        while(j<n){
            arr[j]=0;
            j++;
        }
        return arr;
    }
}
