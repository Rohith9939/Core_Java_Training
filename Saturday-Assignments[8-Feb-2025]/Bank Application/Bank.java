package com.celcom.Assignment1;

import java.util.ArrayList;

class Bank {
    ArrayList<Account> accounts = new ArrayList<>();

    void addAccount(String name, int accountNum, long mobile) {
        for (Account acc : accounts) {
            if (acc.accountNum == accountNum) {
                System.out.println("Account number " + accountNum + " already exists! Cannot create a new account with this number.");
                return;
            }
        }

        Account newAccount = new Account(name, accountNum, mobile);
        accounts.add(newAccount);
        System.out.println("Added new account:");
        newAccount.write();
    }

    void removeAccount(int accountNum) {
        boolean found = false;
        for (Account acc : accounts) {
            if (acc.accountNum == accountNum) {
                accounts.remove(acc);
                System.out.println("The Account removed:");
                acc.write();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Account not found with Account number " + accountNum);
        }
    }

    void deposit(int accountNum, double amount) {
        boolean found = false;
        for (Account acc : accounts) {
            if (acc.accountNum == accountNum) {
                acc.deposit(amount);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Invalid Account Number: " + accountNum);
        }
    }

    void withdraw(int accountNum, double amount) {
        boolean found = false;
        for (Account acc : accounts) {
            if (acc.accountNum == accountNum) {
                acc.withdraw(amount);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Invalid Account Number: " + accountNum);
        }
    }

    void display() {
        System.out.println("Collections of accounts:");
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
        } else {
            for (Account acc : accounts) {
                acc.write();
            }
        }
    }

    void display(int accountNum) {
        boolean found = false;
        for (Account acc : accounts) {
            if (acc.accountNum == accountNum) {
                acc.write();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Account not found with Account number " + accountNum);
        }
    }
}