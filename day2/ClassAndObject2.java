package com.celcom.day2;

class Fruits {
	String name;
	String color;
	int size;
	int price;
	
	//Constructor
	Fruits(String name, String color, int size, int price) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.price = price;
	}
	
	//Method
	void display() {
		System.out.println("Fruit name : "+ name);
		System.out.println("Fruit color : "+ color);
		System.out.println("Fruit size : "+ size);
		System.out.println("Fruit price : "+ price);
	}
	
	void setPrice(int price)
	{
		this.price = price;
	}
}
public class ClassAndObject2 {
	public static void main(String[] args) {
		Fruits apple = new Fruits("Apple", "Red", 10, 200);
		apple.display();
	}

}
