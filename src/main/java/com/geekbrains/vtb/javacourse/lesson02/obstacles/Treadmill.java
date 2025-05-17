package com.geekbrains.vtb.javacourse.lesson02.obstacles;

import com.geekbrains.vtb.javacourse.lesson02.participants.Participant;

public class Treadmill implements Obstacle {
    private final int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean challenge(Participant participant) {
        return participant.run(length);
    }
}
