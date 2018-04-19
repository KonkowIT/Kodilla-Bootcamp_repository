package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.prototype.TasksList;

public class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask() {
        return "Painting " + whatToPaint + " on color " + color;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (color.equals("black")) {
            return false;
        } else {
            return true;
        }
    }
}
