package ru.job4j.poly;

/**
 * Interface Store
 * @author Dmitry Razumov
 * @version 1
 */
public interface Store {
    /**
     * Метод save.
     * @param value Строка
     */
    void save(String value);

    /**
     * Метод load.
     * @return Массив строк
     */
    String[] load();
}
