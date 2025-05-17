package com.geekbrains.vtb.javacourse;

public final class Messages {
    public static final String JUMP_SUCCESS_MESSAGE = "%s перепрыгнул препятствие: %d см.";
    public static final String RUN_SUCCESS_MESSAGE = "%s успешно пробежал %d м.";
    public static final String FAILED_MESSAGE = "%s не справился с задачей.";
    public static final String WRONG_ARRAY_SIZE_MESSAGE = "Размер массива некорректный, количество строк не равно 4";
    public static final String WRONG_ARRAY_ROW_LENGTH_MESSAGE = "Размер массива некорректный, ошибка в строке %s";
    public static final String WRONG_ARRAY_DATA_MESSAGE = "Преобразование не удалось. " +
            "В ячейке [%s][%d] неверные данные";

    private Messages() {}
}
