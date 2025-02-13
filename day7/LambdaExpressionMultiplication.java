package com.celcom.day7;

public class LambdaExpressionMultiplication {
    public static void main(String[] args) {
        // Anonymous class
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("2 * " + i + " = " + (2 * i));

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        
        // Start the thread using the anonymous class
        new Thread(runnable).start();

        // Using lambda expression
        Runnable runnable1 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("5 * " + i + " = " + (5 * i));

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        
        // Start the thread using the lambda expression
        Thread t2 = new Thread(runnable1);
        t2.start();
    }   
}
