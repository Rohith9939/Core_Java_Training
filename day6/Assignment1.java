package com.celcom.day6;
import java.util.Scanner;
class DuplicateNumberException extends Exception{
	int num;
	DuplicateNumberException(int num){
		this.num = num;
	}
	public String toString() {
		return  num + "-" + "Duplicate Number,please Retry.";
	}
}
public class Assignment1 {
	public static void main(String[] args) {
		int size;
		System.out.println("Enter the size of Array: ");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		
		int arr[] = new int[size];
		
		int i = 0;
		System.out.println("Enter the numbers: ");
		do
		{
			arr[i] = sc.nextInt();
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					try {
						throw new DuplicateNumberException(arr[i]);
					} catch (DuplicateNumberException e) {
						System.out.println(e);
					}
				}
			}
			i++;
		}while(i<size);
	}
}
