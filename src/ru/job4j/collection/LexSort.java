package ru.job4j.collection;

import java.util.Comparator;

/**
 * Class LexSort
 * Класс сортирует наименование разделов лекции по их номерам.
 * @author Dmitry Razumov
 * @version 1
 */
public class LexSort implements Comparator<String> {
    /**
     * Метод осуществляет сравнение наименований разделов по их номерам.
     * @param left Первый раздел
     * @param right Второй раздел
     * @return Число, характеризующее результат сравнения
     */
    @Override
    public int compare(String left, String right) {
        int diff = left.length() - right.length();
        return diff == 0 ? left.compareTo(right) : diff;
    }
}
