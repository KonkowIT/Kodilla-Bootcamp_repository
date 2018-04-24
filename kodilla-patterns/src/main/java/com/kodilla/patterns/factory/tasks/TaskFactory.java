package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task createTask(final String taskOption) {
        switch (taskOption) {
            case SHOPPING:
                return new ShoppingTask("Buying underwear", "panties", 2);
            case PAINTING:
                return new PaintingTask("Painting the wall", "yellow", "wall");
            case DRIVING:
                return new DrivingTask("Driving home", "home", false);
                default:
                    return null;
        }
    }
}
