package com.celcom.day5;

abstract class Vehicle {
	void noOfEngine() {
		System.out.println("I have One Engine");
	}
	
	abstract void noOfWheels();
	
	
	abstract void brandName();
}
class Car extends Vehicle {

	
	void noOfWheels() {
		System.out.println("I have four Wheels");
		
	}

	void brandName() {
		System.out.println("My brand name BENZ");
	}	
	
}

abstract class Car1 extends Vehicle {
	abstract void brand();
}
public class AbstrctClassExample1 {
	public static void main(String[] args) {
		Vehicle vec = new Car();
		vec.noOfEngine();
		vec.noOfWheels();
		vec.brandName();
	}
}
