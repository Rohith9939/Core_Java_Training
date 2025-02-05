package com.celcom.day2;
import java.util.Arrays;
public class ArraySortingExample {
	public static void main(String[] args) {
		int arr[] = {2, 1, 9, 4, 7};
		Arrays.sort(arr);
		
		for(int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + " ");
		}
		
		System.out.println("\nMinimum value : "+ arr[0]);
		System.out.println("Second minimum value : "+ arr[1]);
		
		System.out.println("Maximum value : "+ arr[arr.length - 1]);
		System.out.println("Second Maximum value : "+ arr[arr.length - 2]);
		
		//Descending
		for(int index = arr.length - 1; index >= 0; index--) {
			System.out.print(arr[index] + " ");
		}
	}

}
