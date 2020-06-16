package ru.job4j.tracker;

/**
 * Class Tiger
 * Класс демонстрирует наследование классов.
 * @author Dmitry Razumov
 * @version 1.5
 */
public class Tiger extends Predator {
    /**
     * Конструктор выводит сообщение на консоль.
     */
    public Tiger() {
        System.out.println("Class Tiger");
    }

    /**
     * Конструктор передает конструктору класса предка переменную.
     * @param name Переменная name
     */
    public Tiger(String name) {
        super(name);
    }

    /**
     * Главный метод программы. Создает объект класса Tiger.
     * В результате наследования конструкторы выводят сообщения на экран.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Name");
    }
}
