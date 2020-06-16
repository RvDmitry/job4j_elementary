package ru.job4j.tracker;

/**
 * Class Item
 * В классе практикуется использование наследования.
 * @author Dmitry Razumov
 * @version 1.5
 */
public class Item {

    /**
     * Конструктор заменяет конструктор по умолчанию и требует передачи параметра.
     * @param name Переменная name
     */
    public Item(String name) {
    }

    /**
     * Главный метод программы.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        Item item = new Item("name");
    }
}
