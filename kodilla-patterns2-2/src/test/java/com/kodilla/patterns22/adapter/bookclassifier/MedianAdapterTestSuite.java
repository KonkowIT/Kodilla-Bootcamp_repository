package com.kodilla.patterns22.adapter.bookclassifier;

import com.kodilla.patterns22.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns22.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedian() {
        //given
        MedianAdapter medianAdapter = new MedianAdapter();

        Set<com.kodilla.patterns22.adapter.bookclasifier.librarya.Book> booksA = new HashSet<>();
        Book bookA1 = new Book("Adam Mickiewicz", "W pustyni i w puszczy", 1977, "A0001");
        Book bookA2 = new Book("Dorota Welman", "Jedz zdrowo", 2018, "A0002");
        Book bookA3 = new Book("Marek Kondrat", "Psy", 1988, "A0003");
        Book bookA4 = new Book("Adam Mickiewicz", "Pan Tadeusz", 1890, "A0004");
        Book bookA5 = new Book("Umberto Eco", "Co w trawie piszczy", 1995, "A0005");
        Book bookA6 = new Book("Juliusz Słowacki", "Kordian", 1892, "A0006");
        Book bookA7 = new Book("Jan Kochanowski", "Fraszki", 1672, "A0007");
        Book bookA8 = new Book("Jan Brzechwa", "Legendy", 1980, "A0008");
        Book bookA9 = new Book("Stanisław Lem", "Bajki", 1999, "A0009");
        booksA.add(bookA1);
        booksA.add(bookA2);
        booksA.add(bookA3);
        booksA.add(bookA4);
        booksA.add(bookA5);
        booksA.add(bookA6);
        booksA.add(bookA7);
        booksA.add(bookA8);
        booksA.add(bookA9);

        //when
        int medianResult = medianAdapter.publicationYearMedian(booksA);

        //then
        assertEquals(1980, medianResult);
    }
}
