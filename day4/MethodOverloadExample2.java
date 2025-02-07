package com.celcom.day4;

public class MethodOverloadExample2 {
	void addition(int a, int b) {
		System.out.println("Integer Addition : " + (a + b));
	}
	
	void addition(double a, double b) {
		System.out.println("Double Addition : " + (a + b));
	}
	
	void addition(long a, long b) {
		System.out.println("Long Addition : " + (a + b));
	}
	
	public static void main(String[] args) {
		MethodOverloadExample2 m1 = new MethodOverloadExample2();
		m1.addition(10.5, 20.0);
		m1.addition(10, 20);
		m1.addition(20L, 30L);
	}
}
