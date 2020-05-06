package ru.job4j.ex;

/**
 * Class ElementNotFoundException
 * Класс генерирует пользовательские исключения.
 * @author Dmitry Razumov
 * @version 1
 */
public class ElementNotFoundException extends Exception {
    /**
     * Конструктор служит для генерации исключений пользователя.
     * @param message Сообщение об ошибке
     */
    public ElementNotFoundException(String message) {
        super(message);
    }
}
