package com.kodilla.hibernate.tasklist;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private final static String LISTNAME = "Anna";
    private final static String DESCRIPTION = "Kolezanka z klasy";

    @Test
    public void testFindByListName(){
        //given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);

        //when
        taskListDao.save(taskList);

        //then
        int id = taskList.getId();
        String listName = taskList.getListName();
        List<TaskList> readTaskList = taskListDao.findByListName(listName);
        org.junit.Assert.assertEquals(listName, readTaskList.get(0).getListName());

        //cleanUp
        taskListDao.deleteById(id);
    }
}