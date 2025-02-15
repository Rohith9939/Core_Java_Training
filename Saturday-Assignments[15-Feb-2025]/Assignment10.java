package com.celcom.week2assignment;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Assignment10 {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the " + n + " elements: ");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		
		// Method 1: Using constructor to copy the list
		List<Integer> list1 = new LinkedList<>(list);
		System.out.println(list1);
		
		// Method 2: Using loop to copy elements (to a new list)
		List<Integer> list2 = new LinkedList<>();
		for (Integer e : list) {
			list2.add(e); // Add to list2, not list
		}
		System.out.println(list2);
		
		// Method 3: Using addAll to copy the list
		List<Integer> list3 = new LinkedList<>();
		list3.addAll(list); // Add all elements from list to list3
		System.out.println(list3);
		
		// Method 4: Using clone to create a shallow copy of the list
		LinkedList<Integer> list4 = (LinkedList<Integer>) ((LinkedList<Integer>) list).clone();
		System.out.println(list4);
	}
}
