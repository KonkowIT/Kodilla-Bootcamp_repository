package com.kodilla.stream.book;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.IntStream;

public class BookTestSuite {
    @Test
    public void testGetListUsingFor() {
        //given
        BookDirectory bookDirectory = new BookDirectory();

        //when
        List<Book> books = bookDirectory.getList();

        //then
        int numberOfPublicatedAfter2007 = 0;
        for (Book book : books){
            if(book.getYearOfPublication() > 2007){
                numberOfPublicatedAfter2007++;
            }
        }
        Assert.assertEquals(3, numberOfPublicatedAfter2007);
    }

    @Test
    public void testGetListUsingIntStream(){
        //given
        BookDirectory bookDirectory = new BookDirectory();

        //when
        List<Book> books = bookDirectory.getList();

        //then
        int numberOfPublicatedAfter2007 = IntStream.range(0, books.size())      //stworzenie i uruchomienie strumienia Int o zakresach numerów od 0 do books.size()
                .filter(n -> books.get(n).getYearOfPublication() > 2007)        //odfiltrowanie książek, których rok publikacji jest większy niż 2007
                .map(n -> 1)        //nadanie wartości true wartości 1
                .sum();         //sumowanie jedynek
        Assert.assertEquals(3, numberOfPublicatedAfter2007);
    }

    @Test
    public void testGetListUsingIntStreamAndCount() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getList();

        //Then
        long numberOfBooksPublicatedAfter2007 = IntStream.range(0, books.size())
                .filter(n -> books.get(n).getYearOfPublication() > 2007)
                .count();                                                           //nie trzeba nadawać wartości 1, count zlicza wartości true
        Assert.assertEquals(3, numberOfBooksPublicatedAfter2007);
    }
}
