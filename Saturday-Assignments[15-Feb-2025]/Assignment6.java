package com.celcom.week2assignment;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Assignment6 {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the "+ n +" elements: ");
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		
		//method 1
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		//method 2
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		//method 3
		for(Integer e : list) {
			System.out.print(e+" ");
		}
	}
}
