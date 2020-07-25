package ru.job4j.sort;

import java.util.Arrays;

/**
 * Class Merge
 * Класс соединяет два массива в один.
 * @author Dmitry Razumov
 * @version 1
 */
public class Merge {
    /**
     * Метод осуществляет слияние двух упорядоченных по возрастанию массивов в один массив.
     * @param left Первый массив
     * @param right Второй массив
     * @return Упорядоченный по возрастанию массив
     */
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        while (i < left.length && j < right.length) {
            rsl[i + j] = left[i] < right[j] ? left[i++] : right[j++];
        }
        while (i < left.length) {
            rsl[i + j] = left[i++];
        }
        while (j < right.length) {
            rsl[i + j] = right[j++];
        }
        return rsl;
    }

    /**
     * Главный метод программы. Вызывает метод merge передавая ему два массива.
     * Результат работы метода выводит на консоль.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
