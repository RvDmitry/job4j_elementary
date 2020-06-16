package ru.job4j.array;

/**
 * Class MinDiapason
 * Класс осуществляет поиск минимального значения массива в заданном диаппазоне.
 * @author Dmitry Razumov
 * @version 1
 */
public class MinDiapason {
    /**
     * Метод осуществляет поиск минимального значения массива в определенном заданном диаппазоне.
     * @param array Массив в котором нужно найти минимальный элемент
     * @param start Начальное значение диаппазона поиска элемента
     * @param finish Конечное значение диаппазона поиска элемента
     * @return Минимальный элемент
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i <= finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
