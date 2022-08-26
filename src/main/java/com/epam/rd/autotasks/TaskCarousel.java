package com.epam.rd.autotasks;


import java.util.ArrayList;
import java.util.List;

public class TaskCarousel {
    private final int capacity;
    private final List<Task> task = new ArrayList<>();
    private int pointer;

    public TaskCarousel(int capacity) {

        //throw new UnsupportedOperationException();
        this.capacity = capacity;
        this.pointer = 0;
    }

    public boolean addTask(Task task) {

        //throw new UnsupportedOperationException();

        if (task == null ||  task.isFinished() || this.isFull()) {
            return false;
        } else {
            this.task.add(task);
            return true;
        }
    }

    public boolean execute() {

        //throw new UnsupportedOperationException();

        if (this.pointer >= this.capacity || this.pointer >= this.task.size()) {
            this.pointer = 0;
        }
        if (!this.task.isEmpty()) {
            Task tk = this.task.get(this.pointer);
            tk.execute();
            if (tk.isFinished()) {
                this.task.remove(this.pointer);
            } else {
                this.pointer++;
            }
            return true;
        }
        return false;
    }

    public boolean isFull() {

        //throw new UnsupportedOperationException();
        return this.task.size() == this.capacity;
    }

    public boolean isEmpty() {

        //throw new UnsupportedOperationException();
        return this.task.size() == 0;
    }

}