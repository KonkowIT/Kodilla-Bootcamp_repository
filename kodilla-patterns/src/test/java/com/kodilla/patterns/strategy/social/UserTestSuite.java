package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

import javax.jws.soap.SOAPBinding;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //given
        User tomek = new Millenials("Tomek");
        User konrad = new YGeneration("Konrad");
        User ola = new ZGeneration("Ola");

        //when
        String tomekShare = tomek.sharePost();
        System.out.println("Tomek's post is " + tomekShare);
        String konradShare = konrad.sharePost();
        System.out.println("Konrad's post is " + konradShare);
        String olaShare = ola.sharePost();
        System.out.println("Ola's post is " + olaShare);

        //then
        Assert.assertEquals("published on Facebook", konradShare);
        Assert.assertEquals("published on Twitter", olaShare);
        Assert.assertEquals("published on Snapchat", tomekShare);
    }

    @Test
    public void testindividualSharingStrategy(){
        //given
        User konrad = new YGeneration("Konrad");

        //when
        String konradShare = konrad.sharePost();
        System.out.println("Konrad's post is " + konradShare);
        konrad.setSocialPublisher(new SnapchatPublisher());
        konradShare = konrad.sharePost();
        System.out.println("Konrad's post is " + konradShare);
        //then
        Assert.assertEquals("published on Snapchat", konradShare);
    }
}
