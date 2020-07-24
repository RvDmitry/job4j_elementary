package ru.job4j.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class CrossArray
 * Класс выводит на консоль числа, которые есть одновременно в первом и втором массиве.
 * @author Dmitry Razumov
 * @version 1
 */
public class CrossArray {
    /**
     * Метод выводит на консоль числа, которые есть одновременно в первом и втором массиве.
     * @param left Первый массив
     * @param right Второй массив
     */
    public static void printCrossEl(int[] left, int[] right) {
        List<Integer> first = Arrays.stream(left).boxed().collect(Collectors.toList());
        List<Integer> second = Arrays.stream(right).boxed().collect(Collectors.toList());
        first.retainAll(second);
        first.forEach(System.out::println);
    }

    /**
     * Главный метод программы.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        int[] first = {1, 2, 3, 5};
        int[] second = {2, 3, 4, 6};
        printCrossEl(first, second);
    }
}
