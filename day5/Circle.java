package com.celcom.day5;
import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		int radius ;
		double area;
		double circumference;
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter radius : ");
		radius = sc.nextInt();
		
		area = 3.14 * radius * radius;
		circumference = 2 * 3.14 * radius;
		
		System.out.println("Area of Circle : " + area);
		System.out.println("Circumference of Circle : " + circumference);
		
	}
	
	

}
