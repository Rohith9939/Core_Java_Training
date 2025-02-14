package com.celcom.day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	transient public int eid;
	private String ename;
	private int esalary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return esalary;
	}
	public void setSalary(int salary) {
		this.esalary = salary;
	}
	public Employee(int eid, String ename, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = salary;
	}
	
	public String toString() {
		return "Employee [eid:" + eid + ", ename:" + ename + ", esalary:" + esalary + "]";
	}
	
}
public class SerializationExample1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee emp1 = new Employee(101, "Rohith", 20000);
		
		//serialization
		
		FileOutputStream fout = new FileOutputStream("D://ObjectFile.text");
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		objout.writeObject(emp1);
		objout.close();
		fout.close();
		System.out.println("Object Saved");
		
		//serialization
		
		FileInputStream fin = new FileInputStream("D://ObjectFile.text");
		ObjectInputStream objin = new ObjectInputStream(fin);
		Employee emp = (Employee) objin.readObject();
		objin.close();
		fin.close();
		System.out.println(emp);
		
		
	}
}
