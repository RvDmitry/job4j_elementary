package ru.job4j.collection;

import java.util.Comparator;

/**
 * Class JobDescByName
 * Класс осуществляет сортировку по наименованию работы по убыванию.
 * @author Dmitry Razumov
 * @version 1
 */
public class JobDescByName implements Comparator<Job> {
    /**
     * Метод сравнивает две работы по имени.
     * Для сортировки по убыванию второй объект сравнивается с первым.
     * @param o1 Первая работа
     * @param o2 Вторая работа
     * @return Число, характеризующее результат сравнения
     */
    @Override
    public int compare(Job o1, Job o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
