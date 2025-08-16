package com.ashwani.connectionjdbc.Java_DSA.Array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,3};
        System.out.println(removeDuplicate(arr));
    }

    public static int removeDuplicate(int[] arr) {
        if(arr.length==0)return -1;
        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=arr[i-1]){
                arr[index]=arr[i];
                index++;
            }
        }
        return index;
    }
}


