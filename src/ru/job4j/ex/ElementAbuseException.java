package ru.job4j.ex;

/**
 * Class ElementAbuseException
 * Класс генерирует пользовательское исключение, если элемент в списке запрещенных.
 * @author Dmitry Razumov
 * @version 1
 */
public class ElementAbuseException extends ElementNotFoundException {
    /**
     * Конструктор генерирует пользовательское исключение.
     * @param message Сообщение об ошибке
     */
    public ElementAbuseException(String message) {
        super(message);
    }
}
