package com.geekbrains.vtb.javacourse.lesson04.homework.fruits;

import java.util.ArrayList;

public class FruitBox<T extends Fruit> {
    private float weight;
    private ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        try {
            System.out.println("В коробке лежит: " + fruits.getFirst().getClass());
            System.out.println("Вес 1 шт.: " + fruits.getFirst().getWeight());
            weight = fruits.getFirst().getWeight() * fruits.size();
        } catch (Exception _) {
            System.out.println("The box is empty");
            weight = 0.0F;
        }
        System.out.println("Вес содержимого коробки: " + weight);

        return weight;
    }

    public boolean compare(FruitBox<? extends Fruit> box) {
        return Math.abs(getWeight() - box.getWeight()) < 0.0001;
    }

    public void transferFruitsToBox(FruitBox<T> box) {
        for (T fruit : fruits) {
            box.addFruit(fruit);
        }
        fruits.clear();
    }
}
