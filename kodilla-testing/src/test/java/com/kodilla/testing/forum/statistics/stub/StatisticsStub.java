package com.kodilla.testing.forum.statistics.stub;

import com.kodilla.testing.forum.statistics.Statistics;

import java.util.ArrayList;
import java.util.List;

public class StatisticsStub implements Statistics {
    @Override
    public List<String> usersNames() {
        List<String> stubUserNames = new ArrayList<String>();
        //dummy data
        for(int n = 0; n < 100; n++){
           stubUserNames.add("Adam");
        }
        return stubUserNames;
    }

    @Override
    public int postCount() {
        return 1000;
    }

    @Override
    public int commentsCount() {
        return 10;
    }
}