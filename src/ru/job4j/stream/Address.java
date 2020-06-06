package ru.job4j.stream;

/**
 * Class Address
 * Класс характеризует адрес клиента.
 * @author Dmitry Razumov
 * @version 1
 */
public class Address {
    /**
     * Город
     */
    private String city;
    /**
     * Улица
     */
    private String street;
    /**
     * Номер дома
     */
    private int home;
    /**
     * Номер квартиры
     */
    private int apartment;

    /**
     * Конструктор инициализирует адрес клиента.
     * @param city Город
     * @param street Улица
     * @param home Дом
     * @param apartment Квартира
     */
    public Address(String city, String street, int home, int apartment) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.apartment = apartment;
    }

    /**
     * Метод возвращает название города.
     * @return Город
     */
    public String getCity() {
        return city;
    }

    /**
     * Метод возвращает название улицы.
     * @return Улица
     */
    public String getStreet() {
        return street;
    }

    /**
     * Метод возвращает номер дома.
     * @return Дом
     */
    public int getHome() {
        return home;
    }

    /**
     * Метод возвращает номер квартиры.
     * @return Квартира
     */
    public int getApartment() {
        return apartment;
    }

    /**
     * Метод возвращает адрес в виде строки.
     * @return Строка
     */
    @Override
    public String toString() {
        return "Address{" + "city='" + city + '\'' + ", street='" + street
                + '\'' + ", home=" + home + ", apartment=" + apartment + '}';
    }
}
