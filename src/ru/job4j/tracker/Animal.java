package ru.job4j.tracker;

/**
 * Class Animal
 * @author Dmitry Razumov
 * @version 1.5
 */
public class Animal {
    /**
     * Поле name.
     */
    private String name;

    /**
     * Конструктор выводит сообщение на консоль.
     */
    public Animal() {
        System.out.println("Class Animal");
    }

    /**
     * Конструктор инициализирует поле name.
     * @param name Переменная name
     */
    public Animal(String name) {
        this.name = name;
    }
}
