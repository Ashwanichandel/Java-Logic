package com.ashwani.connectionjdbc;

public class Employee implements Comparable<Employee> {
	private int id;
	private String fName, lName, email;
	private double salary;

	public Employee(int id, String fName, String lName, String email, double salary) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", salary="
				+ salary + "]";
	}

	@Override
	public int compareTo(Employee e) {
		 
		return this.id-e.id;
	}

}
