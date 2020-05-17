package ru.job4j.search;

import java.util.ArrayList;

/**
 * Class PhoneDictionary
 * Класс определяет телефонный справочник.
 * @author Dmitry Razumov
 * @version 1
 */
public class PhoneDictionary {
    /**
     * Список пользователей
     */
    private ArrayList<Person> persons = new ArrayList<Person>();

    /**
     * Метод добавляет пользователя в список.
     * @param person Пользователь
     */
    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, которые содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подошедших пользователей.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (var item : persons) {
            if (item.getName().contains(key) || item.getSurname().contains(key)
                    || item.getPhone().contains(key) || item.getAddress().contains(key)) {
                result.add(item);
            }
        }
        return result;
    }
}
