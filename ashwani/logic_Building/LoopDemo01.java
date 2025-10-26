package com.ashwani.connectionjdbc.ashwani.logic_Building;

public class LoopDemo01 {
    public static void main(String[] args) {
        numberTriangle2(5);
    }

    static void printStar44(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*\
     *
     **
     ***
     ****
     *****
     */
    static void rightTriangle(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     ******
     *****
     ****
     ***
     **
     */
    static void leftTriangle(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = i; j <=num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
        /*
         *
        ***
       *****
      *******
     *********
      *******
       *****
        ***
         *

         */
    static void upperTriangle(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = i; j < num; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = num; i >= 0; i--) {
            for (int j = i; j < num; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
        /*
        1
        12
        123
        1234
         */
    static void numberTriangle(int num){
        for (int i = 1; i <=num ; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    /*

     */
    static void numberTriangle2(int num){
        for (int i = 1; i <=num ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
