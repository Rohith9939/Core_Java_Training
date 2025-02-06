package com.celcom.day3;

public class Mobile {
	
	String brand;
	String version;
	int price;
	int ram;
	
	Mobile(String brand, String version, int price, int ram)
	{
		this.brand = brand;
		this.version = version;
		this.price = price;
		this.ram = ram;
	}
	
	void display()
	{
		System.out.println("Mobile brand " + brand);
		System.out.println("Mobile version " + version);
		System.out.println("Mobile price " + price);
		System.out.println("Mobile ram " + ram);
	}
	
	public static void main(String[] args) {
		Mobile m1 = new Mobile("Realme", "13 pro", 25000, 16);
		m1.display();
		
		System.out.println();
		
		Mobile m2 = new Mobile("Redmi", "14 pro", 23000, 8);
		m2.display();
		
		
	}

}
