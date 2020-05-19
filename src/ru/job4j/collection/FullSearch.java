package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/**
 * Class FullSearch
 * Класс осущестлвяет поиск по списку.
 * @author Dmitry Razumov
 * @version 1
 */
public class FullSearch {
    /**
     * Метод извлекает уникальные номера задач из списка и возвращает их в виде коллекции.
     * @param list Список задач
     * @return Коллекция задач с уникальными номерами
     */
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task task : list) {
            numbers.add(task.getNumber());
        }
        return numbers;
    }
}
