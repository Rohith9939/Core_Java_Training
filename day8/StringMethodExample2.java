package com.celcom.day8;

public class StringMethodExample2 {
	public static void main(String[] args) {
		String s1 = "Java";
		
		for(int i=0; i<s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}
		
		char ch[] = s1.toCharArray();
		for(char c: ch) {
			System.out.println(c);
		}
		
		String s2 = " welcome to Java Programming";
		String temp1[] = s2.split(" ");
		for(String s: temp1) {
			System.out.println(s);
		}
	}
	
	

}
