package ru.job4j.ex;

/**
 * Class UserInvalidException
 * Класс генерирует пользовательское исключение, если у пользователя нет прав доступа.
 * @author Dmitry Razumov
 * @version 1
 */
public class UserInvalidException extends UserNotFoundException {
    /**
     * Конструктор генерирует пользовательское исключение.
     * @param message Сообщение об ошибке
     */
    public UserInvalidException(String message) {
        super(message);
    }
}
