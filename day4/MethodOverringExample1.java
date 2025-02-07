package com.celcom.day4;

class SuperClass {
	void myMethod() {
		System.out.println("I am from SuperClass");
	}
}
class SubClass extends SuperClass {
	void myMethod() {
		System.out.println("I am from SubClass");
		//super.myMethod();
	}
}
public class MethodOverringExample1 {
	
	public static void main(String[] args) {
		SubClass obj1 = new SubClass();
		obj1.myMethod();
		
		SuperClass obj2 = new SubClass(); //DMD
		obj2.myMethod();
		
	}

}
