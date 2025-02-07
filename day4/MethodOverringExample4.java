package com.celcom.day4;

class Animal3 {
	String msg = getMessage();
	
	String getMessage() {
		return "A";
	}
}

class Cat3 extends Animal3 {
	String getMessage() {
		return "B";
	}
}
public class MethodOverringExample4 {
	public static void main(String[] args) {
		Animal3 animal = new Animal3();
		System.out.println(animal.msg );
	}
}
