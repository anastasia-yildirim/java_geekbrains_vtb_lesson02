package com.geekbrains.vtb.javacourse.lesson03;

import com.geekbrains.vtb.javacourse.lesson03.exceptions.MyArrayDataException;
import com.geekbrains.vtb.javacourse.lesson03.exceptions.MyArraySizeException;

public class Lesson3 {

    /*
    1. Создайте исключения: MyArraySizeException (неправильный размер массива), и MyArrayDataException
    (в ячейке массива лежит что-то не то);

    2. Напишите метод, на вход которого подаётся двумерный строковый массив (String[][]) размером 4×4.
    При подаче массива другого размера необходимо бросить исключение MyArraySizeException.

    3. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
    Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
    должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
    Расчет данных для этой матрицы прекращается.

    4. В методе main() нужно вызвать полученный метод, обработать возможные исключения MyArraySizeException
    и MyArrayDataException и вывести результат расчёта.
    Заметка: для преобразования строки в число можно использовать метод класса Integer: Integer.valueOf("1")
     */

    public static void main(String[] args) {

        String[][] array = {
                {"1", "0", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "O", "1"},
                {"1", "1", "1", "2"}
        };

        try {
            System.out.println("Сумма элементов массива: " + calculateSum(array));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int calculateSum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        validateArraySize(array);
        return sumArrayValues(array);
    }

    public static void validateArraySize(String[][] array) throws MyArraySizeException {

        if (array == null) {
            throw new MyArraySizeException("Массив не может быть null");
        }

        int rows = array.length;
        if ((rows != 4)) {
            throw new MyArraySizeException("Размер массива некорректный, количество строк не 4");
        }
        
        int column;
        for (int i = 0; i < array.length; i++) {
            column = array[i].length;
            if ((column != 4)) {
                throw new MyArraySizeException("Размер массива некорректный, ошибка в строке " + i);
            }
        }
    }

    public static int sumArrayValues(String[][] array) throws MyArrayDataException {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int cellValue;
                try {
                    cellValue = Integer.valueOf(array[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException("Преобразование не удалось. " +
                            "В ячейке [" + i + "][" + j + "] неверные данные");
                }
                sum += cellValue;
            }
        }

        return sum;
    }
}