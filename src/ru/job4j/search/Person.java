package ru.job4j.search;

/**
 * Class Person
 * Класс характеризует пользователя.
 * @author Dmitry Razumov
 * @version 1
 */
public class Person {
    /**
     * Поле задает имя
     */
    private String name;

    /**
     * Поле задает фамилию.
     */
    private String surname;

    /**
     * Поле задает номер телефона.
     */
    private String phone;

    /**
     * Поле задает адрес.
     */
    private String address;

    /**
     * Конструктор создает начальные значения полей.
     * @param name Имя
     * @param surname Фамилия
     * @param phone Телефон
     * @param address Адрес
     */
    public Person(String name, String surname, String phone, String address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
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
     * Метод возвращает номер телефона.
     * @return Телефон
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Метод возвращает адрес.
     * @return Адрес
     */
    public String getAddress() {
        return address;
    }
}
