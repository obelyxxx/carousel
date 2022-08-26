package com.epam.rd.autotasks;

public class CompleteByRequestTask implements Task {
    boolean finished = false;
    boolean completed;

    @Override
    public void execute() {
        if (completed) {
            finished = true;
        }
    }

    @Override
    public boolean isFinished() {
        return finished;
    }

    public void complete() {
        this.completed = true;
    }
}