package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Class Profiles
 * @author Dmitry Razumov
 * @version 1
 */
public class Profiles {
    /**
     * Метод возвращает список адресов клиентов.
     * @param profiles Список профилей
     * @return Список адресов
     */
    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(Profile::getAddress).collect(Collectors.toList());
    }
}
