package com.celcom.day6;

import java.util.Scanner;

class InvalidAgeException extends Exception {
	int age;
	InvalidAgeException(int age){
		this.age = age;
	}
	public String toString() {
		return  age + "-" + "Invalid Age for Voting";
	}
}
public class ThrowException {
	public static void main(String[] args) {
		System.out.println("Enter your age: ");
		int age = new Scanner(System.in).nextInt();
		
		if(age>18) {
			System.out.println("Welcom to vote");
		} else {
			try {
				throw new InvalidAgeException(age);
			} catch (InvalidAgeException e) {
				System.out.println(e);
			}
		}
	}
}
