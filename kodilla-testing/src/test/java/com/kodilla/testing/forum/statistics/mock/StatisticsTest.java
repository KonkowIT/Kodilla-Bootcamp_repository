package com.kodilla.testing.forum.statistics.mock;

import com.kodilla.testing.forum.statistics.CalculatedStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTest {

    /**
     * liczba postów 0
     * liczba komentarzy 0
     * liczba użytkowników 0
     */


    @Test
    public void testAvgPostPerUser_0_0_0() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        CalculatedStatistics calculatedStatistics = new CalculatedStatistics(statisticsMock);

        int postCount = 0;
        when(statisticsMock.postCount()).thenReturn(postCount);

        List<String> stubUserNames = new ArrayList<String>();
        //dummy data
        when(statisticsMock.usersNames()).thenReturn(stubUserNames);

        //when
        calculatedStatistics.calculatedAdvStatistics();
        double result = calculatedStatistics.getAvgPostPerUser();

        //then
        Assert.assertEquals(0, result, 0.01);
    }

    @Test
    public void testAvgCommentPerUser_0_0_0() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        CalculatedStatistics calculatedStatistics = new CalculatedStatistics(statisticsMock);

        int commentsCount = 0;
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        List<String> stubUserNames = new ArrayList<String>();
        //dummy data
        when(statisticsMock.usersNames()).thenReturn(stubUserNames);

        //when
        calculatedStatistics.calculatedAdvStatistics();
        double result = calculatedStatistics.getAvgCommentPerUser();

        //then
        Assert.assertEquals(0, result, 0.01);
    }

    @Test
    public void testCommentsPerPost_0_0_0() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        CalculatedStatistics calculatedStatistics = new CalculatedStatistics(statisticsMock);

        int commentsCount = 0;
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        int postCount = 0;
        when(statisticsMock.postCount()).thenReturn(postCount);

        //when
        calculatedStatistics.calculatedAdvStatistics();
        double result = calculatedStatistics.getAvgCommentPerPost();

        //then
        Assert.assertEquals(0, result, 0.1);
    }

    /**
     * liczba postów 1000
     * liczba komentarzy 0
     * liczba użytkowników 100
     */

    @Test
    public void testAvgPostPerUser_1000_0_100() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        CalculatedStatistics calculatedStatistics = new CalculatedStatistics(statisticsMock);

        int postCount = 1000;
        when(statisticsMock.postCount()).thenReturn(postCount);

        List<String> stubUserNames = new ArrayList<String>();
        //dummy data
        for(int n = 0; n < 100; n++){
            stubUserNames.add("Adam");
        }
        when(statisticsMock.usersNames()).thenReturn(stubUserNames);

        //when
        calculatedStatistics.calculatedAdvStatistics();
        double result = calculatedStatistics.getAvgPostPerUser();

        //then
        Assert.assertEquals(10, result, 0.01);
    }

    @Test
    public void testAvgCommentPerUser_1000_0_100() {
        //given
       Statistics statisticsMock = mock(Statistics.class);
       CalculatedStatistics calculatedStatistics = new CalculatedStatistics(statisticsMock);

        int commentsCount = 0;
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        List<String> stubUserNames = new ArrayList<String>();
        //dummy data
        for(int n = 0; n < 100; n++){
            stubUserNames.add("Adam");
        }
        when(statisticsMock.usersNames()).thenReturn(stubUserNames);

        //when
        calculatedStatistics.calculatedAdvStatistics();
        double result = calculatedStatistics.getAvgCommentPerUser();

        //then
        Assert.assertEquals(0, result, 0.01);
    }

    @Test
    public void testCommentsPerPost_1000_0_100() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        CalculatedStatistics calculatedStatistics = new CalculatedStatistics(statisticsMock);

        int commentsCount = 0;
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        int postCount = 1000;
        when(statisticsMock.postCount()).thenReturn(postCount);

        //when
        calculatedStatistics.calculatedAdvStatistics();
        double result = calculatedStatistics.getAvgCommentPerPost();

        //then
        Assert.assertEquals(0, result, 0.001);
    }

    /**
     * liczba postów 1000
     * liczba komentarzy 3000
     * liczba użytkowników 100
     */

    @Test
    public void testAvgPostPerUser_1000_3000_100() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        CalculatedStatistics calculatedStatistics = new CalculatedStatistics(statisticsMock);

        int postCount = 1000;
        when(statisticsMock.postCount()).thenReturn(postCount);

        List<String> stubUserNames = new ArrayList<String>();
        //dummy data
        for(int n = 0; n < 100; n++){
            stubUserNames.add("Adam");
        }
        when(statisticsMock.usersNames()).thenReturn(stubUserNames);

        //when
        calculatedStatistics.calculatedAdvStatistics();
        double result = calculatedStatistics.getAvgPostPerUser();

        //then
        Assert.assertEquals(10, result, 0.001);
    }

    @Test
    public void testAvgCommentPerUser_1000_3000_100() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        CalculatedStatistics calculatedStatistics = new CalculatedStatistics(statisticsMock);

        int commentsCount = 3000;
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        List<String> stubUserNames = new ArrayList<String>();
        //dummy data
        for(int n = 0; n < 100; n++){
            stubUserNames.add("Adam");
        }
        when(statisticsMock.usersNames()).thenReturn(stubUserNames);

        //when
        calculatedStatistics.calculatedAdvStatistics();
        double result = calculatedStatistics.getAvgCommentPerUser();

        //then
        Assert.assertEquals(30, result, 0.1);
    }

    @Test
    public void testCommentsPerPost_1000_3000_100() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        CalculatedStatistics calculatedStatistics = new CalculatedStatistics(statisticsMock);

        int commentsCount = 3000;
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        int postCount = 1000;
        when(statisticsMock.postCount()).thenReturn(postCount);

        //when
        calculatedStatistics.calculatedAdvStatistics();
        double result = calculatedStatistics.getAvgCommentPerPost();

        //then
        Assert.assertEquals(3, result, 0.1);
    }
}
