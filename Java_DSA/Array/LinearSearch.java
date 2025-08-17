package com.ashwani.connectionjdbc.Java_DSA.Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[]  arr = {10, 20, 30, 40, 50};
        int target=50;
        System.out.println(linearSearch(arr,target));
    }
    public static int linearSearch(int arr[],int target){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return-1 ;
    }
}
