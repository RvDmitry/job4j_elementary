package ru.job4j.tracker;

/**
 * Class Item
 * В классе практикуется использование наследования.
 * @author Dmitry Razumov
 * @version 1
 */
public class Item {
    /**
     * Конструктор выводит сообщение на экран.
     */
    public Item() {
        super();
        System.out.println("load item");
    }

    /**
     * Главный метод программы. Создается объект потомок класса Item.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        Bug bug = new Bug();
    }
}
