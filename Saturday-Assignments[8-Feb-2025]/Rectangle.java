package com.celcom.day5;
import java.util.Scanner;
public class Rectangle {
	public static void main(String[] args) {
		
		int width;
		int height;
		int area;
		int perimeter;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter width and height : ");
		width = sc.nextInt();
		height = sc.nextInt();
		
		area = width * height;
		perimeter = 2 * (width + height);
		
		System.out.println("Area of Rectangle : " + area);
		System.out.println(("Perimeter of Rectangle : " + perimeter));
		
	}
}
