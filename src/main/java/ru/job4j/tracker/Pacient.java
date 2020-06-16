package ru.job4j.tracker;

/**
 * Class Pacient
 * Класс описывает пациента.
 * @author Dmitry Razumov
 * @version 1
 */
public class Pacient {
    /**
     * Имя.
     */
    private String name;

    /**
     * Фамилиия.
     */
    private String surname;

    /**
     * Возраст.
     */
    private String age;

    /**
     * Конструктор инициализирует информацию о пациенте.
     * @param name Имя
     * @param surname Фамилия
     * @param age Возраст
     */
    public Pacient(String name, String surname, String age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

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
     * Метод возвращает возраст.
     * @return Возраст
     */
    public String getAge() {
        return age;
    }
}
