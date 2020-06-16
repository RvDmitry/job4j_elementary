package ru.job4j.collection;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * Class TreeSort
 * В классе практикуется работа с коллекцией TreeSort.
 * @author Dmitry Razumov
 * @version 1
 */
public class TreeSort {
    /**
     * Главный метод программы.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>(Collections.reverseOrder());
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        System.out.println(numbers);
    }
}
