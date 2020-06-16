package ru.job4j.pojo;

import java.util.Date;

/**
 * Class
 * @author Dmitry Razumov
 * @version 1
 */
public class Police {
    /**
     * Главный метод программы. С помощью аксессоров задает свойства объекта и выводит их на экран.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Petr Arsentev");
        license.setModel("Toyota");
        license.setCode("xx111x");
        license.setCreated(new Date());
        System.out.println(license.getOwner() + " has a car - " + license.getModel() + " : " + license.getCode());
    }
}
