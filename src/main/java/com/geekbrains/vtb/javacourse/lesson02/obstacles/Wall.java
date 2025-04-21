package com.geekbrains.vtb.javacourse.lesson02.obstacles;

import com.geekbrains.vtb.javacourse.lesson02.participants.Participant;

public class Wall implements Obstacle {
    private final int heightInCentimeters;

    public Wall(int heightInCentimeters) {
        this.heightInCentimeters = heightInCentimeters;
    }

    @Override
    public boolean challenge(Participant participant) {

        return participant.jump(heightInCentimeters);
    }
}
