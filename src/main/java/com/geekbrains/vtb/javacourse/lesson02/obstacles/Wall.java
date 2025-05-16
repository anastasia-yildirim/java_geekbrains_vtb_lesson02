package com.geekbrains.vtb.javacourse.lesson02.obstacles;

import com.geekbrains.vtb.javacourse.lesson02.participants.Participant;

public class Wall implements Obstacle {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean challenge(Participant participant) {
        return participant.jump(height);
    }
}