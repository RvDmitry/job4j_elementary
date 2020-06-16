package ru.job4j.collection;

import java.util.Comparator;

/**
 * Class SortByNameJob
 * @author Dmitry Razumov
 * @version 1
 */
public class SortByNameJob implements Comparator<Job> {
    /**
     * Метод сравнивает работы.
     * @param first Первая работа
     * @param second Вторая работа
     * @return Число, характеризующее итог сравнения
     */
    @Override
    public int compare(Job first, Job second) {
        return first.getName().compareTo(second.getName());
    }
}
