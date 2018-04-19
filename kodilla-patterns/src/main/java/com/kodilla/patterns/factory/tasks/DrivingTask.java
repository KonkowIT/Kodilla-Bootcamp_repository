package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    final String taskName;
    final String where;
    final String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        return "Driving to " + where;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (using.equals("yes")) {
            return true;
        } else {
            return false;
        }
    }
}
