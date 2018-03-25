package com.kodilla.testing.library;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BookDirectoryTestSuite {

    //sprawdzi, czy lista książek spełniających warunek wyszukiwania jest poprawnie zwracana
    @Test
    public void testListBooksWithConditionsReturnList(){
        assertTrue(false);
    }

    //Sprawdzenie, czy metoda listBooksWithCondition(String titleFragment) zachowuje się poprawnie
    // gdy liczba tytułów pasujących do wzorca jest większa niż 20
    //W tej sytuacji zwracana powinna być pusta lista
    @Test
    public void testListBookWithConditionMoreThan20(){
        assertTrue(false);
    }

    //sprawdzenie, czy zwracana lista książek jest pusta
    // w sytuacji gdy wyszukiwany fragment tytułu jest krótszy niż trzy znaki.
    @Test
    public void testListBooksWithConditionFragmentShorterThan3(){
        assertTrue(false);
    }
}
