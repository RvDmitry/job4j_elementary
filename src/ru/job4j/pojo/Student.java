package ru.job4j.pojo;

import java.util.Date;

/**
 * Class Student
 * Класс содержит информацию о студенте.
 * @author Dmitry Razumov
 * @version 1
 */
public class Student {
    /**
     * Фамилия, Имя, Отчество студента.
     */
    private String fio;

    /**
     * Группа.
     */
    private String group;

    /**
     * Дата поступления.
     */
    private Date date;

    /**
     * Метод возвращает фамилию, имя, отчество.
     * @return ФИО
     */
    public String getFio() {
        return fio;
    }

    /**
     * Метод задает фамилию, имя, отчество.
     * @param fio ФИО
     */
    public void setFio(String fio) {
        this.fio = fio;
    }

    /**
     * Метод вовзвращает группу.
     * @return Группа
     */
    public String getGroup() {
        return group;
    }

    /**
     * Метод задает группу.
     * @param group Группа
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Метод вовзвращает дату поступления.
     * @return Дата
     */
    public Date getDate() {
        return date;
    }

    /**
     * Метод задает дату поступления.
     * @param date Дата
     */
    public void setDate(Date date) {
        this.date = date;
    }
}
