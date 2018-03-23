package com.kodilla.testing.forum.statistics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Comments implements Statistics{

    int n;

    Map<Integer, String> commentList = new HashMap<Integer, String>();

    public void createCommentList(){

    }

    @Override
    public List<String> usersNames() {
        return null;
    }

    @Override
    public List<String> userNames() {
        return null;
    }

    @Override
    public int postsCount() {
        return 0;
    }

    @Override
    public int commentCount() {
        return 0;
    }
}
