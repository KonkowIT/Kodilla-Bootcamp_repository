package com.kodilla.testing.forum.statistics;

import java.util.List;

public interface Statistics {

    List<String> usersNames();  //lista użytkowników

    List<String> userNames();

    int postsCount();           //łączna ilość postów
    int commentCount();         //łączna ilość komentarzy
}



