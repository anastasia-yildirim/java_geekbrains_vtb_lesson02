package com.geekbrains.vtb.javacourse.lesson03;

import com.geekbrains.vtb.javacourse.lesson03.exceptions.MyArrayDataException;
import com.geekbrains.vtb.javacourse.lesson03.exceptions.MyArraySizeException;
import com.geekbrains.vtb.javacourse.lesson03.exceptions.MyException;

import static com.geekbrains.vtb.javacourse.Messages.*;

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
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int calculateSum(String[][] array) {
        if (array.length != 4) {
            throw new MyArraySizeException(WRONG_ARRAY_SIZE_MESSAGE);
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException(String.format(WRONG_ARRAY_ROW_LENGTH_MESSAGE, i));
            }
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException _) {
                    throw new MyArrayDataException(String.format(WRONG_ARRAY_DATA_MESSAGE, i, j));
                }
            }
        }

        return sum;
    }
}
