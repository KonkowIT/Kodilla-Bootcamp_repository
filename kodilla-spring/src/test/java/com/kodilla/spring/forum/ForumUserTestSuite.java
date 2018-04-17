package com.kodilla.spring.forum;

import com.kodilla.spring.shape.Shape;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ForumUserTestSuite {
    @Test
    public void testGetUserName() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        ForumUser forumUser = context.getBean(ForumUser.class);
        //when
        String name = forumUser.getUsername();
        //then
        Assert.assertEquals("John Smith", name);
    }

    @Test
    public void testCircleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape)context.getBean("circle");
        //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("This is a circle", name);
    }

    @Test
    public void testTriangleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape)context.getBean("triangle");
        //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("This is a triangle", name);
    }

    @Test
    public void testSquareLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape)context.getBean("createSquare");
        //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("This is a square", name);
    }

    @Test
    public void testShapeLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape)context.getBean("choosenShape");
        //When
        String name = shape.getShapeName();
        //Then
        System.out.println("Choosen shape says: " + name);
    }
}
