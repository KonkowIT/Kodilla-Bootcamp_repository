package com.kodilla.patterns22.observer.homework;

public class Mentor implements Observer {
    private final String mentorUsername;
    private int homeworkCount;

    public Mentor(String mentorUsername) {
        this.mentorUsername = mentorUsername;
    }

    @Override
    public void update(StudentHomeworkQueue studentHomeworkQueue) {
        System.out.println("New homework sended to: " + studentHomeworkQueue.getName() + "\n" +
                getMentorUsername() + "'s queue contains " +
                studentHomeworkQueue.getHomeworkList().size() + " sended homeworks.");
        homeworkCount++;
    }

    public String getMentorUsername() {
        return mentorUsername;
    }

    public int getHomeworkCount() {
        return homeworkCount;
    }
}
