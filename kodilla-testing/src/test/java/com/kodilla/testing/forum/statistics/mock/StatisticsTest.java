package com.kodilla.testing.forum.statistics.mock;

import com.kodilla.testing.forum.statistics.CalculatedStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.stub.StatisticsStub;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTest {

    //klasa w której będą testy

    @Test
    public void testAvgPostPerUser() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        CalculatedStatistics calculatedStatisticsMock = mock(CalculatedStatistics.class);

        int postCount = 10;
        when(statisticsMock.postCount()).thenReturn(postCount);

        List<String> stubUserNames = new ArrayList<String>();
        //dummy data
        for(int n = 0; n < 100; n++){
            stubUserNames.add("Adam");
        }
        when(statisticsMock.usersNames()).thenReturn(stubUserNames);

        //when
        int result = calculatedStatisticsMock.getAvgPostPerUser(1000);

        //then
        Assert.assertEquals(10, result, 1);
    }

    @Test
    public void testAvgCommentPerUser() {
        //given
       Statistics statisticsMock = mock(Statistics.class);
       CalculatedStatistics calculatedStatisticsMock = mock(CalculatedStatistics.class);

        int commentsCount = 10;
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        List<String> stubUserNames = new ArrayList<String>();
        //dummy data
        for(int n = 0; n < 100; n++){
            stubUserNames.add("Adam");
        }
        when(statisticsMock.usersNames()).thenReturn(stubUserNames);

        //when
        int result = calculatedStatisticsMock.getAvgCommentPerUser(10);

        //then
        Assert.assertEquals(0.1, result, 0.1);
    }

    @Test
    public void testCommentsPerPost() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        CalculatedStatistics calculatedStatisticsMock = mock(CalculatedStatistics.class);

        int commentsCount = 10;
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        int postCount = 1000;
        when(statisticsMock.postCount()).thenReturn(postCount);

        //when
        int result = calculatedStatisticsMock.getAvgCommentPerPost(1000, 10);

        //then
        Assert.assertEquals(0.01, result, 0.1);
    }

}
