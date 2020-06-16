package ru.job4j.array;

/**
 * Class SortSelected
 * Класс осуществляет сортировку массива по возрастанию методом выборки
 * @author Dmitry Razumov
 * @version 1
 */
public class SortSelected {
    /**
     * Метод осуществляет сортировку массива по возрастанию. Используется метод выборки.
     * На первой итерации ищется минимальный элемент во всем массиве.
     * Затем определяется индекс этого элемента.
     * Найденный элемент меняется местами с первым элементом массива.
     * Затем снова ищется минимальный элемент, но уже исключая первый элемент и т.д.
     * @param data Массив который нужно отсортировать по возрастанию
     * @return Отсортированный по возрастанию массив
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            SwitchArray.swap(data, i, index);
        }
        return data;
    }
}
