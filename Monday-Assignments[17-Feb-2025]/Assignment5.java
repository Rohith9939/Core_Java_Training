package com.celcom.day10;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class Assignment5 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        System.out.println("Eneter elements: ");
        for(int i=0;i<n;i++) {
        	numbers.add(sc.nextInt());
        }
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = 0; j < numbers.size() - i - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }
 
        System.out.println("Sorted ArrayList: " + numbers);
    }
}
 