package com.celcom.day3;

class A {
	A(){
		super(); //it will work (Object is a parent class for this A class)
		         // Object class has default empty constructor
		System.out.println("A");
	}
	A(int a){
		System.out.println("A 1");
	}
}
class B extends A {
	
	B() {
		this(10);
		System.out.println("B");
	}
	B(int a) {
		super(10);
		System.out.println("B 1");
	}
}

public class SuperClassConstructor {
	public static void main(String[] args) {
		B b = new B();
	}

}
