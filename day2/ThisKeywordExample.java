package com.celcom.day2;

class Employees {
	//Variable Declaration
	int eid;
	String ename;
	double esalary;
	
	//Constructor
	Employees(int eid, String ename, double esalary)
	{
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	
	//Method
	void display()
	{
		System.out.println("Employee Id : " + eid);
		System.out.println("Employee Name : " + ename);
		System.out.println("Employee Salary : " + esalary);
	}
}

public class ThisKeywordExample {
	public static void main(String[] args) {
		Employees emp1 = new Employees(101, "Rohith", 1000);
		emp1.display();
		
		Employees emp2 = new Employees(102, "kumar", 2000);
		emp2.display();
		
	}
	
}
