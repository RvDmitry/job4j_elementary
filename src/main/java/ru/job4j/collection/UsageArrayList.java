package ru.job4j.collection;

import java.util.ArrayList;

/**
 * Class UsageArrayList
 * В классе практикуется работа с коллекцией.
 * @author Dmitry Razumov
 * @version 1
 */
public class UsageArrayList {
    /**
     * Главный метод программы.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Petr");
        names.add("Ivan");
        names.add("Stepan");
        for (Object value : names) {
            System.out.println(value);
        }
    }
}
