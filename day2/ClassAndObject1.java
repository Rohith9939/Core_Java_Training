package com.celcom.day2;

class Employee {
	//Variable Declaration
	int eid;
	String ename;
	double esalary;
	
	//Constructor
	Employee(int id, String name, double salary)
	{
		eid = id;
		ename = name;
		esalary = salary;
	}
	
	//Method
	void display()
	{
		System.out.println("Employee Id : " + eid);
		System.out.println("Employee Name : " + ename);
		System.out.println("Employee Salary : " + esalary);
	}
}

public class ClassAndObject1 {
	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Rohith", 1000);
		emp1.display();
		
		Employee emp2 = new Employee(102, "kumar", 2000);
		emp2.display();
		
	}
	
}
