package com.celcom.week2assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the "+ n +" elements: ");
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		
		List<Integer> newList1 = new ArrayList<>(list);
		System.out.println(newList1);
		
		List<Integer> newList2 = new ArrayList<>();
		newList2.addAll(list);
		System.out.println(newList2);
		
		List<Integer> newList3 = new ArrayList<>();
		for(Integer e : list) {
			newList3.add(e);
		}
		System.out.println(newList3);
				
		List<Integer> newList4 = new ArrayList<>();
		newList4 = (ArrayList<Integer>) ((ArrayList<Integer>) list).clone();
		System.out.println(newList4);
		
		
		
	}
}
