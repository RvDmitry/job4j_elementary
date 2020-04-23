package ru.job4j.encapsulation;

/**
 * Class ATM
 * @author Dmitry Razumov
 * @version 1
 */
public class ATM {
    /**
     * Главный метод программы.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        Account account = new Account();
        account.addMoney(100);
        account.addMoney(50);
    }
}
