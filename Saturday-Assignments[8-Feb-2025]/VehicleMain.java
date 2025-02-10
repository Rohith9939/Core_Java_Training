package com.celcom.day5;

class Vehicle {
	
	void drive() {
		System.out.println("Vehicle is repairable");
	}
}

class Car extends Vehicle {
	void drive() {
		System.out.println("Repairing a car");
	}
}

public class VehicleMain {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.drive();
		
		Car car = new Car();
		car.drive();
		
	}
	
}
