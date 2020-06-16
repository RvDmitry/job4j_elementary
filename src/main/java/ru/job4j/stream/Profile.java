package ru.job4j.stream;

/**
 * Class Profile
 * @author Dmitry Razumov
 * @version 1
 */
public class Profile {
    /**
     * Адрес клиента
     */
    private Address address;
    /**
     * ФИО клиента
     */
    private String fio;

    /**
     * Конструктор инициализирует данные клиента.
     * @param address Адрес
     */
    public Profile(Address address, String fio) {
        this.address = address;
        this.fio = fio;
    }

    /**
     * Метод возвращает адрес клиента.
     * @return Адрес
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Метод возвращает ФИО клиента.
     * @return ФИО
     */
    public String getFio() {
        return fio;
    }
}
