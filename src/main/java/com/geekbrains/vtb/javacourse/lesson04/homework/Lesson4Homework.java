package com.geekbrains.vtb.javacourse.lesson04.homework;

import com.geekbrains.vtb.javacourse.lesson04.homework.fruits.FruitBox;
import com.geekbrains.vtb.javacourse.lesson04.homework.fruits.Orange;

import java.util.ArrayList;

public class Lesson4Homework {

    /* 1. Написать метод, который меняет два элемента массива местами
    (массив может быть любого ссылочного типа). */

    private static <T> Box<T>[] reverseArray(Box<T>[] array, int firstElementIndex,
                                             int secondElementIndex) {
        Box<T> temp = array[firstElementIndex];
        array[firstElementIndex] = array[secondElementIndex];
        array[secondElementIndex] = temp;

        return array;
    }

     /* 2. Написать метод, который преобразует массив в ArrayList. */

    private static <T> ArrayList<T> turnArrayIntoArrayList(T[] array) {
        ArrayList<T> result = new ArrayList<>();
        for (T element : array) {       // or instead of for each: result.addAll(Arrays.asList(array));
            result.add(element);
        }

        return result;      // or in one line: return new ArrayList<>(Arrays.asList(array));
    }

    FruitBox<Orange> boxOfOranges = new FruitBox<Orange>();
    Orange orange = new Orange();
    boxOfOranges.addFruit(orange);

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
