package com.kodilla.testing.forum.statistics;

import java.util.HashMap;
import java.util.Map;

public class CalculatedStatistics {

    //klasa testowana

    Statistics statistics;

    public int avgPostPerUser(){
        int avgPost;
        avgPost = statistics.postCount() / statistics.usersNames().size();
        return avgPost;
    }

    public int avgCommentPerUser() {
        int avgComment;
        avgComment = statistics.postCount() / statistics.usersNames().size();
        return avgComment;
    }

    public int avgCommentPerPost() {
        int avgCommPerPost;
        avgCommPerPost = statistics.commentsCount() / statistics.usersNames().size();
        return avgCommPerPost;
    }

    Map<Integer, Integer> listOfUserNames = new HashMap<Integer,Integer>();
    Map<Integer, Integer> listOfPosts = new HashMap<Integer,Integer>();
    Map<Integer, Integer> listOfComments = new HashMap<Integer,Integer>();
    Map<Integer, Integer> listOfAvgPostPerUser = new HashMap<Integer,Integer>();
    Map<Integer, Integer> listOfAvgCommentPerUser = new HashMap<Integer,Integer>();
    Map<Integer, Integer> listOfAvgCommetnPerPost = new HashMap<Integer,Integer>();
    int n = 0;

    public void calculatedAdvStatistics() {
        listOfUserNames.put(n++, statistics.usersNames().size());
        listOfPosts.put(n++, statistics.postCount());
        listOfComments.put(n++, statistics.commentsCount());
        listOfAvgPostPerUser.put(n++, avgPostPerUser());
        listOfAvgCommentPerUser.put(n++, avgCommentPerUser());
        listOfAvgCommetnPerPost.put(n++, avgCommentPerPost());
    }
}