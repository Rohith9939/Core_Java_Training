package com.celcom.day4;

public class MethodOverloadExample3 {
	void concat(int a, int b) {
		System.out.println("Integer Concatination : " + a + b );
	}
	
	void concat(double a, double b) {
		System.out.println("Double Concatination : " + a + b );
	}
	
	void concat(String a, String b) {
		System.out.println("String Concatination : " + a + b );
	}
	
	public static void main(String[] args) {
		MethodOverloadExample3 m1 = new MethodOverloadExample3();
		m1.concat(10, 20);
		m1.concat(20.5, 40.0);
		m1.concat("Rohith ", "Kumar");
	}

}
