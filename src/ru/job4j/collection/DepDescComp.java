package ru.job4j.collection;

import java.util.Comparator;

/**
 * Class DepDescComp
 * Класс сортирует корневые департаменты по убыванию.
 * Причем внутренние подразделения сортируются по возрастанию.
 * @author Dmitry Razumov
 * @version 1
 */
public class DepDescComp implements Comparator<String> {
    /**
     * Метод выполняет сортировку корневых департаментов по убыванию.
     * Внутренние подразделения департаментов сортируются по возрастанию.
     * @param o1 Первый департамент
     * @param o2 Второй департамент
     * @return Число, характеризующее результат сравнения
     */
    @Override
    public int compare(String o1, String o2) {
        String[] first = o1.split("/");
        String[] second = o2.split("/");
        int res = second[0].compareTo(first[0]);
        return res == 0 ? o1.compareTo(o2) : res;
    }
}
