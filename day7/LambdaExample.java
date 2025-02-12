package com.celcom.day7;

interface Calculator {
	int cal(int a, int b);
}
public class LambdaExample {
	public static void main(String[] args) {
		Calculator c = (a, b) -> a + b;
		c.cal(10, 20);
		
		c = (a, b) -> a - b;
		c.cal(20, 10);
		
		System.out.println(c.cal(10, 20));
	}
}
