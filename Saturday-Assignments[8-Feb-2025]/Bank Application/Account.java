package com.celcom.Assignment1;

class Account {
    String name;
    int accountNum;
    long mobile;
    double balance;
    
    Account(String name, int accountNum, long mobile) {
        this.name = name;
        this.accountNum = accountNum;
        this.mobile = mobile;
        this.balance = 0.0;  
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " New Balance: " + balance);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " Current Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void write() {
        System.out.println("Name: " + name);
        System.out.println("Account No.: " + accountNum);
        System.out.println("Mobile: " + mobile);
        System.out.println("Balance: " + balance);
        System.out.println("--------------------------- \n");
    }
}
