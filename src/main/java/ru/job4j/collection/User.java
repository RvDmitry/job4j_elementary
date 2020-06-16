package ru.job4j.collection;

import java.util.Objects;

/**
 * Class User
 * Класс описывает пользователя.
 * @author Dmitry Razumov
 * @version 1
 */
public class User implements Comparable<User> {
    /**
     * Имя.
     */
    private String name;
    /**
     * Возраст.
     */
    private int age;

    /**
     * Конструктор создает пользователя.
     * @param name Имя
     * @param age Возраст
     */
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Метод осуществляет сравнение пользователей.
     * Пользователи сравниваются по именам. Если имена одинаковые, то сравнивается возраст.
     * @param o Пользователь
     * @return Число, характеризующее итог сравнения
     */
    @Override
    public int compareTo(User o) {
        int res = this.name.compareTo(o.name);
        return res == 0 ? Integer.compare(this.age, o.age) : res;
    }

    /**
     * Метод проверяет, один и тот же это пользователь или другой.
     * @param o ПОльзователь
     * @return true, если пользователь тот же самый, инача false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    /**
     * Метод вычисляет хеш-код кользователя.
     * @return Хеш-код
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
