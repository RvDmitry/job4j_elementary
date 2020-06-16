package ru.job4j.inheritance;

/**
 * Class TextReport
 * @author Dmitry Razumov
 * @version 1
 */
public class TextReport {
    /**
     * Метод возвращает строку
     * @param name Заголовок
     * @param body Тело
     * @return Строка
     */
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }
}
