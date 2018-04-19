package com.kodilla.patterns.prototype.library;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashSet;
import java.util.Set;

public class Library {
    final String name;
    final Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Library '" + name + '\'' +
                " contains books: " + books;
    }

    public Library shallowCopy() throws CloneNotSupportedException{
        return (Library)super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException{
        Library clonedLibrary = (Library)super.clone();
        for(Book theBooks : books){
            clonedLibrary.getBooks().add(theBooks);
        }
        return clonedLibrary;
    }
}
