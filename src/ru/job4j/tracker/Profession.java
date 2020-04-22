package ru.job4j.tracker;

import java.time.LocalDate;

/**
 * Class Profession
 * @author Dmitry Razumov
 * @version 1
 */
public class Profession {
    /**
     * Имя.
     */
    private String name;

    /**
     * Фамилия.
     */
    private String surname;

    /**
     * Образование.
     */
    private String education;

    /**
     * Дата рождения.
     */
    private LocalDate birthday;

    /**
     * Метод возвращает имя.
     * @return Имя
     */
    public String getName() {
        return name;
    }

    /**
     * Метод возвращает фамилию.
     * @return Фамилия
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Метод возвращает образование.
     * @return Образование
     */
    public String getEducation() {
        return education;
    }

    /**
     * Метод возвращает дату рождения.
     * @return Дата рождения
     */
    public LocalDate getBirthday() {
        return birthday;
    }

    /**
     * Метод задает имя специалиста.
     * @param name Имя
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Метод задает фамилию специалиста.
     * @param surname Фамилия
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Метод задает образование специалиста.
     * @param education Образование
     */
    public void setEducation(String education) {
        this.education = education;
    }

    /**
     * Метод задает дату рождения специалиста.
     * @param birthday Дата
     */
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
