package com.ashwani.connectionjdbc.Java_DSA.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 5, 6, 7};
        System.out.println(Arrays.toString(unionTwoSortedArrayApproch01(arr1,arr2)));
    }

    public static int[] unionTwoSortedArrayApproch01(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        int union[] = new int[set.size()];
        int i = 0;
        for (Integer it : set) {
            union[i++] = it;
        }
        Arrays.sort(union);
        return union;
    }
}
