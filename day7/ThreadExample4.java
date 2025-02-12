package com.celcom.day7;

class TwoTable extends Thread {
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("2 * " + i + " = " + (2*i));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class FiveTable implements Runnable {
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.err.println("5 * " + i + " = " + (5*i));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadExample4 {
	public static void main(String[] args) throws InterruptedException {
		TwoTable two = new TwoTable();
		two.start();
		System.out.println("Main 1");
		two.join();
		System.out.println("Main 2");
		
		Thread five = new Thread(new FiveTable());
		five.start();
		
	}
}
