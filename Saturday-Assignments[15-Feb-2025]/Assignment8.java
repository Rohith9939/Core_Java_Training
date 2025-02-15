package com.celcom.week2assignment;

import java.util.ListIterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Assignment8 {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the "+ n +" elements: ");
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		
	
		ListIterator<Integer> it = list.listIterator(list.size()-1);
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
	}
}