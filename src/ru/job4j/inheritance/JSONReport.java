package ru.job4j.inheritance;

/**
 * Class JSONReport
 * @author Dmitry Razumov
 * @version 1
 */
public class JSONReport extends TextReport {
    /**
     * Метод возвращает строку в формате JSON
     * @param name Заголовок
     * @param body Тело
     * @return Строка в JSON формате
     */
    public String generate(String name, String body) {
        return "{\n\"name\" : " + '"' + name + "\","
                + "\n\"body\" : " + '"' + body + "\"\n}";
    }
}
