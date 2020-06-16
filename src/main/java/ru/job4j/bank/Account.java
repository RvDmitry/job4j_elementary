package ru.job4j.bank;

import java.util.Objects;

/**
 * Class Account
 * Класс описывает банковский счет.
 * @author Dmitry Razumov
 * @version 1
 */
public class Account {
    /**
     * Реквизиты счета.
     */
    private String requisite;
    /**
     * Баланс счета.
     */
    private double balance;

    /**
     * Конструктор инициализирует реквизиты счета и задает баланс счета.
     * @param requisite Реквизиты
     * @param balance Баланс
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод возвращает реквизиты счета.
     * @return Реквизиты
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод задает реквизиты счета.
     * @param requisite Реквизиты
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод возвращает баланс счета.
     * @return Баланс
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод задает баланс счета.
     * @param balance Баланс
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Метод сравниват два счета.
     * @param o Банковский счет
     * @return true, если счет один и тот же, иначе false
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
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Метод вычисляет хеш-код счета.
     * @return Хеш-код
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
