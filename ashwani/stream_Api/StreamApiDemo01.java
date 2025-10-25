package com.ashwani.connectionjdbc.ashwani.stream_Api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

record Employe(String empName, String empGen, Double empSal, Long empPhNo, int age) {
}

public class StreamApiDemo01 {
    public static void main(String[] args) {
        ArrayList<Employe> listOfEmployee = new ArrayList<>();

        listOfEmployee.add(new Employe("Scott", "male", 75000D, 1212121212L, 28));
        listOfEmployee.add(new Employe("John", "male", 500000D, 98989898L, 35));
        listOfEmployee.add(new Employe("Martin", "male", 6000000D, 999999999L, 42));
        listOfEmployee.add(new Employe("Smith", "male", 65000D, 00000000L, 30));
        listOfEmployee.add(new Employe("Virat", "male", 95000D, 13131313L, 33));

        listOfEmployee.add(new Employe("Priya", "female", 75000D, 1212121212L, 26));
        listOfEmployee.add(new Employe("Ananya", "female", 500000D, 98989898L, 31));
        listOfEmployee.add(new Employe("Sneha", "female", 6000000D, 999999999L, 40));
        listOfEmployee.add(new Employe("Neha", "female", 65000D, 00000000L, 29));
        listOfEmployee.add(new Employe("Aishwarya", "female", 95000D, 13131313L, 32));


        //find female employee using Stream API

        List<Employe> collect = listOfEmployee.stream().filter(emp -> emp.empGen() == "female").collect(Collectors.toList());
        collect.forEach(emp -> System.out.println(emp));

    }
}
