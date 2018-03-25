package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment){
        List<Book> bookList = new ArrayList<Book>();
        if(titleFragment.length() < 3) return bookList;

        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if(resultList.size() > 20) return bookList;

        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser){
        libraryDatabase.listBooksInHandsOf(libraryUser);
        List<Book> listBooksInHandsOf = new ArrayList<Book>();
        Book book = new Book("Title", "Author", 1970);
        listBooksInHandsOf.add(book);
        return listBooksInHandsOf;
    }

    public boolean rentABook(LibraryUser libraryUser, Book book){
        boolean result;
        Map<LibraryUser, Book> rentedBooks = new HashMap<LibraryUser, Book>();
        rentedBooks.put(libraryUser, book);

        if(rentedBooks.containsValue(book)){result = false;}
        else{result = true;}

        return result;
    }

    public int returnBooks(LibraryUser libraryUser){
        int result;
        Book book1 = new Book("Title", "Author", 1970);
        Map<LibraryUser, Book> booksOfUser = new HashMap<LibraryUser, Book>();
        booksOfUser.put(libraryUser, book1);

        result = booksOfUser.size();

        return result;
    }
}
