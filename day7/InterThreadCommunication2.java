package com.celcom.day7;

import java.util.Scanner;

class SavingAccount {
    private double balance;
    
    public void deposit(double amount) {
        this.balance += amount;
    }
    
    public void withdraw(double amount) {
        this.balance -= amount;
    } 
    
    public double getBalance() {
        return balance;
    }
}

class Depositer extends Thread {
    SavingAccount savingAccount;
    Scanner scanner;
    
    Depositer(SavingAccount savingAccount, Scanner scanner){
        this.savingAccount = savingAccount;
        this.scanner = scanner;
    }
    
    public void run() {
        synchronized(savingAccount) {
            System.out.println("Depositer started to deposit money..");
            System.out.print("Enter amount to deposit : ");
            double amount = scanner.nextDouble();
            savingAccount.deposit(amount);
            System.out.println(amount + " deposited successfully.");
            System.out.println("Balance : " + savingAccount.getBalance());
            savingAccount.notify();
        }
    }
}

class Withdraw extends Thread {
    SavingAccount savingAccount;
    Scanner scanner;
    
    Withdraw(SavingAccount savingAccount, Scanner scanner){
        this.savingAccount = savingAccount;
        this.scanner = scanner;
    }
    
    public void run() {
        synchronized(savingAccount) {
            System.out.println("Withdrawer is waiting for Depositer to deposit the money...");
            
            try {
                savingAccount.wait();
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            
            System.out.print("Enter amount to withdraw : ");
            double amount = scanner.nextDouble();
            savingAccount.withdraw(amount);
            System.out.println(amount + " withdrawn successfully.");
            System.out.println("Balance : " + savingAccount.getBalance());
        }
    }
}

public class InterThreadCommunication2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);  // Single scanner instance
        
        SavingAccount savingAccount = new SavingAccount();
        
        Withdraw withdraw = new Withdraw(savingAccount, scanner);
        withdraw.start();
        
        Thread.sleep(2000);  // This sleep is still here but consider removing it when you implement a better sync mechanism.
        
        Depositer deposit = new Depositer(savingAccount, scanner);
        deposit.start();
    }
}
