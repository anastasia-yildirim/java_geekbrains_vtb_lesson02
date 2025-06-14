package com.geekbrains.vtb.javacourse.lesson04.homework.fruits;

import java.util.ArrayList;

/*
3. Задача:
    DONE - a. Даны классы Fruit -> Apple, Orange.
    DONE - b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу
    фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины.
    DONE - c. Для хранения фруктов внутри коробки можно использовать ArrayList.
    DONE - d. Написать метод getWeight(), который высчитывает вес коробки. Задать вес одного
    фрукта и их количество: вес яблока — 1.0f, апельсина — 1.5f (единицы измерения не
    важны).
    DONE - e. Внутри класса Box написать метод compare(), который позволяет сравнить текущую
    коробку с той, которую подадут в compare() в качестве параметра. True, если их массы
    равны, False — в противном случае. Можно сравнивать коробки с яблоками и
    апельсинами.
    DONE - f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
    Помним про сортировку фруктов: нельзя высыпать яблоки в коробку с апельсинами.
    Соответственно, в текущей коробке фруктов не остаётся, а в другую перекидываются
    объекты, которые были в первой.
    DONE - g. Не забываем про метод добавления фрукта в коробку.
     */

public class FruitBox<T extends Fruit> {
    private float weight;
    private ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        weight = T.getWeight() * fruits.size();

        return weight;
    }

    public boolean compare(FruitBox<? extends Fruit> box) {
        return getWeight() == box.getWeight();
    }

    public void transferFruitsToBox(FruitBox<T> box) {
        for (T fruit : fruits) {
            box.addFruit(fruit);
            fruits.remove(fruit);
        }
    }
}
