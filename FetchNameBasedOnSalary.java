package com.ashwani.streamapi_05oct;

import java.util.ArrayList;
import java.util.List;

record Employee(Integer employeId, String employeeName, Double employeeSalary) {

}

public class FetchNameBasedOnSalary {
	public static void main(String[] args) {
		List<Employee> listofEmployee = new ArrayList<Employee>();
		listofEmployee.add(new Employee(111, "Scott", 45000.00));
		listofEmployee.add(new Employee(112, "Ashwani", 55000.00));
		listofEmployee.add(new Employee(113, "Akshaya", 25000.00));
		listofEmployee.add(new Employee(114, "Scott", 42000.00));
		listofEmployee.add(new Employee(115, "Arpan", 57000.00));
		listofEmployee.add(new Employee(116, "Honney", 250003.00));
		listofEmployee.add(new Employee(117, "Smitt", 450000.00));
		listofEmployee.add(new Employee(118, "Abhishek", 535000.00));
		listofEmployee.add(new Employee(119, "Ananya", 253000.00));
		// on the basis of salary
		listofEmployee.stream().filter(emp -> emp.employeeSalary() > 50000)
		.forEach(System.out::println);
		// on the basis of name
		listofEmployee.stream().filter(emp -> emp.employeeSalary() > 50000)
				.forEach(e -> System.out.println(e.employeeName()));
		//on the basis of id
		listofEmployee.stream().filter(emp->emp.employeeSalary()>50000)
		.forEach(e->System.out.println(e.employeId()));
	}
}
