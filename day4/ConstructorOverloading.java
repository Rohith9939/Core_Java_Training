package com.celcom.day4;

public class ConstructorOverloading {
	ConstructorOverloading(int a, int b) {
		this(20.5, 30.0);
		System.out.println("Integer Concatination : " + a + b );
	}
	
	ConstructorOverloading(double a, double b) {
		System.out.println("Double Concatination : " + a + b );
	}
	
	ConstructorOverloading(String a, String b) {
		this(10, 20);
		System.out.println("String Concatination : " + a + b );
	}
	
	public static void main(String[] args) {
		ConstructorOverloading m1 = new ConstructorOverloading("Rohtih " , "Kumar");
//		ConstructorOverloading m3 = new ConstructorOverloading(15 , 30);
//		ConstructorOverloading m2 = new ConstructorOverloading(10.5 , 20.0);
		

	}

}
