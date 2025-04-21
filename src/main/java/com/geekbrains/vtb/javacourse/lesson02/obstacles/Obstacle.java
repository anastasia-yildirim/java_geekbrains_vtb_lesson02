package com.geekbrains.vtb.javacourse.lesson02.obstacles;

import com.geekbrains.vtb.javacourse.lesson02.participants.Participant;

public interface Obstacle {
    boolean challenge(Participant participant);
}
