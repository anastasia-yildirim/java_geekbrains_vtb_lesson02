package com.geekbrains.vtb.javacourse.lesson02.participants;

public class Robot implements Participant {
    private int runningLimitationInMeters;
    private int jumpingLimitationInCentimeters;
    private String name;

    public Robot(String name, int runningLimitationInMeters, int jumpingLimitationInCentimeters) {
        this.name = name;
        this.runningLimitationInMeters = runningLimitationInMeters;
        this.jumpingLimitationInCentimeters = jumpingLimitationInCentimeters;
    }

    @Override
    public boolean run(int meters) {
        boolean success;
        if (meters > runningLimitationInMeters) {
            System.out.println(name + " не справился с задачей.");
            success = false;
        } else {
            System.out.println(name + " успешно пробежал(а) " + meters + " м.");
            success = true;
        }
        return success;
    }

    @Override
    public boolean jump(int centimeters) {
        boolean success;
        if (centimeters > jumpingLimitationInCentimeters) {
            System.out.println(name + " не справился с задачей.");
            success = false;
        } else {
            System.out.println(name + " перепрыгнул препятствие: " + centimeters + " см.");
            success = true;
        }
        return success;
    }
}
