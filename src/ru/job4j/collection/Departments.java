package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

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
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                start += el;
                tmp.add(start);
                start += "/";
            }
        }
        List<String> rsl = new ArrayList<>(tmp);
        sortAsc(rsl);
        return rsl;
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
