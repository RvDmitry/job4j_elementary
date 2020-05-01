package ru.job4j.oop;

/**
 * Class HierarchyUsage
 * Класс демонстрирует приведение типов.
 * @author Dmitry Razumov
 * @version 1
 */
public class HierarchyUsage {
    /**
     * Главный метод программы. В методо демонтсрирует приведение типов, повышающее и понижающее.
     * А также демонстрируется ошибочное приведение типов. А именно, приведение типа Bicycle к типу Car.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        Car car = new Car();
        Transport tp = car;
        Object obj = car;
        Object ocar = new Car();
        Car carFromObject = (Car) ocar;
        Object bicycle = new Bicycle();
        Car cb = (Car) bicycle;
    }
}
