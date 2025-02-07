package com.celcom.day4;

class vehicles1 {
	void engine() {
		System.out.println("All vehicles has an One Engine");
	}
	
	void wheels() {
		System.out.println("All vehicles has wheels");
	}
}

class Wheels {
	void WheelModel() {
		System.out.println("Wheel Model MRF");
	}
	
	void noOfWheels(String vehicleType) {
		if(vehicleType.equals("Two Wheeler")) {
			System.out.println("I have Two Wheels");
		} else if(vehicleType.equals("Four Wheeler")) {
			System.out.println("I have Four Wheels");
		}
	}
}

class Engine {
	void engineModel() {
		System.out.println("Engine Model is XYZ");
	}
}
class Car1 extends vehicles1 { //IS-A
	Wheels wheel = new Wheels(); //HAS-A
	Engine engine = new Engine(); //HAS-A
	
	void engineModel() {
		engine.engineModel();
	}
	
	void WheelModel() {
		wheel.WheelModel();
	}
	
	void noOfWheels() {
		wheel.noOfWheels("Four Wheeler");
	}
	
}

public class IsAHasARelations1 {
	public static void main(String[] args) {
		Car1 car = new Car1();
		car.engine();
		car.engineModel();
		
		car.wheels();
		car.WheelModel();
		car.noOfWheels();
	}
}
