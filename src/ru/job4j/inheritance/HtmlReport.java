package ru.job4j.inheritance;

/**
 * Class HtmlReport
 * @author Dmitry Razumov
 * @version 1
 */
public class HtmlReport extends TextReport {
    /**
     * Метод возвращает строку в формате HTML
     * @param name Заголовок
     * @param body Тело
     * @return Строка в HTML формате
     */
    public String generate(String name, String body) {
        return "<h1>" + name + "</h1>" + "<br/>" + "<span>" + body + "</span>";
    }
}
