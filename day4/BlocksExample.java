package com.celcom.day4;

public class BlocksExample {
	
	BlocksExample() {
		System.out.println("Constructor Block");
	}
	
	{
		System.out.println("Instance Block");
	}
	
	static {
		System.out.println("Static Block");
	}
	
	public String toString() {
		return "To toString";
	}
	public static void main(String[] args) {
		System.out.println("Main method Block");
		BlocksExample obj = new BlocksExample();
		System.out.println(obj);
	}
}
