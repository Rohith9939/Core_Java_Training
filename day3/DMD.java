package com.celcom.day3;

class Veh {
	void m1() {
		System.out.println("Veh");
	}
	
}
class Bikes1 extends Veh{
	void m1() {
		System.out.println("Bikes");
	}
}

public class DMD {
	public static void main(String[] args) {
		Veh v = new Bikes1();
		v.m1();
		
	}
	
}
