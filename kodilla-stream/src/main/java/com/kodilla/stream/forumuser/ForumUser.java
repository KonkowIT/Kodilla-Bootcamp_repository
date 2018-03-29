package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    public final int unicUserID;
    public final String userName;
    public final char sex; //M lub F
    public final LocalDate birthDate;
    public final int publishedPosts;

    public ForumUser(int unicUserID, String userName, char sex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int publishedPosts) {
        this.unicUserID = unicUserID;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.publishedPosts = publishedPosts;
    }

    public int getUnicUserID() {
        return unicUserID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPublishedPosts() {
        return publishedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "unicUserID=" + unicUserID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", publishedPosts=" + publishedPosts +
                '}';
    }
}
