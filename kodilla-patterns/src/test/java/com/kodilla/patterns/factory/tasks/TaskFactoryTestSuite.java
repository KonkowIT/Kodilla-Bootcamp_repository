package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShopping(){
        //given
        TaskFactory taskFactory = new TaskFactory();
        //when
        Task shoppingTask = taskFactory.createTask(TaskFactory.SHOPPING);
        //then
        Assert.assertEquals("Buying 2.0 pieces of panties", shoppingTask.executeTask());
        Assert.assertEquals("Buying underwear", shoppingTask.getTaskName());
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
    }

    @Test
    public void testPainting(){
        //given
        TaskFactory taskFactory = new TaskFactory();
        //when
        Task paintingTask = taskFactory.createTask(TaskFactory.PAINTING);
        //then
        Assert.assertEquals("Painting wall on color yellow", paintingTask.executeTask());
        Assert.assertEquals("Painting the wall", paintingTask.getTaskName());
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
    }

    @Test
    public void testDriving(){
        //given
        TaskFactory taskFactory = new TaskFactory();
        //when
        Task drivingTask = taskFactory.createTask(TaskFactory.DRIVING);
        //then
        Assert.assertEquals("Driving to home", drivingTask.executeTask());
        Assert.assertEquals("Driving home", drivingTask.getTaskName());
        Assert.assertEquals(true, drivingTask.isTaskExecuted());
    }
}
