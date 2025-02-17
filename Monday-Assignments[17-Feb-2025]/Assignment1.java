package com.celcom.day10;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
public class Assignment1 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter the size of Array: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		System.out.println(list);
		
		//method 1
		List<Integer> list1 = new LinkedList<>(list);
		System.out.println(list1);
		
		//method 2
		List<Integer> list2 = new LinkedList<>();
		list2.addAll(list);
		System.out.println(list2);
		
		
		List<Integer> list3 = new ArrayList<>();
		System.out.println("Enter the size of Array: ");
		n = sc.nextInt();
		for(int i=0;i<n;i++) {
			list3.add(sc.nextInt());
		}
		System.out.println(list3);
		
		//method 1
		List<Integer> list4 = new ArrayList<>(list3);
		System.out.println(list4);
		
		//method 1
		List<Integer> list5 = new ArrayList<>();
		list5.addAll(list3);
		System.out.println(list4);
	
		
		
	}

}
