package com.celcom.day7;

class MyThread extends Thread {
	
	public void run() {
		for(int i = 0; i <=5; i++) {
			System.out.println( " Running...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadExample2 {
	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread();
		System.out.println(t1.getState()); //NEW
		t1.setName("T1");
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		
		t1.start(); //Starting or Running my thread t1
		
//		Thread.sleep(3000);
		
		
		
		System.out.println("Main Thread End");
	}
}
