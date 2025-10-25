package com.ashwani.connectionjdbc.ashwani.logic_Building;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class StreamDemo01 {
    public static void main(String[] args) {
        sortedMap();
    }

    static void streamDemo01() {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        List<Integer> collect = list.stream().filter(n -> n % 3 != 0).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }

    static void streamDemo02() {
        List<String> listOfName = Arrays.asList("Raj", "Rahul", "Ankit", "Roshan", "Scott");

        List<String> collect = listOfName.stream().filter(str -> str.startsWith("R")).collect(Collectors.toList());
        System.out.println(collect);
    }

    static void sortedStream() {
        List<String> listOfName = Arrays.asList("Raj", "Rahul", "Ankit", "Roshan", "Scott");
        listOfName.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
    }

    static void fabonacii(int num) {
        int a = 0;
        int b = 1;
        for (int i = 0; i <= num; i++) {
            System.out.print(a + ",");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    static void armStrongNumber(int num) {
        int sum = 0;
        int rev = 0;
        int temp = num;
        int c = 0;
        while (temp != 0) {
            temp /= 10;
            c++;
        }

        temp = num;
        while (temp != 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, c);
            temp /= 10;
        }
        if (num == sum) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    static void sortEmployeeSalary() {
        List<Employe> listOfEmployee = new ArrayList<>();
        listOfEmployee.add(new Employe(111, "Scott", 75000D));
        listOfEmployee.add(new Employe(222, "John", 45000D));
        listOfEmployee.add(new Employe(333, "Martin", 55000D));
        listOfEmployee.add(new Employe(444, "Smith", 65000D));
        listOfEmployee.add(new Employe(555, "Virat", 95000D));

        listOfEmployee.stream().filter(emp -> emp.employeeSalary() > 50000).collect(Collectors.toList()).forEach(Sys -> System.out.println(Sys.employeeName()));
    }

    static void findEvenNumberAndCalculateCube() {
        List<Integer> listOPfNumber = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        listOPfNumber.stream().filter(num -> num % 2 == 0).map(n -> n * n * n).collect(Collectors.toList()).forEach(System.out::println);
    }

    static void flatMap() {
     /*   List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(11, 12, 13, 14, 15);
        List<Integer> list3 = Arrays.asList(21, 22, 23, 24, 25);
        List<List<Integer>> listOfList = Arrays.asList(list1, list2, list3);
        List<Integer> collect = listOfList.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        //System.out.println(collect);
        List<String> listOfNames = List.of("Aman", "Venkatesh", "Raj", "Scott", "Smith");
        List<Character> collect1 = listOfNames.stream().flatMap(str -> Stream.of(str.charAt(0))).collect(Collectors.toList());
//System.out.println(collect1);

        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8);
        LongStream longStream = LongStream.of(1L, 2L, 3L, 4L, 5L);
        DoubleStream doubleStream = DoubleStream.of(1.1, 1.2, 1.3, 1.4, 1.5);
        intStream.forEach(System.out::print);
        System.out.println();
        longStream.forEach(System.out::print);
        System.out.println();
        doubleStream.forEach(System.out::print);

        System.out.println();
        System.out.println("..........................");

        int a[] = {1, 2, 3, 4, 5};
        IntStream intStream2 = Arrays.stream(a);

        long l[] = {1L, 2L, 3L, 4L};
        LongStream longStream2 = Arrays.stream(l);

        double d[] = {1.2, 2.6, 3.9, 8.9};
        DoubleStream doubleStream2 = Arrays.stream(d);

        intStream2.forEach(System.out::print);
        System.out.println();
        longStream2.forEach(System.out::print);
        System.out.println();
        doubleStream2.forEach(System.out::print);*/
    }

    static void sortedMap(){
        //Print the numbers in descending order
        List<Integer> listOfNumber = List.of(89,67,56,45,23,15);
        listOfNumber.stream().sorted((a11,a12)->a12.compareTo(a11)).forEach(System.out::println);
        System.out.println("......................");
        Stream<String> s = Stream.of("Virat", "Rohit", "Dhoni", "Virat", "Rohit","Aswin","Bumrah");
        s.distinct().sorted((s11,s12)-> s11.compareTo(s12)).forEach(System.out::println);
        System.out.println("......................");
        Stream<String> streamOfNames = Stream.of("Virat", "Rohit", "Dhoni", "Zaheer", "Raina","Sahwag","Sachin","Bumrah");
        streamOfNames.skip(2).limit(5).forEach(System.out::println);
        System.out.println("......................");
        Stream<String> listOfFruits = Stream.of("Apple","Mango","Grapes","Kiwi","pomogranate");
     listOfFruits.peek(str -> str.toUpperCase()).map(str -> str.length()).collect(Collectors.toList()).forEach(System.out::println);

    }


}

record Employe(Integer employeeId, String employeeName, Double employeeSalary) {

}
