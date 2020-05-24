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
        int min = Math.min(left.length(), right.length());
        for (int i = 0; i < min; i++) {
            int res = Character.compare(left.charAt(i), right.charAt(i));
            if (res != 0) {
                return res;
            }
        }
        return left.length() - right.length();
    }
}
