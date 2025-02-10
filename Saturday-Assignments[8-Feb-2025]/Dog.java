package com.celcom.day5;

public class Dog {
	String name;
	String breed;
	
	Dog(String name, String breed){
		this.name = name;
		this.breed = breed;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setBreed(String breed) {
		this.breed = breed;
	}
	
	void display() {
		System.out.println("Dog name : " + name);
		System.out.println("Dog breed : " + breed);
	}
	 public static void main(String[] args) {
		Dog dog = new Dog("Rocky", "German Shepherd");
		
		System.out.println("Before Updation :");
		dog.display();
		
		dog.setName("Charlie");
		dog.setBreed("French Bulldog");
		
		System.out.println("After Updation :");
		dog.display();
	}
}
