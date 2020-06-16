package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

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
        Predicate<Person> preName = person -> person.getName().contains(key);
        Predicate<Person> preSurname = person -> person.getSurname().contains(key);
        Predicate<Person> preAddress = person -> person.getAddress().contains(key);
        Predicate<Person> prePhone = person -> person.getPhone().contains(key);
        Predicate<Person> combine = preName.or(preSurname).or(preAddress).or(prePhone);
        var result = new ArrayList<Person>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
