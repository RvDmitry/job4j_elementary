package ru.job4j.lambda;

import java.util.Objects;

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

    /**
     * Метод сравнивает два объекта Attachment.
     * @param o Объект Attachment
     * @return true, если объекты равны, иначе false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Attachment that = (Attachment) o;
        return size == that.size && Objects.equals(name, that.name);
    }

    /**
     * Метод вычисляет хеш-код объета Attachment.
     * @return Хеш-код
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }
}
