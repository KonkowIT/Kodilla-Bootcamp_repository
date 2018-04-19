package com.kodilla.patterns.strategy.social;

public class User {
    final String user;
    protected SocialPublisher socialPublisher;

    public User(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public String sharePost(){
        return socialPublisher.share();
    }

    public void setSocialPublisher(SocialPublisher socialPublisher){
        this.socialPublisher = socialPublisher;
    }
}
