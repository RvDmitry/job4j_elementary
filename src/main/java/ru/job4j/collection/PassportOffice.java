package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Class PassportOffice
 * @author Dmitry Razumov
 * @version 1
 */
public class PassportOffice {
    /**
     * Коллекция граждан.
     */
    private Map<String, Citizen> citizens = new HashMap<>();

    /**
     * Метод добавляет гражданина в коллекцию.
     * Если данный гражданин есть в коллекции, то добавления не происходит.
     * @param citizen Гражданин
     * @return true, если добавление прошло успешно, иначе false
     */
    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);
            rsl = true;
        }
        return rsl;
    }

    /**
     * Метод возвращает данные гражданина по его паспорту.
     * @param passport Паспорт
     * @return Гражданин
     */
    public Citizen get(String passport) {
        return citizens.get(passport);
    }
}
