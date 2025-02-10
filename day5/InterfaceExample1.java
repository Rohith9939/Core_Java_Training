package com.celcom.day5;

interface VehiclePlan1  {
	void noOfEngine();
}

interface VehiclePlan2 {
	void noOfWheels();
	void brandName();
}

abstract class Vehicle1 implements VehiclePlan1 {
	public void noOfEngine() {
		System.out.println("I have one Engine");
	}
}

class Car3 extends Vehicle1 {

	public void noOfWheels() {
		System.out.println("I have Four Wheels");
	}

	public void brandName() {
		System.out.println("My brand name BENZ");
	}
	
}
public class InterfaceExample1 {
	public static void main(String[] args) {
		Car3 car = new Car3();
		car.brandName();
	}
}
