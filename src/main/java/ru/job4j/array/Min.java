package ru.job4j.array;

/**
 * Class Min
 * Класс осуществляет поиск минимального элемента массива.
 * @author Dmitry Razumov
 * @version 1
 */
public class Min {
    /**
     * Метод осуществляет поиск минимального элемента массива.
     * @param array Массив в котором нужно найти минимальный элемент
     * @return Минимальный элемент
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }
}
