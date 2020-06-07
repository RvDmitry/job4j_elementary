package ru.job4j.bank;

import java.util.*;

/**
 * Class BankService
 * Класс описывает банковский сервис.
 * @author Dmitry Razumov
 * @version 1
 */
public class BankService {
    /**
     * Поле содержит карту пользователей банка.
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя в карту.
     * @param user Пользователь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод добавляет банковский счет для заданного пользователя.
     * @param passport Паспорт пользователя
     * @param account Банковский счет
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод осуществляет поиск пользователя банка.
     * @param passport Паспорт пользователя
     * @return Пользователь банка
     */
    public User findByPassport(String passport) {
        return users.keySet().stream()
                .filter(u -> u.getPassport().equals(passport))
                .findFirst().orElse(null);
    }

    /**
     * Метод осуществляет поиск счета для заданного пользователя.
     * @param passport Паспорт
     * @param requisite Реквизиты счета
     * @return Счет
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            return accounts.stream().filter(a -> a.getRequisite().equals(requisite))
                    .findFirst().orElse(null);
        }
        return null;
    }

    /**
     * Метод осуществялет перевод денежных средств со счета одного пользователя на счет другого.
     * Либо перевод осуществляется с одного счета на другой счет для заданного пользователя.
     * @param srcPassport Паспорт пользователя со счета которого нужно сделать перевод
     * @param srcRequisite Реквизиты счета заданного пользователя
     * @param destPassport Паспорт пользователя на счет которого нужно сделать перевод
     * @param destRequisite Реквизиты счета пользователя получателя денежных средств
     * @param amount Количество денежных средст которон нужно перевести
     * @return true, если перевод осуществлен успешно, иначе false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account src = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(destPassport, destRequisite);
        if (src != null && src.getBalance() >= amount && dest != null) {
            src.setBalance(src.getBalance() - amount);
            dest.setBalance(dest.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
