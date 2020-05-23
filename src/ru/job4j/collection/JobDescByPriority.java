package ru.job4j.collection;

import java.util.Comparator;

/**
 * Class JobDescByPriority
 * Класс осуществляет сортировку по приоритету работы по убыванию.
 * @author Dmitry Razumov
 * @version 1
 */
public class JobDescByPriority implements Comparator<Job> {
    /**
     * Метод сравнивает две работы по приоритету.
     * Для сортировки по убыванию второй объект сравнивается с первым.
     * @param o1 Первая работа
     * @param o2 Вторая работа
     * @return Число, характеризующее результат сравнения
     */
    @Override
    public int compare(Job o1, Job o2) {
        return Integer.compare(o2.getPriority(), o1.getPriority());
    }
}
