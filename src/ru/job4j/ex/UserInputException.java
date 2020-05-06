package ru.job4j.ex;

/**
 * Class UserInputException
 * Класс генерирует пользовательские исключения.
 * @author Dmitry Razumov
 * @version 1
 */
public class UserInputException extends Exception {
    /**
     * Конструктор служит для генерации исключений пользователя.
     * @param message Сообщение об ошибке
     */
    public UserInputException(String message) {
        super(message);
    }
}
