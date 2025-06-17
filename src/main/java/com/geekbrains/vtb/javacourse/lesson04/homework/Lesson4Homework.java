package com.geekbrains.vtb.javacourse.lesson04.homework;

import com.geekbrains.vtb.javacourse.lesson04.homework.fruits.Apple;
import com.geekbrains.vtb.javacourse.lesson04.homework.fruits.FruitBox;
import com.geekbrains.vtb.javacourse.lesson04.homework.fruits.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class Lesson4Homework {

    /* 1. Написать метод, который меняет два элемента массива местами
    (массив может быть любого ссылочного типа). */

    public static void main(String[] args) {
        String[] strings = {"1", "5", "stg"};
        String[] newStrings = reverseArray(strings, 0, 1);
        System.out.println(Arrays.toString(newStrings));

        ArrayList<String> newArrayList = turnArrayIntoArrayList(strings);
        System.out.println(newArrayList);

        manipulateFruitBoxes();
    }

    private static <T> T[] reverseArray(T[] array, int firstElementIndex,
                                             int secondElementIndex) {
        try {
            T temp = array[firstElementIndex];
            array[firstElementIndex] = array[secondElementIndex];
            array[secondElementIndex] = temp;
        } catch (Exception _) {
            throw new ArrayIndexOutOfBoundsException(String.format("Make sure the indices are within 0-%s range", array.length - 1));
        }

        return array;
    }

    private static <T> ArrayList<T> turnArrayIntoArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    private static void manipulateFruitBoxes() {
        FruitBox<Orange> boxOfOranges = new FruitBox<>();
        for (int i = 0; i < 4; i++) {
            Orange orange = new Orange();
            boxOfOranges.addFruit(orange);
        }
        boxOfOranges.getWeight();

        FruitBox<Apple> boxOfApples = new FruitBox<>();
        for (int i = 0; i < 6; i++) {
            Apple apple = new Apple();
            boxOfApples.addFruit(apple);
        }
        boxOfApples.getWeight();

        System.out.println(boxOfApples.compare(boxOfOranges));

        FruitBox<Orange> secondBoxOfOranges = new FruitBox<>();
        boxOfOranges.transferFruitsToBox(secondBoxOfOranges);
        boxOfOranges.getWeight();
        secondBoxOfOranges.getWeight();
    }

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

}
