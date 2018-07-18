package com.kodilla.patterns22.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentHomeworkTestSuite {
    @Test
    public void testHomeworkQueue() {
        //given
        StudentHomeworkQueue konrad = new KonradQueue("Konrad");
        StudentHomeworkQueue tomek = new TomekQueue("Tomek");
        Mentor pawel = new Mentor("Paweł");
        Mentor lukasz = new Mentor("Łukasz");
        Mentor darek = new Mentor("Darek");
        konrad.registerObserver(pawel);
        tomek.registerObserver(lukasz);
        tomek.registerObserver(darek);
        //when
        konrad.addHomework("Zadanie z modułu 18.1");
        konrad.addHomework("Zadanie z modułu 13.4");
        konrad.addHomework("Zadanie z modułu 17.5");
        tomek.addHomework("Zadanie z modułu 2.4");
        tomek.addHomework("Zadanie z modułu 21.2");
        //then
        assertEquals(3, pawel.getHomeworkCount());
        assertEquals(2, lukasz.getHomeworkCount());
        assertEquals(2, darek.getHomeworkCount());
    }
}
