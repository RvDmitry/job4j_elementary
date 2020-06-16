package ru.job4j.collection;

import java.util.*;

/**
 * Class Departments
 * Класс составляет список департаментов.
 * @author Dmitry Razumov
 * @version 1
 */
public class Departments {
    /**
     * Метод составляет список департаментов правильным образом,
     * заполняя отсутствующие наименования вышестоящих департаментов.
     * @param deps Список департаментов для проверки и исправления если необходимо
     * @return Правильно заполненный список департаментов
     */
    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new TreeSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                start += el;
                tmp.add(start);
                start += "/";
            }
        }
        return new ArrayList<>(tmp);
    }

    /**
     * Метод выполняет сортировку департаментов по возрастанию.
     * @param orgs Список департаментов
     */
    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    /**
     * Метод выполняет сортировку департаментов по убыванию.
     * Причем по убыванию сортируются только корневые департаменты.
     * Внутренние подразделения сортируются по возрастанию.
     * @param orgs Список департаментов
     */
    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
    }
}
