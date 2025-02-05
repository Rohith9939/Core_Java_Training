package com.celcom.day1;

import java.util.Scanner;
public class Calculator {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	    int choice;	
		do
		{
			System.out.println("Enter number1 : ");
			int num1 = sc.nextInt();
			System.out.println("Enter number2 : ");
			int num2 = sc.nextInt();
			
			System.out.println("Choose an option:\n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n 5. Quit \n");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Addition is:" + (num1 + num2));
				break;
			case 2:
				System.out.println("Subtraction is:" + (num1 - num2));
				break;
			case 3:
				System.out.println("Multiplication is:" + (num1 * num2));
				break;
			case 4:
				System.out.println("Division is:" + (num1 / num2));
				break;
			case 5: 
				break;
			default:
				System.out.println("Please enter correct input ");
				break;
			}
		
			System.out.println("Do you wish to continue : yes/no");
			String ch = sc.next();
			if(ch.equalsIgnoreCase("no"))
				break;
			
		}while(choice !=5);
		
		sc.close();
	}
}
