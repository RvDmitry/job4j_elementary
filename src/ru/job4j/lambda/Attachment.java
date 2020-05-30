package ru.job4j.lambda;

/**
 * Class Attachment
 * @author Dmitry Razumov
 * @version 1
 */
public class Attachment {
    /**
     * Наименование вложения.
     */
    private String name;
    /**
     * Размер вложения.
     */
    private int size;

    /**
     * Конструтор задает наименование и размер вложения.
     * @param name Наименование
     * @param size Размер
     */
    public Attachment(String name, int size) {
        this.name = name;
        this.size = size;
    }

    /**
     * Метод возвращает наименование.
     * @return Наименование
     */
    public String getName() {
        return name;
    }

    /**
     * Метод возвращает размер.
     * @return Размер
     */
    public int getSize() {
        return size;
    }

    /**
     * Метод возвращает параметры вложение в виде строки.
     * @return Строка
     */
    @Override
    public String toString() {
        return "{" + "name='" + name + '\'' + ", size=" + size + '}';
    }
}
