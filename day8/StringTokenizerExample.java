package com.celcom.day8;

import java.util.StringTokenizer;
public class StringTokenizerExample {
	public static void main(String[] args) {
		String s1 = "Welcom to Java Programming";
		StringTokenizer st = new StringTokenizer(s1, " ");
		System.out.println(st.countTokens()); //4
		
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}

}
