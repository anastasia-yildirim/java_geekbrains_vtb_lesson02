package com.geekbrains.vtb.javacourse.lesson02.participants;

import static com.geekbrains.vtb.javacourse.Messages.*;

public class Cat implements Participant {
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
            System.out.println(String.format(RUN_SUCCESS_MESSAGE, name, distance));
            success = true;
        }

        return success;
    }

    @Override
    public boolean jump(int height) {
        if (height > maxJumpHeight) {
            System.out.println(String.format(FAILED_MESSAGE, name));

            return false;
        } else {
            System.out.println(String.format(JUMP_SUCCESS_MESSAGE, name, height));

            return true;
        }
    }
}
