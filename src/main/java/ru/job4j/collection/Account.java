package ru.job4j.collection;

import java.util.Objects;

/**
 * Class Account
 * Класс описывает клиента банка.
 * @author Dmitry Razumov
 * @version 1
 */
public class Account {
    /**
     * Серия, номер паспорта.
     */
    private String passport;
    /**
     * ФИО.
     */
    private String username;
    /**
     * Номер счета.
     */
    private String deposit;

    /**
     * Конструтор инициализирует данные клиента.
     * @param passport Серия, номер паспорта
     * @param username ФИО
     * @param deposit Номер счета
     */
    public Account(String passport, String username, String deposit) {
        this.passport = passport;
        this.username = username;
        this.deposit = deposit;
    }

    /**
     * Метод сравнивает клиентов по паспортам.
     * @param o Аккаунт клиента
     * @return true, если клиент один и тот же, иначе false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(passport, account.passport);
    }

    /**
     * Метод вычисляет уникальный номер клиента.
     * @return Хеш-код клиента
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }

    /**
     * Метод возвращает информацию о клиенте в виде строки.
     * @return Строка
     */
    @Override
    public String toString() {
        return "Account{"
                + "passport='" + passport + '\''
                + ", username='" + username + '\''
                + ", deposit='" + deposit + '\''
                + '}';
    }
}
