package ru.job4j.bank;

import java.util.Objects;

/**
 * Class User
 * Класс описывает пользователя банка.
 * @author Dmitry Razumov
 * @version 1
 */
public class User {
    /**
     * Номер паспорта.
     */
    private String passport;
    /**
     * ФИО.
     */
    private String username;

    /**
     * Конструктор инициализирует данные пользователя банка.
     * @param passport Паспорт
     * @param username ФИО
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод возвращает номер паспорта.
     * @return Паспорт
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод задает номер паспорта.
     * @param passport Паспорт
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод возвращает ФИО.
     * @return ФИО
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод задает ФИО.
     * @param username ФИО
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Метод сравнивает двух пользователей банка.
     * @param o Пользователь банка
     * @return true, если пользователь один и тот же, иначе false
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
        return Objects.equals(passport, user.passport);
    }

    /**
     * Метод вычисляет хеш-код пользователя банка.
     * @return Хеш-код
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
