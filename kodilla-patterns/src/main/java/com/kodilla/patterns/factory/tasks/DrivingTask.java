package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    private final String taskName;
    private final String where;
    private boolean isExecuted;

    public DrivingTask(String taskName, String where, Boolean using) {
        this.taskName = taskName;
        this.where = where;

    }

    @Override
    public String executeTask() {
        isExecuted = true;
        return "Driving to " + where;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
