package ru.job4j.collection;

import java.util.Objects;

/**
 * Class Citizen
 * Класс описывает гражданина.
 * @author Dmitry Razumov
 * @version 1
 */
public class Citizen {
    /**
     * Паспорт гражданина.
     */
    private String passport;
    /**
     * ФИО гражданина.
     */
    private String username;

    /**
     * Конструктор инициализирует данные гражданина.
     * @param passport Паспорт
     * @param username ФИО
     */
    public Citizen(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод возвращает данные паспорта.
     * @return Паспорт
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод возвращает ФИО.
     * @return ФИО
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод сравнивает граждан.
     * @param o Гражданин
     * @return true, если гражданиин тот же самый, иначе false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Citizen citizen = (Citizen) o;
        return Objects.equals(passport, citizen.passport);
    }

    /**
     * Метод вычисляет уникальный код гражданина по его паспорту.
     * @return Хеш-код
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
