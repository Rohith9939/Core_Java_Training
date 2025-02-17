package com.celcom.day10.Assignment3;
import java.time.LocalDateTime;
public class TaskFunctions {
    void addTask(TaskList tasklist, String name){
    	LocalDateTime time = LocalDateTime.now();
        Task newTask = new Task(name, false, time );
        tasklist.store.add(newTask);
    }

    void viewTasks(TaskList taskList) {
    	if(taskList.store.size()== 0)
    		System.out.println("No task available.");
        for (Task tasks : taskList.store) {
            System.out.println(tasks.getName() + " " + tasks.isCompleted() + " " + tasks.getUpdatedDate());
        }
    }

    void searchTask(TaskList taskList, String name) {
        for (Task tasks : taskList.store) {
            if (tasks.getName().equals(name)) {
                System.out.println(tasks.getName() + " " + tasks.isCompleted() + " " + tasks.getUpdatedDate());
                return;
            }
        }
        System.out.println("Task not available");
    }

    void deleteTask(TaskList taskList, String name) {
        for (Task task : taskList.store) {
            if (task.getName().equals(name)) {
                taskList.store.remove(task);
                System.out.println(name + " Successfully deleted.");
                return;
            }
        }
        System.out.println(name + " - Task not found.");
    }

    void markAsCompleted(TaskList taskList, String name) {
        for (Task tasks : taskList.store) {
            if (tasks.getName().equals(name)) {
                tasks.setCompleted(true);
                System.out.println(name + " Successfully marked as completed.");
                return;
            }
        }
        System.out.println(name + " - Task not found.");
    }
}