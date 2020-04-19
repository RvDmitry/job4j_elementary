package ru.job4j.oop;

/**
 * Class Student
 * В классе практикуется создание и вызов экземпляра класса.
 * @author Dmitry Razumov
 * @version 1
 */
public class Student {
    /**
     * Метод выводит на консоль строку.
     */
    public void music() {
        System.out.println("Tra tra tra");
    }

    /**
     * Метод выводит на консоль строку.
     */
    public void song() {
        System.out.println("I believe I can fly");
    }

    /**
     * Главный метод программы. Создает объект класса Student и вызывает его методы.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.song();
        petya.song();
        petya.song();
    }
}
