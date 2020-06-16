package ru.job4j.array;

/**
 * Class Turn
 * Класс располагает элементы массива в обратном порядке.
 * @author Dmitry Razumov
 * @version 1
 */
public class Turn {
    /**
     * Метод изменяет порядок следования элементов массива в обратном порядке.
     * @param array Массив, в котором нужно изменить порядок следования элементов
     * @return Массив, с обратным порядком следования элементов
     */
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}
