package com.celcom.day7;

class MyThread1 implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Running...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadExample3 {
    public static void main(String[] args) throws InterruptedException {
        // Creating the first thread and assigning the runnable
        Thread t1 = new Thread(new MyThread1());
        System.out.println(t1.getState()); // NEW
        
        t1.setName("T1");
        System.out.println(t1.getName());  // Output the thread name
        System.out.println(t1.getPriority());  // Default priority is 5

        t1.start(); // Starting the thread

        // Wait a bit before printing state again to observe its change
        Thread.sleep(100);  
        System.out.println(t1.getState()); // Should print RUNNABLE if thread is running

        // Creating the second thread and assigning the runnable
        Thread t2 = new Thread(new MyThread1());
        System.out.println(t2.getState()); // NEW
        t2.setName("T2");
        t2.start(); // Starting the second thread

        // Wait for threads to finish their execution
        t1.join();
        t2.join();

        System.out.println("Main Thread End");
    }
}
