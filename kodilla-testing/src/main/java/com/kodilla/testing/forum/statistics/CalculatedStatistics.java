package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalculatedStatistics {

    //klasa testowana

    private int avgPostPerUser;
    private int avgCommentPerUser;
    private int avgCommentPerPost;
    private int resultOfUserNamesNumber;
    private int resultOfPostCount;
    private int resultOfCommentCount;
    private int resulOfGetAvgPostPerUser;
    private int resultOfGetAvgCommentPerUser;
    private int resultOfGetAvgCommentPerPost;

    Statistics statistics;

    public int getAvgPostPerUser(int postCount){
        avgPostPerUser = postCount / statistics.usersNames().size();
        return avgPostPerUser;
    }

    public int getAvgCommentPerUser(int commentsCount){

        avgCommentPerUser = commentsCount / statistics.usersNames().size();
        return avgCommentPerUser;
    }

    public int getAvgCommentPerPost(int postCount, int commentsCount) {
        avgCommentPerPost = commentsCount / postCount;
        return avgCommentPerPost;
    }

    public void calculatedAdvStatistics() {
        resultOfUserNamesNumber = statistics.usersNames().size();
        resultOfPostCount = statistics.postCount();
        resultOfCommentCount = statistics.commentsCount();
        resulOfGetAvgPostPerUser = getAvgPostPerUser(10);
        resultOfGetAvgCommentPerUser = getAvgCommentPerUser(10);
        resultOfGetAvgCommentPerPost = getAvgCommentPerPost(10,2);
    }
}