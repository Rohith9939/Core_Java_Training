package com.celcom.day7;

public class LambdaExpressionWithThread {
	public static void main(String[] args) {
		
		//anonymous class
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				for(int i=1;i<=5;i++) {
					System.out.println("Thrad t1 is running");
				}
				
				try {
					Thread.sleep(2000);
				} catch(InterruptedException e) {
					
				}
				
			}
			
		};
		
		Thread t1 = new Thread(runnable);
		t1.start();
		
		//using lambda expression
		
		Runnable runnable1 = () -> {
			for(int i=1; i<=5; i++) {
				System.out.println("Thread t2 is running..");
				try {
					Thread.sleep(2000);
				}catch(InterruptedException e) {
					
				}
			}
		};
		
		Thread t2 = new Thread(runnable1);
		t2.start();
	}
}
