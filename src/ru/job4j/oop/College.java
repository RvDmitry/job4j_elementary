package ru.job4j.oop;

/**
 * Class College
 * @author Dmitry Razumov
 * @version 1
 */
public class College {
    /**
     * Главный метод программы. В методе практикуется приведение типов.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        Freshman tom = new Freshman();
        Student student = tom;
        Object obj = tom;
    }
}
