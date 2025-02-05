package com.celcom.day1;
import java.util.Scanner;
public class UserInputExample{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter employee id, name and salary");
      int eid = sc.nextInt();
      String ename = sc.next();
      double esalry = sc.nextDouble();
  
      System.out.println("Employee id : " + eid);
      System.out.println("Employee Name : " + ename); 
      System.out.println("Employee salary : " + esalry);
      
      sc.close();
   }
}    