package com.celcom.day7;

public class ThreadExample1 {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t); //Thread[main,5,main]
		
		System.out.println("Current Thread Name : " + t.getName()); //main
		System.out.println("Current Thread Priority : " + t.getPriority()); //5
	}

}
