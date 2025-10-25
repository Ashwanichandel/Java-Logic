package com.ashwani.connectionjdbc.ashwani.stream_Api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

record Employe(String empName, String empGen, Double empSal, Long empPhNo, int age) {
}

public class StreamApiDemo01 {
    public static void main(String[] args) {
        ArrayList<Employe> listOfEmployee = new ArrayList<>();

        listOfEmployee.add(new Employe("Scott", "male", 72000D, 9876543210L, 27));
        listOfEmployee.add(new Employe("John", "male", 510000D, 9898765432L, 34));
        listOfEmployee.add(new Employe("Martin", "male", 5800000D, 9123456789L, 41));
        listOfEmployee.add(new Employe("Smith", "male", 67000D, 9988776655L, 29));
        listOfEmployee.add(new Employe("Virat", "male", 120000D, 9090909090L, 32));

        listOfEmployee.add(new Employe("Priya", "female", 76000D, 9876501234L, 25));
        listOfEmployee.add(new Employe("Ananya", "female", 490000D, 9823456789L, 30));
        listOfEmployee.add(new Employe("Sneha", "female", 6100000D, 9765432109L, 39));
        listOfEmployee.add(new Employe("Neha", "female", 68000D, 9933445566L, 28));
        listOfEmployee.add(new Employe("Aishwarya", "female", 98000D, 9012345678L, 31));


        //find female employee using Stream API

        List<Employe> collect = listOfEmployee.stream().filter(emp -> emp.empGen() == "female").collect(Collectors.toList());
        collect.forEach(emp -> System.out.println(emp));
        System.out.println("\n=====================** list of employee who has age >30=====================");
        List<Employe> listOfempAge = listOfEmployee.stream().filter(emp -> emp.age() > 30).collect(Collectors.toList());
        listOfempAge.forEach(emp -> System.out.println(emp));
        System.out.println("\n=====================** employee count who has age >30=====================");
        long count = listOfempAge.stream().count();
        System.out.println(count);
        System.out.println("\n=====================** *********  =====================");
        List<Employe> empSal = listOfEmployee.stream().filter(emp -> emp.empSal() > 50000).collect(Collectors.toList());
        for (Employe employe : empSal) {
            System.out.println(employe);
        }
        System.out.println("\n===================== ** create a list of employee name ** =====================");
        List<String> listOfEmpName = listOfEmployee.stream().map(emp -> emp.empName()).collect(Collectors.toList());
        for (String name : listOfEmpName) {
            System.out.println(name);
        }
    }
}
