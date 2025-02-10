package com.celcom.day5;
import java.util.ArrayList;

class Account {
    String name;
    int accountNum;
    int mobile;
    double balance;
    
    Account(String name, int accountNum, int mobile) {
        this.name = name;
        this.accountNum = accountNum;
        this.mobile = mobile;
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

class Bank {
    ArrayList<Account> accounts = new ArrayList<>();

    void addAccount(String name, int accountNum, int mobile) {
        Account newAccount = new Account(name, accountNum, mobile);
        accounts.add(newAccount);
        System.out.println("Added new account:");
        newAccount.write();
    }

    void removeAccount(int accountNum) {
        for (Account acc : accounts) {
            if (acc.accountNum == accountNum) {
                accounts.remove(acc);
                System.out.println("The Account removed:");
                acc.write();
                return;
            }
        }
        System.out.println("Account not found with Account number " + accountNum);
    }

    void deposit(int accountNum, double amount) {
        for (Account acc : accounts) {
            if (acc.accountNum == accountNum) {
                acc.deposit(amount);
                return;
            }
        }
        System.out.println("Account not found with Account number " + accountNum);
    }

    void withdraw(int accountNum, double amount) {
        for (Account acc : accounts) {
            if (acc.accountNum == accountNum) {
                acc.withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found with Account number " + accountNum);
    }

    void display() {
        System.out.println("Collections of accounts:");
        for (Account acc : accounts) {
            acc.write();
        }
    }

    void display(int accountNum) {
        for (Account acc : accounts) {
            if (acc.accountNum == accountNum) {
                acc.write();
                return;
            }
        }
        System.out.println("Account not found with Account number " + accountNum);
    }
}

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addAccount("Rohith", 101, 987654321);
        bank.addAccount("Kumar", 102, 912345678);
        bank.addAccount("Rajesh", 103, 912345678);

        // Display all accounts
        bank.display();

        bank.removeAccount(101);

        bank.deposit(102, 500.0);
        bank.deposit(101, 2000.0);
        bank.deposit(102, 500.0);

        // Display details of a specific account
        bank.display(101); 

        bank.withdraw(101, 500.0);
        bank.withdraw(102, 5000.0);

        bank.display();
    }
}
