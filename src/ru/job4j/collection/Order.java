package ru.job4j.collection;

import java.util.Objects;

/**
 * Class Order
 * Класс описывает заказ.
 * @author Dmitry Razumov
 * @version 1
 */
public class Order {
    /**
     * Номер заказа.
     */
    private String number;
    /**
     * Наименование заказа.
     */
    private String name;

    /**
     * Конструктор создает заказ.
     * @param number Номер
     * @param name Наименование
     */
    public Order(String number, String name) {
        this.number = number;
        this.name = name;
    }

    /**
     * Метод возвращает номер заказа.
     * @return Номер
     */
    public String getNumber() {
        return number;
    }

    /**
     * Метод возвращает параметры заказа в виде строки
     * @return Строка
     */
    @Override
    public String toString() {
        return "Order{"
                + "number='" + number + '\''
                + ", name='" + name + '\''
                + '}';
    }

    /**
     * Метод сравнивает два заказа.
     * @param o Заказ
     * @return true, если заказ один и тот же, иначе false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return Objects.equals(number, order.number)
                && Objects.equals(name, order.name);
    }

    /**
     * Метод вычисляет хеш-код заказа.
     * @return Хеш-код
     */
    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }
}
