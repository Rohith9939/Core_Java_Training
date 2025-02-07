package com.celcom.day4;

public class PronicNumber {
	public static void main(String[] args) {
		int num = 42;
		
		for(int i = 1; i <= num/2; i++) {
			if(i*(i+1) == num) {
				System.out.println("Pronic number");
				return;
			}
		}
		System.out.println("Not a pronic number");
	}

}
