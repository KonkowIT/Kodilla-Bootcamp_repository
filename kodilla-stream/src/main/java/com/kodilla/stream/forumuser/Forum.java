package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> listOfForumUsers = new ArrayList<>();

    public Forum(){
        listOfForumUsers.add(new ForumUser(001, "alpaka123", 'M', 1993, 10, 22, 155));
        listOfForumUsers.add(new ForumUser(002, "józefina18", 'F', 1918, 2, 11, 0));
        listOfForumUsers.add(new ForumUser(003, "konrad_kowalski", 'M', 1995, 11, 28, 347));
        listOfForumUsers.add(new ForumUser(004, "młody321", 'M', 2001, 5, 17, 2394));
        listOfForumUsers.add(new ForumUser(005, "żyrafa_warszawa", 'F', 1985, 9, 16, 799));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(listOfForumUsers);
    }
}
