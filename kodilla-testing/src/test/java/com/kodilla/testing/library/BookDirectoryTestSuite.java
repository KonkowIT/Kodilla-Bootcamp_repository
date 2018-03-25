package com.kodilla.testing.library;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    //sprawdzi, czy lista książek spełniających warunek wyszukiwania jest poprawnie zwracana

    private List<Book> generateListOfNBooks(int booksQuantity){
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title" + n, "Author" + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionsReturnList(){
        //given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //when
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        //then
        assertEquals(4, theListOfBooks.size());
    }

    //Sprawdzenie, czy metoda listBooksWithCondition(String titleFragment) zachowuje się poprawnie
    // gdy liczba tytułów pasujących do wzorca jest większa niż 20
    //W tej sytuacji zwracana powinna być pusta lista
    @Test
    public void testListBookWithConditionMoreThan20(){
        //given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

        //when
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("AnyTitle");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

        //then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    //sprawdzenie, czy zwracana lista książek jest pusta
    // w sytuacji gdy wyszukiwany fragment tytułu jest krótszy niż trzy znaki.
    @Test
    public void testListBooksWithConditionFragmentShorterThan3(){
        //given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf10Books);

        //when
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        //then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    //
    @Test
    public void testListBooksInHandsOf(){
        //given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        LibraryUser libraryUserMock = mock(LibraryUser.class);
        Book bookMock = mock(Book.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> listBooksOfUserName = new ArrayList<Book>();
        Book book = new Book("Title", "Author", 1970);
        listBooksOfUserName.add(book);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUserMock)).thenReturn(listBooksOfUserName);

        LibraryUser libraryUser = new LibraryUser("Adam", "Mickiewicz", "00112212345");
        when(libraryUserMock.getFirstname()).thenReturn(libraryUser.firstname);

        //when
        int result = bookLibrary.listBooksInHandsOf(libraryUserMock).size();
        //then
        assertEquals(listBooksOfUserName.size(), result);
    }
}
