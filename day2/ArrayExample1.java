package com.celcom.day2;

public class ArrayExample1 {
	public static void main(String arr[]) {
		int ar[] = {10, 20, 30, 40, 50};
		System.out.println("Array Length : " + ar.length);
		System.out.println("Array Ellements are :");
		int sum = 0;
		for(int i = 0; i < ar.length; i++)
		{
			System.out.println(ar[i]);
			sum += ar[i];
		}
		
		System.out.println("Sum of Array Elements : " + sum);
		
		for( int val : ar)
		{
			System.out.println(val);
		}
	}
}
