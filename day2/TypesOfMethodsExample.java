package com.celcom.day2;

public class TypesOfMethodsExample {
	
	void m1() {
		System.out.println("Instance Method");
	}
	static void m2() {
		System.out.println("Static Method");
	}
	
	public static void main(String[] args) {
		TypesOfMethodsExample obj = new TypesOfMethodsExample();
		obj.m1();
		
		TypesOfMethodsExample.m2();
	}
}
