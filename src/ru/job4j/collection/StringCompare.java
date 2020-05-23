package ru.job4j.collection;

import java.util.Comparator;

/**
 * Class StringCompare
 * Класс сравнивает строки.
 * @author Dmitry Razumov
 * @version 1
 */
public class StringCompare implements Comparator<String> {
    /**
     * Метод осуществляет сравнение двух строк.
     * @param left Первая строка
     * @param right Вторая строка
     * @return Число, характеризующее результат сравнения
     */
    @Override
    public int compare(String left, String right) {
        int i = 0;
        int res = 0;
        while (res == 0 && i < left.length() && i < right.length()) {
            res = Character.compare(left.charAt(i), right.charAt(i));
            i++;
        }
        if (res == 0 && left.length() < right.length()) {
            while (i < right.length()) {
                res--;
                i++;
            }
        }
        if (res == 0 && left.length() > right.length()) {
            while (i < left.length()) {
                res++;
                i++;
            }
        }
        return res;
    }
}
