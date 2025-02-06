package com.celcom.day3;

class Vehicles {
	String name = "I am a super class variable";
	
	Vehicles() {
		System.out.println("I am a super class constructor");
	}
	
	void noOfEngine() {
		System.out.println("I have One Engine");
	}
}

class TwoWheelers extends Vehicles {
	
	TwoWheelers() {
		super();
	}
	void noOfWheels() {
		super.noOfEngine();
		System.out.println("I have Two Wheels");
		System.out.println(super.name);
	}
}


public class SuperKeyword {
	public static void main(String[] args) {
		TwoWheelers two = new TwoWheelers();
		two.noOfWheels();
		
	}

}

