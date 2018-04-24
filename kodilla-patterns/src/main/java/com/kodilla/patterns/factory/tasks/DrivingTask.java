package com.kodilla.patterns.factory.tasks;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class DrivingTask implements Task{
    final String taskName;
    final String where;
    private Boolean using;

    public DrivingTask(String taskName, String where, Boolean using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;

    }

    @Override
    public String executeTask() {
        using = true;
        return "Driving to " + where;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        executeTask();
        return using;
    }
}
