package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase {
    //lista książek o tytułach rozpoczynających się od podanego ciągu znaków (titleFragment)
    List<Book> listBooksWithCondition(String titleFragment);

    //lista książek wypożyczonych przez libraryUser
    List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    //próba wypożyczenia książki
    //zwraca true gdy się powiedzie
    //zwraca false jeżeli książki nie moża wypożyczyć
    boolean rentABook(LibraryUser libraryUser, Book book);

    //zwraca ilość zwróconych książek
    int returnBooks(LibraryUser libraryUser);
}
