package com.celcom.day6;

import java.util.Scanner;

class NoVowelException extends Exception {
	String str;

	NoVowelException(String str) {
		this.str = str;
	}

	public String toString() {
		return str + " does not contails vowels.";
	}
}

public class Assignment2 {
	public static void main(String[] args) {
		String str;
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		str = sc.next();

		boolean flag = false;
		 
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
	                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				flag = true;
				break;
			}
		}
 
		if (flag) {
			System.out.println(str + " contain vovel");
		} else {
			try {
				throw new NoVowelException(str);
			} catch (NoVowelException e) {
				System.out.println(e);
			}
		}
	}

}
