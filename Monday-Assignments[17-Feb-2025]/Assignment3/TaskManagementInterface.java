package com.celcom.day10.Assignment3;

import java.util.Scanner;

public class TaskManagementInterface {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        TaskFunctions fun = new TaskFunctions();
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.println("Choose below options:\n1.To add Task.\n2.To view tasks.\n3.To Search a task.\n4.To delete.\n5.To mark as completed.");
        int option = sc.nextInt();
        sc.nextLine();  
        do {
            switch (option) {
                case 1:
                    System.out.println("To add task, Enter a task name: ");
                    str = sc.nextLine();
                    fun.addTask(taskList, str);
                    break;

                case 2:
                    fun.viewTasks(taskList);
                    break;

                case 3:
                    System.out.println("To search task, Enter a task name: ");
                    str = sc.nextLine();
                    fun.searchTask(taskList, str);
                    break;

                case 4:
                    System.out.println("To delete task, Enter a task name: ");
                    str = sc.nextLine();
                    fun.deleteTask(taskList, str);
                    break;

                case 5:
                    System.out.println("To mark task as completed, Enter a task name: ");
                    str = sc.nextLine();
                    fun.markAsCompleted(taskList, str);
                    break;
            }

            System.out.println("\nChoose below options:\n0.To exit.\n1.To add Task\n2.To view tasks.\n3.To Search a task.\n4.To delete.\n5.To mark as completed.");
            option = sc.nextInt();
        } while (option != 0);
    }
}
