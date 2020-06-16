package ru.job4j.collection;

import java.util.Comparator;

/**
 * Class JobAscByName
 * Класс осуществляет сортировку по наименованию работы по возрастанию.
 * @author Dmitry Razumov
 * @version 1
 */
public class JobAscByName implements Comparator<Job> {
    /**
     * Метод сравнивает две работы по имени.
     * Для сортировки по возрастанию первый объект сравнивается со вторым.
     * @param o1 Первая работа
     * @param o2 Вторая работа
     * @return Число, характеризующее результат сравнения
     */
    @Override
    public int compare(Job o1, Job o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
