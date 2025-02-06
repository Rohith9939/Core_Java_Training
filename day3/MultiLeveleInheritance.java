package com.celcom.day3;

class Vehicle1 {
	void noOfEngine() {
		System.out.println("I have One Engine");
	}
}

class TwoWheeler2 extends Vehicle1 {
	void noOfWheels() {
		System.out.println("I have Two Wheels");
	}
}
class Bike extends TwoWheeler2 {
	void brandName() {
		System.out.println("My brand name is Honda");
	}
}


public class MultiLeveleInheritance {
	public static void main(String[] args) {
		Bike honda = new Bike();
		honda.noOfEngine();
		honda.noOfWheels();
		honda.brandName();
	}

}

