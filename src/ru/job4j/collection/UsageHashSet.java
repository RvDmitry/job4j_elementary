package ru.job4j.collection;

import java.util.HashSet;

/**
 * Class UsageHashSet
 * В классе практикует работа с коллекцией Set.
 * @author Dmitry Razumov
 * @version 1
 */
public class UsageHashSet {
    /**
     * Главный метод программы. Метод создает коллекцию Set и выводит ее на консоль.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<String>();
        autos.add("Lada");
        autos.add("BMW");
        autos.add("Volvo");
        autos.add("Toyota");
        for (String auto: autos) {
            System.out.println(auto);
        }
    }
}
