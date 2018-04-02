package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalculatedStatistics {

    //klasa testowana

    private double avgPostPerUser;
    private double avgCommentPerUser;
    private double avgCommentPerPost;

    Statistics statistics;

    public CalculatedStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public double getAvgPostPerUser(){
        return avgPostPerUser;
    }

    public double getAvgCommentPerUser(){
        return avgCommentPerUser;
    }

    public double  getAvgCommentPerPost() {
        return avgCommentPerPost;
    }

    public void calculatedAdvStatistics() {
        if (statistics.usersNames().isEmpty()) {
            avgPostPerUser = 0;
            avgCommentPerUser = 0;
        } else {
            avgPostPerUser = statistics.postCount() / (double)statistics.usersNames().size();
            avgCommentPerUser = statistics.commentsCount() / (double)statistics.usersNames().size();
        }

        if (statistics.postCount() == 0){
            avgCommentPerPost = 0;
        } else {
            avgCommentPerPost = statistics.commentsCount() / (double)statistics.postCount();
        }
    }
}