package com.celcom.day5;

class Shape {
	
	int length;
	int breadth;
	
	void setVal(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	void getArea() {
		System.out.println("Area of shape is not defined");
	}
}

class Rectangle1 extends Shape {
	
	void getArea() {
		int area = length * breadth;
		System.out.println("Area of rectangle : " + area);
	}
}

public class AreaMain {
	public static void main(String[] args) {
		
		Shape shape = new Shape();
		shape.setVal(5, 3);
		shape.getArea();
		
		Rectangle1 rect = new Rectangle1();
		rect.getArea();
	}
}
