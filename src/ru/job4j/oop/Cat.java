package ru.job4j.oop;

/**
 * Class Cat
 * В классе практикуется создание объектов класса и вызов его метода.
 * @author Dmitry Razumov
 * @version 1
 */
public class Cat {
    /**
     * Метод возвращает стороку.
     * @return Строка
     */
    public String sound() {
        String voice = "may-may";
        return voice;
    }

    /**
     * Главный метод программы. В методе создаются экземпляры класса Cat и вызывается его метод.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        Cat peppy = new Cat();
        Cat sparky = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says " + say);
    }
}
