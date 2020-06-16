package ru.job4j.array;

/**
 * Class FindLoop
 * Класс осуществляет поиск индекса элемента массива.
 * @author Dmitry Razumov
 * @version 1
 */
public class FindLoop {
    /**
     * Метод осуществляет поиск индекса элемента массива.
     * Если элемент в массиве не найден, то возвращается -1.
     * @param data Массив в котором осуществляется поиск элемента
     * @param el Элемент, индекс которого нужно найти в массиве
     * @return Индекс элемента
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * Метод осуществляет поиск индекса элемента массива в заданном интервале (включая крайние значения).
     * Если элемент в заданном интервале не найден, то возвращается -1.
     * @param data Массив в котором осуществляется поиск элемента
     * @param el Элемент, индекс которого нужно найти в массиве
     * @param start Начальное значение интервала поиска в массиве
     * @param finish Конечное значение интервала поиска в массиве
     * @return Индекс элемента
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
