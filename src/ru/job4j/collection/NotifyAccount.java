package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/**
 * Class NotifyAccount
 * @author Dmitry Razumov
 * @version 1
 */
public class NotifyAccount {
    /**
     * Метод возвращает коллекцию уникальных клиентов банка.
     * @param accounts Список клиентов банка
     * @return Список, в котором содержатся уникальные данные о клиентах
     */
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<>();
        for (Account account : accounts) {
            rsl.add(account);
        }
        return rsl;
    }
}
