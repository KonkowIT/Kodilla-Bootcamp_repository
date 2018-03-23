package com.kodilla.testing.forum.statistics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Posts implements Statistics{

    Map<Integer, String> postList = new HashMap<Integer, String>();

    public int createPostList() {

        for (int n = 0; n < 10; n++) {
            postList.put(n, "abcdefghij");
        }
        return postList.size();
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
        return postList.size();
    }

    @Override
    public int commentCount() {
        return 0;
    }
}
