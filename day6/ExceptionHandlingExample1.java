package com.celcom.day6;

public class ExceptionHandlingExample1 {
	
	public static void main(String[] args) {
		System.out.println("Before Exception");
		try {
//			int a = 10 / 0;
//			int b = Integer.parseInt("ABC");
//			int arr[] = new int[-5];
			int arr[] = {10, 20, 30};
			System.out.println(arr[3]);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
		
		
		System.out.println("After Exception");
	}

}
