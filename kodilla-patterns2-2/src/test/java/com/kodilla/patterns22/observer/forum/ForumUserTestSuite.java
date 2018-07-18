package com.kodilla.patterns22.observer.forum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaHelpForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(ivoneEscobar);
        javaToolsForum.registerObserver(jessiePinkman);
        //when
        javaHelpForum.addPost("help_test_1");
        javaHelpForum.addPost("help_test_2");
        javaHelpForum.addPost("help_test_3");
        javaToolsForum.addPost("tools_tet_1");
        javaToolsForum.addPost("tools_tet_2");
        //then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
        assertEquals(5, jessiePinkman.getUpdateCount());
    }
}
