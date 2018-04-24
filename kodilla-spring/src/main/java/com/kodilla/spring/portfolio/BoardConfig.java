package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("ToDoList")
    private TaskList toDoList;

    @Autowired
    @Qualifier("InProgress")
    private TaskList inProgress;

    @Autowired
    @Qualifier("DoneTasks")
    private TaskList doneTasks;

    @Bean(name = "ToDoList")
    @Scope("prototype")
    public TaskList addToDoTask() {
        return new TaskList();
    }

    @Bean(name = "InProgress")
    @Scope("prototype")
    public TaskList addToInProgress(){
        return new TaskList();
    }

    @Bean(name = "DoneTasks")
    @Scope("prototype")
    public TaskList addToDoneTasks(){
        return new TaskList();
    }

    @Bean
    public Board getBoard(){
        return new Board(toDoList, inProgress, doneTasks);
    }
}
