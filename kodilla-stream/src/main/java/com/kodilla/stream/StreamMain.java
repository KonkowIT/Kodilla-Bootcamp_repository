package com.kodilla.stream;


import com.kodilla.stream.beautifier.DecorateMethods;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.world.World;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        //7.1 poem beautifier
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        DecorateMethods decorateMethods = new DecorateMethods();
        poemBeautifier.beautify("House", DecorateMethods::addAtBegining);
        poemBeautifier.beautify("House", DecorateMethods::addAtEnd);
        poemBeautifier.beautify("House", DecorateMethods::toUpperCase);
        poemBeautifier.beautify("House", DecorateMethods::toLowerCase);

        //7.2

        //7.3
        System.out.println("\n" );
        LocalDate ageOf20 = LocalDate.of(1998, 03, 29);
        Forum forum = new Forum();

        Map<Integer, ForumUser> usersMap = forum.getUserList().stream()
                .filter(Forum -> Forum.getSex() == 'M')
                .filter(Forum -> ChronoUnit.YEARS.between(Forum.getBirthDate(), ageOf20) < 20)
                .filter(Forum -> Forum.getPublishedPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUnicUserID, Forum -> Forum));

        System.out.println("Lista użytkowników oraz ich dane:\n");
        usersMap.entrySet().stream()
                .map(Forum -> Forum.getKey() + ": " + Forum.getValue())
                .forEach(System.out::println);

        //7.4
        World world = new World();
        //System.out.println("\nWorld people quantity - " + world.getWorldPeopleQuantity(7));
    }
}