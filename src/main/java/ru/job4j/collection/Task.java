package ru.job4j.collection;

/**
 * Class Task
 * Класс описывает задачу.
 * @author Dmitry Razumov
 * @version 1
 */
public class Task {
    /**
     * Номер задачи.
     */
    private String number;
    /**
     * Описание задачи.
     */
    private String description;

    /**
     * Конструктор инициализирует задачу.
     * @param number Номер задачи
     * @param description Описание задачи
     */
    public Task(String number, String description) {
        this.number = number;
        this.description = description;
    }

    /**
     * Метод возвращает номер задачи.
     * @return Номер задачи
     */
    public String getNumber() {
        return number;
    }
}
