package com.celcom.day5;

class Animal {
	void makeSound() {
		System.out.println("Animal makes sound");
	}
}

class Cat extends Animal {
	void makeSound() {
		System.out.println("Cat Barks");
	}
}

class AnimalMain {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.makeSound();
		
		Cat cat = new Cat();
		cat.makeSound();
	}
}