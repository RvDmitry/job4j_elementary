package ru.job4j.pojo;

import java.util.Date;

/**
 * Class College
 * @author Dmitry Razumov
 * @version 1
 */
public class College {
    /**
     * Главный метод программы. Создает объект Student. С помощью аксессоров заполняет его поля и выводит на экран.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Петров Иван Алексеевич");
        student.setGroup("ТГ205");
        student.setDate(new Date());
        System.out.println(student.getFio() + " " + student.getGroup() + " " + student.getDate());
    }
}
