package ru.job4j.array;

/**
 * Class Check
 * Класс осуществляет проверку массива.
 * @author Dmitry Razumov
 * @version 1
 */
public class Check {
    /**
     * Метод проверяет, содержит или нет массив одинаковые значение.
     * @param data Массив который нужно проверить
     * @return true, если элементы одинаковые, false если есть разные элементы
     */
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[0] != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
