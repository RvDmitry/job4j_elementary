package ru.job4j.tracker;

/**
 * Class Tiger
 * Класс демонстрирует наследование классов.
 * @author Dmitry Razumov
 * @version 1
 */
public class Tiger extends Predator {
    /**
     * Конструктор выводит сообщение на консоль.
     */
    public Tiger() {
        super();
        System.out.println("Class Tiger");
    }

    /**
     * Главный метод программы. Создает объект класса Tiger.
     * В результате наследования конструкторы выводят сообщения на экран.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
    }
}
