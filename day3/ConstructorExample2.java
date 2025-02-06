package com.celcom.day3;

public class ConstructorExample2 {
	ConstructorExample2() { 
		this("Rohith");
		System.out.println("A");
	}
	
	ConstructorExample2(String name) {
		this(10);
		System.out.println("B");
	}
	
	ConstructorExample2(int a) {
		System.out.println("C");
	}
	
	public static void main(String[] args) {
		ConstructorExample2 obj = new ConstructorExample2();
	}

}
