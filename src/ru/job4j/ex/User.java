package ru.job4j.ex;

/**
 * Class User
 * Класс характеризует пользователя.
 * @author Dmitry Razumov
 * @version 1
 */
public class User {
    /**
     * Поле задает имя пользователя.
     */
    private String username;

    /**
     * Поле определяет статус доступа у пользователя.
     */
    private boolean valid;

    /**
     * Конструктор инициализирует пользователя.
     * @param username Имя пользователя
     * @param valid Статус доступа пользователя
     */
    public User(String username, boolean valid) {
        this.username = username;
        this.valid = valid;
    }

    /**
     * Метод возвращает имя пользователя.
     * @return Имя пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод возвращает статус доступа пользователя.
     * @return Статус доступа пользователя
     */
    public boolean isValid() {
        return valid;
    }
}
