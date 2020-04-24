package ru.job4j.pojo;

/**
 * Class Book
 * Класс характеризует книгу.
 * @author Dmitry Razumov
 * @version 1
 */
public class Book {
    /**
     * Наименование книги.
     */
    private String name;

    /**
     * Количество страниц в книге.
     */
    private int count;

    /**
     * Конструктор инициализирует книгу.
     * @param name Наименование книги
     * @param count Количество страниц
     */
    public Book(String name, int count) {
        this.name = name;
        this.count = count;
    }

    /**
     * Метод возвращает наименование книги.
     * @return Наименование
     */
    public String getName() {
        return name;
    }

    /**
     * Метод задет наименование книги.
     * @param name Наименование
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Метод возвращает количество страниц.
     * @return Количество
     */
    public int getCount() {
        return count;
    }

    /**
     * Метод задает количество страниц.
     * @param count Количество
     */
    public void setCount(int count) {
        this.count = count;
    }
}
