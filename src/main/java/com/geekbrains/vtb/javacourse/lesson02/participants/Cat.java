package com.geekbrains.vtb.javacourse.lesson02.participants;

public class Cat implements Participant {
    private int runningLimitationInMeters;
    private int jumpingLimitationInCentimeters;
    private String name;

    public Cat(String name, int runningLimitation, int jumpingLimitation) {
        this.name = name;
        this.runningLimitationInMeters = runningLimitation;
        this.jumpingLimitationInCentimeters = jumpingLimitation;
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
