package com.celcom.day3;

import java.util.Scanner;

class Shape {
	double area;
	int radius;
	int length;
	int breadth;
	int height;
	
	Shape(int radius)
	{
		this.radius = radius;
	}
	Shape(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
		height = breadth;
	}
	
	
	void CalculateArea() {
		
	}
	
}
class Circle extends Shape{
	Circle(int radius) {
		super(radius);
	}

	void CalculateArea() {
		area = 3.14 * radius * radius;
		System.out.println("Area of Circle : " + area);
	}
		
	
}
class Rectangle extends Shape{
	Rectangle(int length, int breadth) {
		super(length, breadth);
	}
	void CalculateArea() {
		area = 0.5 * length * breadth;
		System.out.println("Area of Circle : " + area);
	}
}

class Triangle extends Shape {
	Triangle(int length, int height) {
		super(length, height);
	}
	void CalculateArea() {
		area = 0.5 * length * height;
		System.out.println("Area of Triangle : " + area);
	}
}

public class AreaCalculation {
	public static void main(String[] args) {
		System.out.println("Enter your choice : \n1.Circle \n2.Rectangle \n3.Triangle");
		Scanner sc = new Scanner(System.in);
		int  choice = sc.nextInt();
		Shape shape = null;
		switch(choice)
		{
		case 1:
			System.out.println("Enter radius: ");
			int radius = sc.nextInt();
			shape = new Circle(radius);
			shape.CalculateArea();
			break;
			
		case 2:
			System.out.println("Enter Length and Breadth: ");
			int length = sc.nextInt();
			int breadth = sc.nextInt();
			shape = new Rectangle(length, breadth);
			shape.CalculateArea();			
			break;
			
		case 3:
			System.out.println("Enter Length and Height: ");
			int base = sc.nextInt();
			int height = sc.nextInt();
			shape = new Triangle(base, height);
			shape.CalculateArea();			
			break;
		}
		
		sc.close();
	}

}
