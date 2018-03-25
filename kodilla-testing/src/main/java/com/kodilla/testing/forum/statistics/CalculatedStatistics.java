package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalculatedStatistics {

    //klasa testowana

    int avgPostPerUser;
    int avgCommentPerUser;
    int avgCommentPerPost;

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
        int resultOfUserNamesNumber = statistics.usersNames().size();
        int resultOfPostCount = statistics.postCount();
        int resultOfCommentCount = statistics.commentsCount();
        int resulOfGetAvgPostPerUser = getAvgPostPerUser(10);
        int resultOfGetAvgCommentPerUser = getAvgCommentPerUser(10);
        int resultOfGetAvgCommentPerPost = getAvgCommentPerPost(10,2);
    }
}