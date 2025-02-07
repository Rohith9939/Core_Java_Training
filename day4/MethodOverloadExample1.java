package com.celcom.day4;

public class MethodOverloadExample1 {
	
	void myMethod(int a) {
		int fact = 1;
		for(int i = 0; i <= 5 ; i++) {
			fact *= i;
		}
		System.out.println("Factorial : " + fact);
	}
	
	void myMethod(int a, int b) {
		int sum = a + b;
		System.out.println("Addition : " + sum);
	}
	
	void myMethod(String name) {
		System.out.println("welcom " +name);
	}
	
	public static void main(String[] args) {
		MethodOverloadExample1 m1 = new MethodOverloadExample1();
		m1.myMethod(10);
		m1.myMethod(10, 20);
		m1.myMethod("Rohith");
	}
}
