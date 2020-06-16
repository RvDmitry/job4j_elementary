package ru.job4j.encapsulation;

/**
 * Class Account
 * Класс для хранения информации о счета клиента
 * @author Dmitry Razumov
 * @version 1
 */
public class Account {
    /**
     * Баланс счета.
     */
    private int balance;

    /**
     * Метод увеличивает баланс счета.
     * @param money Деньги
     */
    public void addMoney(int money) {
        if (money > 0) {
            balance += money;
        }
    }
}
