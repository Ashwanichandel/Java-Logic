package com.ashwani.connectionjdbc.Java_DSA.Array;

public class SecondMax {
    public static void main(String[] args) {
        int arr[]={1,2,3,3};
        System.out.println(arrayIsSortedOrNot(arr));
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

    public static  int thirdLargest(int arr[]){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>first){
                third=second;
                second=first;
                first=arr[i];
            } else if (arr[i]>second && arr[i]!=first) {
                third=second;
                second=arr[i];
            } else if (arr[i]>third && arr[i]!=first && arr[i]!=second){
                third=arr[i];
            }
        }

        return third;
    }

    public static boolean arrayIsSortedOrNot(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){

            }else {
                return false;
            }
        }
        return true;
    }
}
