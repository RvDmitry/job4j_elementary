package ru.job4j.tracker;

/**
 * Class Predator
 * @author Dmitry Razumov
 * @version 1.5
 */
public class Predator extends Animal {
    /**
     * Конструктор выводит сообщение на консоль.
     */
    public Predator() {
        System.out.println("Class Predator");
    }

    /**
     * Конструктор передает конструктору класса предка переменную.
     * @param name Переменная name
     */
    public Predator(String name) {
        super(name);
    }
}
