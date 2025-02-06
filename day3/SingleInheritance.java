package com.celcom.day3;

class Vehicle {
	void noOfEngine() {
		System.out.println("I have One Engine");
	}
}

class TwoWheeler extends Vehicle {
	void noOfWheels() {
		System.out.println("I have Two Wheels");
	}
}

public class SingleInheritance {
	public static void main(String[] args) {
		TwoWheeler two = new TwoWheeler();
		two.noOfEngine();
		two.noOfWheels();
	}

}
