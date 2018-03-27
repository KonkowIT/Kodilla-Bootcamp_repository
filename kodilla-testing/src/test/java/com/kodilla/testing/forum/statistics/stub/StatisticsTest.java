package com.kodilla.testing.forum.statistics.stub;

import com.kodilla.testing.forum.statistics.CalculatedStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StatisticsTest {

    //klasa w której będą testy

    @Test
    public void testAvgPostPerUser() {
        //given
        Statistics statistics = new StatisticsStub();
        CalculatedStatistics calculatedStatistics = new CalculatedStatistics();
        //when
        double result = calculatedStatistics.getAvgPostPerUser(10);
        //then
        Assert.assertEquals(10.0, result, 1.0);
    }
}