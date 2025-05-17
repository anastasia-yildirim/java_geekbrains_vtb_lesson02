package com.geekbrains.vtb.javacourse.lesson02;

import com.geekbrains.vtb.javacourse.lesson02.obstacles.Obstacle;
import com.geekbrains.vtb.javacourse.lesson02.obstacles.Treadmill;
import com.geekbrains.vtb.javacourse.lesson02.obstacles.Wall;
import com.geekbrains.vtb.javacourse.lesson02.participants.Cat;
import com.geekbrains.vtb.javacourse.lesson02.participants.Human;
import com.geekbrains.vtb.javacourse.lesson02.participants.Participant;
import com.geekbrains.vtb.javacourse.lesson02.participants.Robot;

import java.util.Random;

/*
1. Продолжаем работать с участниками и выполнением действий. Создайте три класса Человек, Кот, Робот, которые
не наследуются от одного класса. Эти классы должны уметь бегать и прыгать, все также с выводом информации
о действии в консоль.
2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять
соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал,
не смог пробежать и т.д.). У препятствий есть длина (для дорожки) или высота (для стены), а у участников ограничения
на бег и прыжки.
3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
Если участник не смог пройти одно из препятствий, то дальше по списку препятствий он не идет. */

public class Main {
    public static void main(String[] args) {
        Participant[] participants = createParticipants();
        Obstacle[] obstacles = createObstacles();
        makeParticipantsOvercomeObstacles(participants, obstacles);
    }

    public static Participant[] createParticipants() {
        return new Participant[] { new Cat("Том", 100, 300),
                                    new Human("Тим", 1000, 30),
                                    new Robot("Роб", 5000, 10) };
    }

    public static Obstacle[] createObstacles() {
        return new Obstacle[] { new Treadmill(new Random().nextInt(50, 100)),
                                new Wall(new Random().nextInt(30, 50)) };
    }

    public static void makeParticipantsOvercomeObstacles(Participant[] participants, Obstacle[] obstacles) {
        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                boolean success = obstacle.challenge(participant);
                if (!success) {
                    break;
                }
            }
        }
    }
}
