package com.geekbrains.vtb.javacourse.lesson02.obstacles;

import com.geekbrains.vtb.javacourse.lesson02.participants.Participant;

public class Treadmill implements Obstacle {
    private final int lengthInMeters;

    public Treadmill(int lengthInMeters) {
        this.lengthInMeters = lengthInMeters;
    }

    @Override
    public boolean challenge(Participant participant) {

        return participant.run(lengthInMeters);
    }
}
