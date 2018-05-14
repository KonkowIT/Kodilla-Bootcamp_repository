package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //given
        Book book1 = new Book("XYZ", "Adam", LocalDate.of(1992, 12, 22));
        Book book2 = new Book("ZYX", "Damian", LocalDate.of(2003, 2, 13));
        Book book3 = new Book("ABC", "Ewa", LocalDate.of(1983, 1, 21));
        Book book4 = new Book("CBA", "Daniel", LocalDate.of(1974, 11, 28));
        Library library = new Library("Main library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        //shallow copy
        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        // deep copy
        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //when
        //then
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepCloneLibrary);
        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, cloneLibrary.getBooks().size());
        Assert.assertEquals(4, deepCloneLibrary.getBooks().size());
    }
}