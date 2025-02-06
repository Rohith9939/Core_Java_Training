package com.celcom.day3;

public class ConstructorExample1 {

	String name;
	
	ConstructorExample1(){
		//System.out.println("Kumar"); // Error : Constructor call must be the first statement in a constructor
		this("Rohith");
		//ConstructorExample1("Ram"); //Error using this only can
		
	}
	ConstructorExample1(String name) {
		this.name = name;
		greeting();
	}
	
	
	void greeting() {
		System.out.println("Hello " + "Welcome");		
	}
	
	public static void main(String[] args) {
		ConstructorExample1 obj = new ConstructorExample1();
	}
}
