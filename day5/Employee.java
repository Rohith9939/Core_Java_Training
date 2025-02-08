package com.celcom.day5;

public class Employee {
	
	String name;
	String jobTitle;
	double salary;
	
	Employee(String name, String jobTitle, double salary)
	{
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}
	
	void calculate( ) {
		System.out.println("Monthly Salary : " + this.salary/12);
	}
	
	void setSalary(double salary) {
		this.salary = salary;
	}
	
	void display() {
		System.out.println("Employee name : " + name);
		System.out.println("Job title : " + jobTitle);
		System.out.println("Monthly Salary : " + this.salary/12);
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee("Rajesh", "Developer", 180000 );
		emp.calculate();
		emp.display();
		
		emp.setSalary(300000);
		emp.display();
	}
}
