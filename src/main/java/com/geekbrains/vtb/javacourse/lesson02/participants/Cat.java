package com.geekbrains.vtb.javacourse.lesson02.participants;

public class Cat implements Participant {
    private static final String JUMP_MESSAGE = "%s перепрыгнул препятствие: %d см.";
    private static final String FAILED_MESSAGE = "%s не справился с задачей.";
    private int maxRunDistance;
    private int maxJumpHeight;
    private String name;

    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public boolean run(int distance) {
        boolean success;
        if (distance > maxRunDistance) {
            System.out.println(String.format(FAILED_MESSAGE, name));
            success = false;
        } else {
            System.out.println(name + " успешно пробежал(а) " + distance + " м.");
            success = true;
        }
        return success;
    }

    @Override
    public boolean jump(int height) {
        if (height > maxJumpHeight) {
            System.out.println(name + " не справился с задачей.");
            return false;
        } else {
            System.out.println(String.format(JUMP_MESSAGE, name, height));
            return true;
        }
    }
}
