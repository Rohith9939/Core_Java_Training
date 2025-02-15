package com.celcom.week2assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//search for an element in an array list
public class Assignment1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the "+ n +" elements: ");
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		
		System.out.println("Enter your target:");
		int target = sc.nextInt();		
		//to check the element available in the list or not
		System.out.println(list.contains(target));
		
		//to find index of element
		System.out.println(list.indexOf(target));
		System.out.println(list.lastIndexOf(target));
		
		boolean flag = false;
		
		//method1
		for(Integer e: list) {
			if(e == target) {
				flag = true;
				System.out.println(target + " available in the list\n");
			}
		}
		if(!flag) {
			System.out.println(target + " not available in the list\n");
		}
		
		//method2
		flag = false;
		Iterator<Integer>  it = list.iterator();
		while(it.hasNext()) {
			if(target ==  it.next()) {
				flag = true;
				System.out.println(target + " available in the list\n");
			}
		}
		if(!flag) {
			System.out.println(target + " not available in the list\n");
		}
		
		////method3
		flag = false;		
		for(int i=0; i<list.size();i++) {
			if(list.get(i) == target) {
				flag = true;
				System.out.println(target + " available at index: "+ i +"\n");
				break;
			}
		}
		if(!flag) {
			System.out.println(target + " not available in the list\n");
		}
		
		
		
		
	}

}
