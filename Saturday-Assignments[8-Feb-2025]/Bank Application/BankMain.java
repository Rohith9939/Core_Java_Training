package com.celcom.Assignment1;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        
        boolean value = true;
        
        while (value) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add Account");
            System.out.println("2. Remove Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Display Specific Account");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    // Add Account
                    System.out.print("Enter Name: ");
                    scanner.nextLine(); 
                    String name = scanner.nextLine();
                    System.out.print("Enter Account Number: ");
                    int accountNum = scanner.nextInt();
                    System.out.print("Enter Mobile Number: ");
                    long mobile = scanner.nextLong();
                    bank.addAccount(name, accountNum, mobile);
                    break;
                
                case 2:
                    // Remove Account
                    System.out.print("Enter Account Number to remove: ");
                    accountNum = scanner.nextInt();
                    bank.removeAccount(accountNum);
                    break;
                
                case 3:
                    // Deposit
                    System.out.print("Enter Account Number for Deposit: ");
                    accountNum = scanner.nextInt();
                    System.out.print("Enter Amount to Deposit: ");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(accountNum, depositAmount);
                    break;
                
                case 4:
                    // Withdraw
                    System.out.print("Enter Account Number for Withdrawal: ");
                    accountNum = scanner.nextInt();
                    System.out.print("Enter Amount to Withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    bank.withdraw(accountNum, withdrawAmount);
                    break;
                
                case 5:
                    // Display All Accounts
                    bank.display();
                    break;
                
                case 6:
                    // Display Specific Account
                    System.out.print("Enter Account Number to display: ");
                    accountNum = scanner.nextInt();
                    bank.display(accountNum);
                    break;
                
                case 7:
                    // Exit
                    value = false;
                    System.out.println("Exiting the Application.");
                    break;
                
                default:
                    System.out.println("Invalid choice, please try again with given options.");
                    break; 
            }
        }
        
        scanner.close();
    }
}
