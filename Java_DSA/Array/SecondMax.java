package com.ashwani.connectionjdbc.Java_DSA.Array;

public class SecondMax {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(secondLargest(arr));
    }
    public static int secondLargest(int[] arr){
        int largest=arr[0];
        int secondLargest=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            } else if (arr[i]<largest && arr[i]>secondLargest) {
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
}
