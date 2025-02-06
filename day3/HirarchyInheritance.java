package com.celcom.day3;

class Vehicle2 {
	void noOfEngine() {
		System.out.println("I have One Engine");
	}
}

class TwoWheeler3 extends Vehicle2 {
	void noOfWheels() {
		System.out.println("I have Two Wheels");
	}
}
class Bike1 extends TwoWheeler3 {
	void brandName() {
		System.out.println("My brand name is Honda");
	}
}

class Scooty extends TwoWheeler3 {
	void brandName() {
		System.out.println("My brand name is Activa");
	}
}

public class HirarchyInheritance {
	public static void main(String[] args) {
		Bike1 honda = new Bike1();
		honda.noOfEngine();
		honda.noOfWheels();
		honda.brandName();
		
		Scooty activa = new Scooty();
		activa.noOfEngine();
		activa.noOfWheels();
		activa.brandName();
	}

}

