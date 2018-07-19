package com.kodilla.patterns22.adapter.bookclasifier;

import com.kodilla.patterns22.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns22.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns22.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    private String author;
    private String title;
    private int year;
    private BookSignature signature;

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns22.adapter.bookclasifier.libraryb.Book> books = new HashMap<>();
        for(Book booksFromSet : bookSet) {
            author = booksFromSet.getAuthor();
            title = booksFromSet.getTitle();
            year = booksFromSet.getPublicationYear();
            signature = new BookSignature(booksFromSet.getSignature());
            books.put(signature, new com.kodilla.patterns22.adapter.bookclasifier.libraryb.Book(author, title, year));
        }
        return medianPublicationYear(books);
    }
}
