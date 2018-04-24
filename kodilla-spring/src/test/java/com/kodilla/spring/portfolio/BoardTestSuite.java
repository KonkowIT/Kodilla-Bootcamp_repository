package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext();
        Board board = context.getBean(Board.class);
        board.getDoneList().addToTaskList("task1");
        board.getInProgressList().addToTaskList("task2");
        board.getToDoList().addToTaskList("task3");
        //when
        List<String> doneTasks = board.getDoneList().getTasks();
        List<String> toDoTasks = board.getToDoList().getTasks();
        List<String> inProgressTasks = board.getInProgressList().getTasks();
        //then
        Assert.assertEquals("task1", doneTasks.get(0));
        Assert.assertEquals("task2", inProgressTasks.get(0));
        Assert.assertEquals("task3", toDoTasks.get(0));
    }
}
