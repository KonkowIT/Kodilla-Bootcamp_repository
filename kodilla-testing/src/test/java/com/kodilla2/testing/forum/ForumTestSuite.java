package com.kodilla2.testing.forum;

import com.kodilla2.testing.user.SimpleUser;
import org.junit.*;

public class ForumTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: Begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: End");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: Begin");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: End");
    }

    @Test
    public void testCaseUsername(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "Konrad Kowalski");
        //When
        String result = simpleUser.getUsername();
        System.out.println("Testing: " + result);
        //Then
        Assert.assertEquals("theForumUser", result);
    }

    @Test
    public void testCaseRealName(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "Konrad Kowalski");
        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing: " + result);
        //Then
        Assert.assertEquals("Konrad Kowalski", result);
    }
}
