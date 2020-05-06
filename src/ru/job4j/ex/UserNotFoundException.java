package ru.job4j.ex;

/**
 * Class UserNotFoundException
 * Класс генерирует пользовательское исключение, если пользователь не найден.
 * @author Dmitry Razumov
 * @version 1
 */
public class UserNotFoundException extends Exception {
    /**
     * Конструктор генерирует пользовательское исключение.
     * @param message Сообщение об ошибке
     */
    public UserNotFoundException(String message) {
        super(message);
    }
}
