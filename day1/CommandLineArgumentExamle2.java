package com.celcom.day1;
public class CommandLineArgumentExamle2 {
  public static void main(String args[]) {
     System.out.println("Total No of Arguments : " + args.length);
     if(args.length == 2){
         int num1 = Integer.parseInt(args[0]);
         int num2 = Integer.parseInt(args[1]);
         int sum = num1 + num2;
         System.out.println("Addition : " + sum);
     } else {
         System.out.println("Excepting 2 numbers as command line input");
      }
     
  }
}     