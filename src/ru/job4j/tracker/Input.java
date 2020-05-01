package ru.job4j.tracker;

/**
 * Interface Input
 * Интерфейс определяет работу класса по получению данных от пользователя в консоли.
 * @author Dmitry Razumov
 * @version 1
 */
public interface Input {
    /**
     * Метод возвращает введенную строку от пользователя.
     * @param question Строка которую ввел пользователь
     * @return Строка введенная пользователем
     */
    String askStr(String question);

    /**
     * Метод возвращает введенное число от пользователя.
     * @param question Строка которую ввел пользователь
     * @return Число которое ввел пользователь
     */
    int askInt(String question);
}
