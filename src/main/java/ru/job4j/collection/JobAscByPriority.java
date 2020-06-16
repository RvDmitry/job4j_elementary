package ru.job4j.collection;

import java.util.Comparator;

/**
 * Class JobAscByPriority
 * Класс осуществляет сортировку по приоритету работы по возрастанию.
 * @author Dmitry Razumov
 * @version 1
 */
public class JobAscByPriority implements Comparator<Job> {
    /**
     * Метод сравнивает две работы по приоритету.
     * Для сортировки по возрастанию первый объект сравнивается со вторым.
     * @param o1 Первая работа
     * @param o2 Вторая работа
     * @return Число, характеризующее результат сравнения
     */
    @Override
    public int compare(Job o1, Job o2) {
        return Integer.compare(o1.getPriority(), o2.getPriority());
    }
}
