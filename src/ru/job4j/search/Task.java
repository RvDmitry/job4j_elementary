package ru.job4j.search;

/**
 * Class Task
 * Класс описывает задачу.
 * @author Dmitry Razumov
 * @version 1
 */
public class Task {
    /**
     * Описание задачи.
     */
    private String desc;
    /**
     * Приоритет задачи.
     */
    private int priority;

    /**
     * Конструктор инициализирует задачу.
     * @param desc Описание задачи
     * @param priority Приоритет задачи
     */
    public Task(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }

    /**
     * Метод возвращает описание задачи.
     * @return Задача
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Метод возвращает приоритет задачи.
     * @return Приоритет
     */
    public int getPriority() {
        return priority;
    }
}
