package com.celcom.day5;

interface One {
	int a = 10; //by default interface variables public, static and final
}

interface Two {
	int a = 20;

	
}

interface Three extends One, Two {
	void addition();
}
  
class Addition implements Three {
	
	public void addition() {
		int add = One.a + Two.a;
		System.out.println("Addition is : " + add);
	}
}

public class MultipleInheritanceExample1 {
	public static void main(String[] args) {
		Addition obj = new Addition();
		obj.addition();
	}
}
