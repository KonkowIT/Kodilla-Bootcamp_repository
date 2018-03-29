package com.kodilla.stream.forum;

import com.kodilla.stream.forumuser.Forum;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ForumUser {
    public final String username;
    public final String realName;
    public final String location;
    private final Set<ForumUser> friends = new HashSet<>();

    public ForumUser(String username, String realName, String location) {
        this.username = username;
        this.realName = realName;
        this.location = location;
    }

    public Set<String> getLocationsOfFriends(){
        return friends.stream()
                .map(friends -> friends.getLocation())
                .collect(Collectors.toSet());
    }

    public Set<String> getLocationsOfFriendsOfFriends(){         //KOLEKCJA SET NIE WPROWADZA DUPLIKATÓW !!!
        return friends.stream()                                 //Tworzenie i uruchamianie strumienia "friends"
                .flatMap(user -> user.getFriends().stream())    //spłaszczenie, do każdego przyjaciela "user" pobieramy listę jego przyjaciół (user.getFriends())
                                                                //przekazujemy do dalszego strumienia
                .filter(user -> user != this)                   //wykluczenie odwołania do samego siebie
                .map(ForumUser::getLocation)                    //transformacja strumienia z obiektów ForumUser na obiekty String (nie transformuje tylko pobiera jedna wartość???!!!)
                .collect(Collectors.toSet());                   //złożenie strumienia w kolekcję typu Set, zwierającą listę lokalizacji
    }

    public void addFriend(ForumUser user){
        friends.add(user);
    }

    public void removeFriend(ForumUser user){
        friends.remove(user);
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    public String getLocation() {
        return location;
    }

    public Set<ForumUser> getFriends() {
        return friends;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "username='" + username + '\'' +
                ", realName='" + realName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return Objects.equals(username, forumUser.username);
    }

    @Override
    public int hashCode() {

        return Objects.hash(username);
    }
}
