package ru.job4j.pojo;

/**
 * Class Product
 * Класс характеризует продукт.
 * @author Dmitry Razumov
 * @version 1
 */
public class Product {
    /**
     * Наименование продукта.
     */
    private String name;

    /**
     * Количество продукта.
     */
    private int count;

    /**
     * Конструктор инициализирует продукт.
     * @param name Наименование
     * @param count Количество
     */
    public Product(String name, int count) {
        this.name = name;
        this.count = count;
    }

    /**
     * Метод возвращает наименование продукта.
     * @return Наименование
     */
    public String getName() {
        return name;
    }

    /**
     * Метод задет наименование продукта.
     * @param name Наименование
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Метод возвращает количество продукта.
     * @return Количество
     */
    public int getCount() {
        return count;
    }

    /**
     * Метод задает количество продукта.
     * @param count Количество
     */
    public void setCount(int count) {
        this.count = count;
    }
}
