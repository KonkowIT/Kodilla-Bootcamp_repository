package com.kodilla2.testing.user;

public class SimpleUser {
    String realName;
    String username;

    public SimpleUser(String username, String realName) {
        this.username = username;
        this.realName = realName;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }
}
