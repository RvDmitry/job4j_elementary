package ru.job4j.pojo;

/**
 * Class ProductContains
 * @author Dmitry Razumov
 * @version 1
 */
public class ProductContains {
    /**
     * Главный метод программы. Демонстрирует сравнение объектов.
     * @param args Параметры командно строки
     */
    public static void main(String[] args) {
        Product first = new Product("Milk", 100);
        Product second = new Product("Milk", 100);
        boolean eq = first.equals(second);
        System.out.println(eq);
    }
}
