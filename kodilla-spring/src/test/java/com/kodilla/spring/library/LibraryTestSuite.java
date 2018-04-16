package com.kodilla.spring.library;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class LibraryTestSuite {
    @Test
    public void testLoadFromDb(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);
        //when
        library.loadFromDb();
        //then
        //do nothing
    }

    @Test
    public void testSaveToDb(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);
        //when
        library.saveToDb();
        //then
        //do nothing
    }

    @Test
    public void testContext(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        //when & then
        System.out.println("===== Beans List ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ==== Beans List =====");
    }
}
