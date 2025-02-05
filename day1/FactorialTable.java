package com.celcom.day1;

import java.util.Scanner;

public class FactorialTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n =sc.nextInt();
		int i = 1;
		int fact = 1;
		while(i <= n)
		{
			System.out.println("Factorial of " + i +" is: " + fact);
			fact *= ++i;
		}
		sc.close();
		
	}

}
