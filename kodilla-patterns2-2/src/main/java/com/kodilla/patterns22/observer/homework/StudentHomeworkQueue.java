package com.kodilla.patterns22.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentHomeworkQueue implements Observable {
    private final List<Observer> observerList;
    private final List<String> homeworkList;
    private String name;

    public StudentHomeworkQueue(String name) {
        observerList = new ArrayList<>();
        homeworkList = new ArrayList<>();
        this.name = name;
    }

    public void addHomework(String name) {
        homeworkList.add(name);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observerList){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public List<String> getHomeworkList() {
        return homeworkList;
    }

    public String getName() {
        return name;
    }
}
