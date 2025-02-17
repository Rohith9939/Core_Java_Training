package com.celcom.day10.Assignment3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

class Task{
    private String name;
    private boolean completed;
    private LocalDateTime updatedDate;

    public Task(String name, boolean completed, LocalDateTime updatedDate) {
        this.name = name;
        this.completed = completed;
        this.updatedDate = updatedDate;
    }

    public String getName() {
        return name;
    }

   
    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getUpdatedDate() {
    	DateTimeFormatter localTime = DateTimeFormatter.ofPattern("HH:mm - dd/MM/yyyy");
        return this.updatedDate.format(localTime);
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }
}

public class TaskList{
    List<Task> store;

    public TaskList() {
        store = new LinkedList<>();
    }
}