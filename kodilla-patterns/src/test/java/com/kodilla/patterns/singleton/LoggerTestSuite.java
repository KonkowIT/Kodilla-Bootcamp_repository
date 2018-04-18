package com.kodilla.patterns.singleton;

import org.junit.*;

public class LoggerTestSuite {
    @Before
    public void openLog(){
        System.out.println("Opening log file");
    }

    @After
    public void closeLog(){
        System.out.println("Closing log file");
    }

    @Test
    public void testGetLastLog(){
        //given
        Logger.getInstance().log("log1");
        Logger.getInstance().log("log2");
        Logger.getInstance().log("log3");
        //when
        String result = Logger.getInstance().getLastlog();
        //then
        Assert.assertEquals("log3", result);
    }

    @Test
    public void testGetLastLog2(){
        //given
        Logger.getInstance().log("log1");
        Logger.getInstance().log("log2");
        Logger.getInstance().log("log3");
        Logger.getInstance().log("log4");
        Logger.getInstance().log("log5");
        //when
        String result = Logger.getInstance().getLastlog();
        //then
        Assert.assertEquals("log5", result);
    }
}
