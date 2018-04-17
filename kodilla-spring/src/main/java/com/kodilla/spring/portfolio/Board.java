package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Service;

@Service
public class Board {
    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}
