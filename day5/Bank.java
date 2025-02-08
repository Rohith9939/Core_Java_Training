package com.celcom.day5;

import java.util.ArrayList;

class Account {
	String name;
    int accountNum;
    long mobile;
    String accountType;
    double balance;

    public Account(String name, int accountNum, int mobile, String accountType) {
        this.name = name;
        this.accountNum = accountNum;
        this.mobile = mobile;
        this.accountType = accountType;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + " New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNum);
        System.out.println("Name: " + name);
        System.out.println("Mobile: " + mobile);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}


class Bank{
	ArrayList<Account> accounts = new ArrayList<>();
    
    void addAccount(String name, int accountNum, int mobile, String accountType) {
        Account newAccount = new Account(name, accountNum, mobile, accountType);
        accounts.add(newAccount);
        System.out.println("Account added successfully.");
    }
    void removeAccount(int accountNum) {
        for (Account account : accounts) {
            if (account.getAccountNum() == accountNum) {
                accounts.remove(account);
                System.out.println("Account removed successfully.");
                return;
            }
        }
        System.out.println("Account not found.");
    }

    void deposit(int accountNum, double amount) {
        for (Account account : accounts) {
            if (account.getAccountNum() == accountNum) {
                account.deposit(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    void withdraw(int accountNum, double amount) {
        for (Account account : accounts) {
            if (account.getAccountNum() == accountNum) {
                account.withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    void displayAccounts() {
        for (Account account : accounts) {
            account.displayAccountDetails();
        }
    }
}



class BankMain{
	public static void main(String[] args) {
		Bank bank = new Bank();

        bank.addAccount("Rohith", 101, 987654321, "Saving");
        bank.addAccount("Kumar", 102, 123456789, "Current");

        System.out.println("All Accounts:");
        bank.displayAccounts();

        bank.deposit(1001, 500.0);
        bank.deposit(1002, 1000.0);

        bank.withdraw(1001, 200.0);
        bank.withdraw(1002, 500.0);

        bank.removeAccount(1001);

        System.out.println("Remaining Accounts:");
        bank.displayAccounts();
    }
}