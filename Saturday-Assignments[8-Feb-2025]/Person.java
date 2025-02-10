package com.celcom.day5;

public class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
	
	public static void main(String[] args) {
		Person person = new Person("Rohith", 21);
		person.display();
	}
}
