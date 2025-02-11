package com.celcom.day6;

public class NestedTryCatch {
	public static void main(String[] args) {
		
		System.out.println("Before exception");
		
		try {
			int a = 10 / 0;
		}catch (ArithmeticException e) {
			System.out.println(e);
			try {
				int arr[] = new int[-5];
			}
			catch (Exception e1) {
				System.out.println(e1);
			}
		}
	}

}
