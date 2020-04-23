package ru.job4j.encapsulation;

/**
 * Class Config
 * @author Dmitry Razumov
 * @version 1
 */
public class Config {
    /**
     * Name
     */
    private String name;

    /**
     * Position
     */
    private int position;

    /**
     * Массив свойств
     */
    private String[] properties;

    /**
     * Конструктор - инициализирует переменную name
     * @param name Name
     */
    public Config(String name) {
        this.name = name;
    }

    /**
     * Метод выводит переменную position на экран.
     */
    public void print() {
        System.out.println(position);
    }

    /**
     * Метод возвращает свойство по ключу.
     * @param key Ключ
     * @return Свойство
     */
    public String getProperty(String key) {
        return search(key);
    }

    /**
     * Метод осуществляет поиск по ключу.
     * @param key Ключ
     * @return key Ключ
     */
    private String search(String key) {
        return key;
    }
}
